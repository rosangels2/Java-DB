package kr.green.spring.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import kr.green.spring.dao.BoardDAO;
import kr.green.spring.pagination.Criteria;
import kr.green.spring.pagination.PageMaker;
import kr.green.spring.service.BoardService;
import kr.green.spring.service.PageMakerService;
import kr.green.spring.utils.UploadFileUtils;
import kr.green.spring.vo.BoardVO;

@Controller
@RequestMapping(value = "/board")	//URI에 /board가 붙는 모든 페이지를 연결
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	BoardService boardService;
	@Autowired
	BoardDAO boardDao;
	@Autowired
	PageMakerService pageMakerService;
	
	@Resource	//해당 id를 가진 beans의 경로를 호출
	private String uploadPath;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String boardListGet(Model model, Criteria cri){	//Criteria의 기본 생성자를 통해 객체를 생성
		logger.info("게시판 리스트 진행");
/*		ArrayList<BoardVO> boardList = boardService.getBoardList();	//boardService클래스의 getBoardList 인터페이스를 호출해 결과값을 저장
		for(BoardVO tmp:boardList) {	//향상된 포문으로 BoardVo클래스의 객체 boardList의 값을 하나씩 꺼냄 
			System.out.println(tmp);	//꺼낸 값을 출력
		}
		model.addAttribute("list", boardList);	//변수 리스트에 boardList를 추가하여 jsp에서 사용
*/		
		System.out.println(cri);

		ArrayList<BoardVO> boardList = boardService.getBoardList(cri);	//boardService클래스의 getBoardList 인터페이스를 호출해 결과값을 저장
	    int totalCount = boardService.getTotalCount(cri);	//총 게시글 수를 계산하여 변수에 저장
	    PageMaker pm = pageMakerService.getPageMaker(5, cri, totalCount);
	    model.addAttribute("pageMaker", pm);	//pageMaker의 객체를 model의 변수에 저장
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
	public String boardModifyPost(Model model, BoardVO bVo, HttpServletRequest r, MultipartFile file2) throws IOException, Exception{
		logger.info("게시글 수정 진행 중");
		if(!boardService.isWriter(bVo.getNum(), r)){
			return "redirect:/board/list";
		}
		if(file2.getOriginalFilename().length() != 0){
			String file  = UploadFileUtils.uploadFile(uploadPath, file2.getOriginalFilename(),file2.getBytes());
			bVo.setFile(file);
		}else{	//첨부파일에 추가한 파일이 없는 경우
			if(bVo.getFile().length() == 0){
				bVo.setFile("");				
			}else {
				BoardVO tmp = boardService.getBoardContents(bVo.getNum());
				bVo.setFile(tmp.getFile());
			}
		}
		boardService.modify(bVo, r);
		model.addAttribute("num", bVo.getNum());	//model.addAttribute를 통해 변수를 모델에 담아서 보내면 다른 매핑에서 해당 변수를 매개변수로 사용 가능
		return "redirect:/board/display";
	}
	@RequestMapping(value="register", method = RequestMethod.GET)
	public String BoardRegisterGet(){
		logger.info("게시글 등록 진행");
		return "board/register";
	}
	@RequestMapping(value="register", method = RequestMethod.POST)
	public String BoardRegisterPost(MultipartFile file2, BoardVO bVo) throws IOException, Exception{
		if(file2.getOriginalFilename().length() != 0){
			String file  = UploadFileUtils.uploadFile(uploadPath, file2.getOriginalFilename(),file2.getBytes());
			bVo.setFile(file);
			boardService.register(bVo);		//첨부파일을 먼저 작업하지 않고 게시글을 등록할 경우 NullPointerException 발생 가능
			return "redirect:/board/list";
		}else{
			bVo.setFile("");
			boardService.register(bVo);		//첨부파일을 먼저 작업하지 않고 게시글을 등록할 경우 NullPointerException 발생 가능
			return "redirect:/board/list";
		}

	}
	@RequestMapping(value="delete")
	public String BoardDeletePost(Integer num, HttpServletRequest r){
		if(boardService.isWriter(num, r)){
			boardService.boardDelete(num);
			return "redirect:/board/list";
		}
		return "redirect:/board/list";
	}
	//다운로드
	@ResponseBody
	@RequestMapping("/download")
	public ResponseEntity<byte[]> downloadFile(String fileName)throws Exception{
	    InputStream in = null;
	    ResponseEntity<byte[]> entity = null;
	    try{
	        String FormatName = fileName.substring(fileName.lastIndexOf(".")+1);
	        HttpHeaders headers = new HttpHeaders();
	        in = new FileInputStream(uploadPath+fileName);

	        fileName = fileName.substring(fileName.indexOf("_")+1);
	        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
	        headers.add("Content-Disposition",  "attachment; filename=\"" 
				+ new String(fileName.getBytes("UTF-8"), "ISO-8859-1")+"\"");
	        entity = new ResponseEntity<byte[]>(IOUtils.toByteArray(in),headers,HttpStatus.CREATED);
	    }catch(Exception e) {
	        e.printStackTrace();
	        entity = new ResponseEntity<byte[]>(HttpStatus.BAD_REQUEST);
	    }finally {
	        in.close();
	    }
	    return entity;
	}
	
}
