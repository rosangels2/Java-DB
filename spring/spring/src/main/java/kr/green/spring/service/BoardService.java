package kr.green.spring.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import kr.green.spring.vo.BoardVO;

public interface BoardService {

	ArrayList<BoardVO> getBoardList();

	BoardVO getBoardContents(Integer num);
	
	public void updateViews(Integer num);

	boolean modify(BoardVO bVo, HttpServletRequest r);

	boolean register(BoardVO bVo);
	
}
