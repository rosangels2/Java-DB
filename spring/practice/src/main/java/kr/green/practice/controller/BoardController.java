package kr.green.practice.controller;

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

import kr.green.practice.service.BoardService;
import kr.green.practice.utils.UploadFileUtils;
import kr.green.practice.vo.BoardVO;

@Controller
@RequestMapping(value = "/board")
public class BoardController {

	@Autowired
	BoardService boardService;
	@Resource
	private String uploadPath;
	
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
	public String BoardRegisterPost(Model model, BoardVO bVo, MultipartFile file2) throws IOException, Exception{
		if(file2.getOriginalFilename().length() != 0){
			String file = UploadFileUtils.uploadFile(uploadPath, file2.getOriginalFilename(),file2.getBytes());
			bVo.setFile(file);
			boardService.register(bVo);
			return "redirect:/board/list";
		}
		return "redirect:/board/register";
	}
	private String uploadFile(String name, byte[] data)	//첨부파일 업로드 메서드(매핑 없이 컨트롤러 내에서 자체적으로 실행)
			throws Exception{
			UUID uid = UUID.randomUUID();	//동일한 파일명이 있어도 중복되지 않게 구분해주는 식별자
			String savaName = uid.toString() + "_" + name;
			File target = new File(uploadPath, savaName);
			FileCopyUtils.copy(data, target);
			return savaName;
	}
	@RequestMapping(value = "modify", method = RequestMethod.GET)
	public String modifyGet(Model model, Integer num, HttpServletRequest r){
		boolean isWriter = boardService.isWriter(num, r);
		if(!isWriter){
			return "redirect:/board/list";
		}
		BoardVO bVo = boardService.getBoard(num);
		model.addAttribute("board", bVo);
		return "board/modify";
	}
	@RequestMapping(value = "modify", method = RequestMethod.POST)
	public String modifyPost(Model model, BoardVO bVo){
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
	@ResponseBody
	@RequestMapping("download")
	public ResponseEntity<byte[]> downloadFile(String fileName)throws Exception{
	    InputStream in = null;
	    ResponseEntity<byte[]> entity = null;
	    try{
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
