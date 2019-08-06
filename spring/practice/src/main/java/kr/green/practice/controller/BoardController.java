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
	@RequestMapping(value="register", method = RequestMethod.POST)
	public String BoardRegisterPost(Model model, BoardVO bVo){
		System.out.println(bVo);	//입력받은 정보가 제대로 출력되는지 확인
		if(boardService.register(bVo)){	//처리 결과에 따라 보여줄 jsp를 구분
			return "redirect:/board/list";
		}
		return "redirect:/board/register";
	}
	@RequestMapping(value = "modify", method = RequestMethod.GET)
	public String modifyGet(Model model, Integer num){
		System.out.println("board/modify num : " + num);
		BoardVO bVo = boardService.getBoard(num);
		System.out.println("board/modify bVo : " + bVo);
		model.addAttribute("board", bVo);
		return "board/modify";
	}
	@RequestMapping(value = "modify", method = RequestMethod.POST)
	public String modifyPost(Model model, BoardVO bVo){
		System.out.println("board/modify bVo : " + bVo);
		if(boardService.modify(bVo)){
			return "redirect:/board/list";
		}
		model.addAttribute("num", bVo.getNum());	//model의 변수 num에 bVo의 게시글 번호를 담아서 URI로 전송
		return "redirect:/board/modify";
	}
	@RequestMapping(value = "delete")
	public String delete(Model model, Integer num){
		System.out.println("board/delete num : " + num);
		if(boardService.delete(num)){
			return "redirect:/board/list";
		}
		model.addAttribute("num", num);	//model의 변수 num에 bVo의 게시글 번호를 담아서 URI로 전송
		return "redirect:/board/display";
	}
}