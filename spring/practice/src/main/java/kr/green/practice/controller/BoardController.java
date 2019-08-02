package kr.green.practice.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.green.practice.service.BoardService;
import kr.green.practice.vo.BoardVO;

@Controller
@RequestMapping(value = "/board")
public class BoardController {

	@Autowired
	BoardService boardService;
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@RequestMapping(value="/list", method = RequestMethod.GET)
	public String list(Model model){
		ArrayList<BoardVO> list = boardService.getBoardList();
		System.out.println("board/list list : " + list);
		model.addAttribute("list", list);
		return "board/list";
	}
	
}
