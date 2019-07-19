package kr.green.spring.controller;

import java.util.HashMap;
import java.util.Map;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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

import kr.green.spring.dao.MemberDAO;
import kr.green.spring.service.MemberService;
import kr.green.spring.vo.MemberVO;

@Controller	//annotation - 입력하면 controller로 인식(없을 경우 일반 클래스로 인식)
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	//실행된 클래스와 컨트롤러를 확인하기 위해 현재 정보를 상수인 클래스 멤버변수에 저장
	
	@Autowired
	MemberService memberService;	//memberService의 객체 생성
	@Autowired	//생성자를 대신 사용해주는 기능(하나의 객체를 만들어서 해당 클래스의 객체를 사용할 때 자동 연결)
	MemberDAO stdDao;	//memberDAO의 객체를 생성
	@Autowired
	private JavaMailSender mailSender;
	
	//@RequestMapping(요청을 연결) - 서버 부분을 제외한 URL이 "/"고 방식이 get이면 home메서드를 실행
	@RequestMapping(value = "/", method = RequestMethod.GET)	//get방식으로 호출했을 떄 값과 일치하는 메서드를 호출
	public String home(Model model){
		logger.info("메인페이지 실행");	//console에 입력되는 메세지		
		
		//방법1 - char[] 사용 시 출력할 떄 toString에서 원하지 않는 값이 출력될 수 있다
		char[] pw = new char[8];
		for(int i=0 ; i<8 ; i++){
			int r = (int)(Math.random()*62);
			if(r <= 9){
				pw[i] = (char)('0'+r);
			}else if(r <= 35){
				pw[i] = (char)('a'+(r-10));	//아스키 코드값이 연속적인 걸 이용
			}else{
				pw[i] = (char)('A'+(r-36));
			}
		}
		System.out.println("pw = " + pw);
		//방법2 - char[] 사용 시 출력할 떄 toString에서 원하지 않는 값이 출력될 수 있다
		char[] pw1 = new char[]{0,1,2,3,4,5,6,7,8,9,'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		char[] password = new char[8];
		for(int i=0 ; i<8 ; i++){
			int r = (int)(Math.random()*62);
			password[i] = pw1[r-1];
		}
		System.out.println("pw1 = " + pw1);
		//방법3
		String str = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String pw2 = "";
		for(int i=0 ; i<8 ; i++){
			int r = (int)(Math.random()*62);
			pw2 += str.charAt(r);
		}
		System.out.println("pw2 = " + pw2);
		
		return "home";	//사용자에게 home.jsp를 보내준다
	}
	@RequestMapping(value = "/signup", method = RequestMethod.GET)	//화면에 표시되는 페이지는 get방식
	public String signupGet(Model model){
		logger.info("회원가입 진행중");
		
		return "signup";
	}
	@RequestMapping(value = "/signup", method = RequestMethod.POST)	//post 방식으로 호출했을 떄 값과 일치하는 메서드를 호출
	public String signupPost(MemberVO mVo, String pw1){
		logger.info("회원가입 진행중");
		
		if(memberService.signup(mVo,pw1)) {
			return "redirect:/";	//회원가입에 성공하면 메인 페이지로 이동
		}else {
			return "redirect:/signup";	//redirect - 실행 후 get방식으로 재실행(value값이 동일한 매핑에서 get 방식은 1개만 존재해야 한다)
		}
	}
	
	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public String signinGet(Model model){
		logger.info("로그인 페이지 실행");
		
		return "signin";
	}
	@RequestMapping(value = "/signin", method = RequestMethod.POST)
	public String signinPost(Model model, MemberVO mVo){
		logger.info("로그인 진행 중");
		System.out.println(mVo);	//입력한 정보를 제대로 가져오는지 확인
		MemberVO user = memberService.signin(mVo);	//객체 mVo를 매개변수로 사용한 signin 함수를 호출하여 결과는 객체 user에 저장한다
		if(user != null){	//user가 null이 아니라면(로그인에 성공했다면)
			model.addAttribute("user", user);	//interceptor에게 전해주기 위해 변수 user에 객체 user를 저장한다
			return "redirect:/member"; //로그인 성공 시 member.jsp로 이동
		}
		return "redirect:/signin";
	}
	@RequestMapping(value = "/member", method = RequestMethod.GET)	// URL값이 /member면 실행
	public String member(){
		logger.info("로그인 중");
		
		return "member";	//member.jsp를 실행
	}
	@RequestMapping(value = "/member/modify", method = RequestMethod.GET)
	public String loginGet(){
		logger.info("정보 수정 진행");
		
		return "/member/modify";	//get 방식은 보여줄 페이지와 경로가 일치하는 jsp를 반환
	}
	@RequestMapping(value = "/member/modify", method = RequestMethod.POST)
	public String loginPost(Model model, MemberVO mVo, String oPw, String pw1){
		logger.info("정보 수정 진행 중");
		
		if(memberService.modify(mVo,oPw,pw1)){	//Mapper까지 실행한 후 결과값에 따라 홈페이지를 리턴
			System.out.println(mVo.getPw()+""+pw1);
			return "redirect:/member";
		}else {
			return "redirect:/member/modify";
		}
	}
	@RequestMapping(value="/signout")	//로그아웃 기능
	public String signout(HttpServletRequest request){
		HttpSession session = request.getSession();	//현재 페이지의 요청에서 세션을 가져와 새로운 객체 세션에 저장
		session.removeAttribute("user");	//세션에서 user값을 제거
		
		return "redirect:/";
	}
	
	@RequestMapping(value ="/dup")	//id 중복검사를 위한 메서드 매핑
	@ResponseBody
	public Map<Object, Object> idcheck(@RequestBody String id){
	    Map<Object, Object> map = new HashMap<Object, Object>();
	    boolean isMember =  true;	//플래그 선언
	    if(stdDao.getMember(id) == null){	//id와 일치하는 MemberVO 객체를 가져오지 못했을 경우
	    	isMember = false;	//일치하는 회원이 없다고 판단
	    }else{	//id와 일치하는 MemberVO 객체를 가져왔을 경우
	    	isMember = true;	//일치하는 회원이 있다고 판단
	    }
	    map.put("isMember", isMember);	//돌려줄 정보를 map의 변수에 저장
	    return map;
	}
	
	
	@RequestMapping(value = "/mail/mailForm")
	public String mailForm(){

	    return "mail";
	}
	@RequestMapping(value = "/mail/mailSending")	//메일 보내기 코드
	public String mailSending(HttpServletRequest request) {

	    String setfrom = "abc12345678@naver.com";         
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
	@RequestMapping(value = "pwSearch")
	public String pwSearch(Model model, String id, HttpServletRequest request){
		String str = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String pw2 = "";
		for(int i=0 ; i<8 ; i++){
			int r = (int)(Math.random()*62);
			pw2 += str.charAt(r);
		}
		System.out.println(pw2);
		if(memberService.pwSearch(id, pw2)){
			String setfrom = "abc12345678@naver.com";         
		    String tomail  = "rosangels2@naver.com";     // 받는 사람 이메일
		    String title   = "임시 비밀번호 발급";      // 제목
		    String content = pw2;    // 내용

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
			return "redirect:/";
		}
		return "redirect:/";
	}
}
