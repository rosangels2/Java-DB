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
	@RequestMapping(value = "/display", method = RequestMethod.GET)
	public String display(Model model, BoardVO bVo){
		System.out.println("board/display bVo : " + bVo);
		BoardVO board = boardService.getBoard(bVo.getNum());
		System.out.println("board/display board : " + board);
		model.addAttribute("board", board);
		return "board/display";
	}
	@RequestMapping(value = "register", method = RequestMethod.GET)
	public String register(Model model){
		
		return "board/register";
	}
}
