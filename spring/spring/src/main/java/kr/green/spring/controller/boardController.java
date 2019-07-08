package kr.green.spring.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.green.spring.service.BoardService;
import kr.green.spring.vo.BoardVO;

@Controller
@RequestMapping(value = "/board")	//URI에 /board가 붙는 모든 페이지를 연결
public class boardController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	BoardService boardService;
	
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String boardListGet(Model model) {
		
		logger.info("게시판 리스트 진행");
		
		ArrayList<BoardVO> boardList = boardService.getBoardList();	//boardService클래스의 getBoardList 인터페이스를 호출해 결과갑을 저장
		
/*		for(BoardVO tmp:boardList) {	//향상된 포문으로 BoardVo클래스의 객체 boardList의 값을 하나씩 꺼냄 
			System.out.println(tmp);	//꺼낸 값을 출력
		}
*/		
		model.addAttribute("list", boardList);	//변수 리스트에 boardList를 추가하여 jsp에서 사용
		
		return "/board/list";
	}
	@RequestMapping(value = "/display", method = RequestMethod.GET)
	public String boardDisplayGet(Model model, Integer num){
		
		logger.info("게시판 페이지 진행");
	
		BoardVO bVo = boardService.getBoard(num);
		
		model.addAttribute("board", bVo);
		
		return "/board/display";
	}
	
}
