package kr.green.practice.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
	
}
