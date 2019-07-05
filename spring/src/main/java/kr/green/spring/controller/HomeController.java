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
	
	@Autowired
	MemberService memberService;
	
	@Autowired	//생성자를 대신 사용해주는 기능(하나의 객체를 만들어서 해당 클래스의 객체를 사용할 때 자동 연결)
	MemberDAO stdDao;
	
	//@RequestMapping(요청을 연결) - 서버 부분을 제외한 URL이 /고 방식이 get이면 home 메서드를 실행
	@RequestMapping(value = "/", method = RequestMethod.GET)	//get방식으로 호출했을 떄 값과 일치하는 메서드를 호출
	public String home(Model model){
		logger.info("메인페이지 실행");	//console에 입력되는 메세지
		
		
		return "home";	//사용자에게 home.jsp를 보내준다
	}
	
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)	//get 방식으로 호출했을 떄 값과 일치하는 메서드를 호출
	public String signupGet(Model model){
		logger.info("회원가입 진행중");
		
		return "signup";
	}
	@RequestMapping(value = "/signup", method = RequestMethod.POST)	//post 방식으로 호출했을 떄 값과 일치하는 메서드를 호출
	public String signupPost(MemberVO mVo){
		logger.info("회원가입 진행중");
		
		if(memberService.signup(mVo)) {
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
		System.out.println(mVo);	//입력한 정보가 제대로 가져오는지 확인
		if(memberService.signin(mVo)){
			return "redirect:/";
		}
		return "redirect:/signin";
	}
}
