package kr.green.practice.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import kr.green.practice.vo.BoardVO;

public interface BoardService {

	ArrayList<BoardVO> getBoardList();

	BoardVO getBoard(Integer num);

	boolean register(BoardVO bVo);

	boolean modify(BoardVO bVo);

	public boolean isWriter(Integer num, HttpServletRequest r);
	
	boolean delete(Integer num);

}
