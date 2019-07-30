package kr.green.spring.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.green.spring.pagination.Criteria;
import kr.green.spring.pagination.PageMaker;
import kr.green.spring.service.MemberService;
import kr.green.spring.service.PageMakerService;
import kr.green.spring.vo.MemberVO;

@Controller
@RequestMapping(value="/admin")
public class AdminController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	MemberService memberService;
	@Autowired
	PageMakerService pageMakerService;
	
	@RequestMapping(value = "/user/list")
	public String userListGet(Model model, Criteria cri){
		logger.info("회원 리스트 확인");
		System.out.println("회원 리스트 확인 cri : " + cri);
		ArrayList<MemberVO> userList = memberService.getUserList(cri);
	    int totalCount = memberService.getTotalCount(cri);
		PageMaker pm = pageMakerService.getPageMaker(5, cri, totalCount);
	    model.addAttribute("pageMaker", pm);	//pageMaker의 객체를 model의 변수에 저장	
		model.addAttribute("userList", userList);
		return "admin/user/list";
	}
	@RequestMapping(value = "/user/modify")
	public String adminUserModify(Model model, MemberVO mVo, Criteria cri){
		System.out.println(mVo);
		memberService.modify(mVo);
		model.addAttribute("type", cri.getType());
		model.addAttribute("search", cri.getSearch());
		model.addAttribute("perPageNum", cri.getPerPageNum());
		model.addAttribute("page", cri.getPage());
		return "redirect:/admin/user/list";
	}
	
}
