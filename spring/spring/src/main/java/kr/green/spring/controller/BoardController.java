package kr.green.spring.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.green.spring.dao.BoardDAO;
import kr.green.spring.pagination.Criteria;
import kr.green.spring.pagination.PageMaker;
import kr.green.spring.service.BoardService;
import kr.green.spring.vo.BoardVO;

@Controller
@RequestMapping(value = "/board")	//URI에 /board가 붙는 모든 페이지를 연결
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	BoardService boardService;
	@Autowired
	BoardDAO boardDao;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String boardListGet(Model model, Criteria cri){	//Criteria의 기본 생성자를 통해 객체를 생성
/*		logger.info("게시판 리스트 진행");
		//ArrayList<BoardVO> boardList = boardService.getBoardList();	//boardService클래스의 getBoardList 인터페이스를 호출해 결과값을 저장
		for(BoardVO tmp:boardList) {	//향상된 포문으로 BoardVo클래스의 객체 boardList의 값을 하나씩 꺼냄 
			System.out.println(tmp);	//꺼낸 값을 출력
		}
*/		//model.addAttribute("list", boardList);	//변수 리스트에 boardList를 추가하여 jsp에서 사용
		
		cri.setPerPageNum(5);	//보여줄 게시글 개수를 5로 재설정
		ArrayList<BoardVO> boardList = boardService.getBoardList(cri);	//boardService클래스의 getBoardList 인터페이스를 호출해 결과값을 저장 
	    PageMaker pM = new PageMaker();	//pageMaker 객체를 생성 후 복사
	    pM.setCriteria(cri);		//보여줄 게시글들의 설정을 수정
	    pM.setDisplayPageNum(5);	//페이지네이션의 개수를 설정
	    int totalCount = boardService.getTotalCount();	//총 게시글 수를 계산하여 변수에 저장
	    pM.setTotalCount(totalCount);	//페이지네이션을 계산하기 위해 총 게시글 수를 수정
	    model.addAttribute("pageMaker", pM);	//pageMaker의 객체를 model의 변수에 저장
	    model.addAttribute("list", boardList);	//limit 설정에 맞는 게시글들을 가져와 model의 변수에 저장하여 jsp에서 사용
	    return "/board/list";
	}
	@RequestMapping(value = "/display", method = RequestMethod.GET)
	public String boardDisplayGet(Model model, Integer num){	//URI의 ? 뒤에 있는 변수명을 매개변수로 사용하여 URI의 값을 가져올 수 있다
		logger.info("게시판 페이지 진행");
	
		BoardVO bVo = boardService.getBoardContents(num);	//BoardService의 객체.메서드명(매개변수)를 통해 해당 클래스의 메서드를 호출하고 결과값을 VO객체에 저장
		
		model.addAttribute("board", bVo);	//jsp에서 변수를 호출하여 사용하기 위해 변수 board를 생성해 VO객체 bVo를 저장
		
		return "/board/display";
	}
	@RequestMapping(value="modify", method = RequestMethod.GET)
	public String boardModifyGet(Model model, Integer num, HttpServletRequest r){
		logger.info("게시글 수정 진행");
		if(!boardService.isWriter(num, r)){
			return "redirect:/board/list";
		}
		BoardVO bVo = boardService.getBoardContents(num);	//BoardService의 객체.메서드명(매개변수)를 통해 해당 클래스의 메서드를 호출하고 결과값을 VO객체에 저장
		model.addAttribute("board", bVo);	//jsp에서 변수를 호출하여 사용하기 위해 변수 board를 생성해 VO객체 bVo를 저장
		
		return "/board/modify";
	}
	@RequestMapping(value="modify", method = RequestMethod.POST)
	public String boardModifyPost(Model model, BoardVO bVo, HttpServletRequest r){
		logger.info("게시글 수정 진행 중");
		model.addAttribute("num", bVo.getNum());	//model.addAttribute를 통해 변수를 모델에 담아서 보내면 다른 매핑에서 해당 변수를 매개변수로 사용 가능
		if(!boardService.isWriter(bVo.getNum(), r)){
			return "redirect:/board/list";
		}
		boardService.modify(bVo, r);
		return "redirect:/board/display";
	}
	@RequestMapping(value="register", method = RequestMethod.GET)
	public String BoardRegisterGet(){
		logger.info("게시글 등록 진행");
		return "board/register";
	}
	@RequestMapping(value="register", method = RequestMethod.POST)
	public String BoardRegisterPost(BoardVO bVo){
		System.out.println(bVo);
		if(boardService.register(bVo)){
			return "redirect:/board/list";
		}
		return "redirect:/board/register";
	}
	@RequestMapping(value="delete")
	public String BoardDeletePost(Integer num, HttpServletRequest r){
		if(boardService.isWriter(num, r)){
			boardService.boardDelete(num);
			return "redirect:/board/list";
		}
		return "redirect:/board/list";
	}
}
