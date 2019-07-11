package kr.green.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	
	//@RequestMapping(요청을 연결) - 서버 부분을 제외한 URL이 "/"고 방식이 get이면 home메서드를 실행
	@RequestMapping(value = "/", method = RequestMethod.GET)	//get방식으로 호출했을 떄 값과 일치하는 메서드를 호출
	public String home(Model model){
		logger.info("메인페이지 실행");	//console에 입력되는 메세지		
		
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

}
