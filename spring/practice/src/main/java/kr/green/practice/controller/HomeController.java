package kr.green.practice.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.green.practice.dao.MemberDAO;
import kr.green.practice.service.MemberService;
import kr.green.practice.vo.MemberVO;

@Controller
public class HomeController {
	
	@Autowired
	MemberService memberService;
	@Autowired
	MemberDAO memberDao;
	@Autowired
	private JavaMailSender mailSender;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	//홈
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home( Model model) {
		
		return "home";
	}
	//회원가입
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signupGet(Model model) {
		
		return "signup";
	}
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signupPost(Model model, MemberVO mVo){
		System.out.println("signup mVo : " + mVo);
		if(memberService.signup(mVo)) {
			return "redirect:/";
		}
		return "redirect:/signup";
	}
	//로그인
	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public String signinGet(Model model) {
		
		return "signin";
	}
	@RequestMapping(value = "/signin", method = RequestMethod.POST)
	public String signinPost(Model model, MemberVO mVo) {
		System.out.println("signin mVo : " + mVo);
		MemberVO user = memberService.signin(mVo);
		System.out.println("signin user : " + user);
		if(user == null){
			return "redirect:/signin";
		}
		model.addAttribute("user", user);
		return "redirect:/";
	}
	//회원 정보 수정
	@RequestMapping(value = "/member/modify", method = RequestMethod.GET)
	public String modifyGet(Model model) {
		
		return "member/modify";
	}
	@RequestMapping(value = "/member/modify", method = RequestMethod.POST)
	public String modifyPost(Model model, MemberVO mVo, String oPw) {
		System.out.println("modify mVo : " + mVo);
		System.out.println("modify oPw : " + oPw);
		if(memberService.modify(mVo, oPw)){
			return "redirect:/";
		}
		return "redirect:/member/modify";
	}
	//id 중복검사
	@RequestMapping(value ="/dup")	//id 중복검사를 위한 메서드 매핑
	@ResponseBody
	public Map<Object, Object> idcheck(@RequestBody String id){
	    Map<Object, Object> map = new HashMap<Object, Object>();
	    boolean isMember =  true;	//변수 초기화
	    MemberVO mVo = memberDao.getMember(id);
	    System.out.println("ajax mVo : " + mVo);
	    if(mVo == null){
	    	isMember = false;	//일치하는 회원이 없다
	    }else{
	    	isMember = true;	//일치하는 회원이 있다
	    }
	    map.put("isMember", isMember);	//돌려줄 정보를 map의 변수로 입력하고 map을 반환
	    return map;
	}
	//메일 보내기
	@RequestMapping(value = "/mail/mailForm")
	public String mailForm() {

	    return "mail";
	}  
	// mailSending 코드
	@RequestMapping(value = "/mail/mailSending")
	public String mailSending(HttpServletRequest request) {

	    String setfrom = "stajun@naver.com";         
	    String tomail  = request.getParameter("tomail");     // 받는 사람 이메일
	    String title   = request.getParameter("title");      // 제목
	    String content = request.getParameter("content");    // 내용

	    try {
	        MimeMessage message = mailSender.createMimeMessage();
	        MimeMessageHelper messageHelper 
	            = new MimeMessageHelper(message, true, "UTF-8");

	        messageHelper.setFrom(setfrom);  // 보내는사람 생략하거나 하면 정상작동을 안함
	        messageHelper.setTo(tomail);     // 받는사람 이메일
	        messageHelper.setSubject(title); // 메일제목은 생략이 가능하다
	        messageHelper.setText(content);  // 메일 내용

	        mailSender.send(message);
	    } catch(Exception e){
	        System.out.println(e);
	    }

	    return "redirect:/mail/mailForm";
	}	
	//비밀번호 찾기
	@RequestMapping(value = "/member/find")
	public String passwordFind() {
	    return "member/find";
	}
	//비밀번호 찾기 이메일 인증
	@RequestMapping(value ="/checkemail")
	@ResponseBody
	public Map<Object, Object> emailcheck(@RequestBody String str){
	    Map<Object, Object> map = new HashMap<Object, Object>();
	    System.out.println("emailcheck str : " + str);
	    String [] arr = str.split("&");	//전송된 정보를 &을 기준으로 구분하여 나눠 배열에 저장
	    String id = arr[0];	//&을 기준으로 앞쪽의 0번지값을 String객체 id에 저장한다
	    String email = "";	//빈 문자열 객체를 생성
	    try {
			email=URLDecoder.decode(arr[1], "UTF-8");	//인코딩 돼 깨진 email값을 decode 메서드로 복원
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	    System.out.println("emailcheck decode id, email : " + id + " , " + email);
	    id = memberService.getVal(id);	//id=xxx 형식의 값에서 id=를 빼고 xxx만을 가져오는 인터페이스 호출 후 결과값을 저장
	    email = memberService.getVal(email);	//email=xxx 형식의 값에서 email=를 빼고 xxx만을 가져오는 인터페이스 호출 후 결과값을 저장
	    System.out.println("emailcheck getVal id, email : " + id + " , " + email);
	    
	    boolean isOk = memberService.checkMember(id,email);	//입력받은 id와 email이 회원 정보와 일치하는지 확인하고 결과를 boolean 변수에 저장
	    System.out.println("emailcheck checkMember isOk = " + isOk);
	    map.put("isOk", isOk);
	    return map;	//map 정보를 ajax에 반환
	}
	//이메일 발급
	@RequestMapping(value = "/password/send")
	public String passwordSend(String id,String email) {
		String newPw = memberService.createPw();
		System.out.println("password/send newPw : " + newPw);
		String title = "변경된 비밀번호입니다.";
		String contents = "변경된 비밀번호 : " + newPw;
		memberService.sendMail(email,title,contents);	//변경된 값을 통해 email을 전송하는 서비스 인터페이스 호출
		memberService.modify(id, email, newPw);	//임시 비밀번호로 비밀번호를 변경
		return "redirect:/"; 
	}
	
}
