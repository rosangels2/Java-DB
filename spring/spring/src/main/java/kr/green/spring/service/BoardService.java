package kr.green.spring.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import kr.green.spring.pagination.Criteria;
import kr.green.spring.vo.BoardVO;

public interface BoardService {

	ArrayList<BoardVO> getBoardList(Criteria cri);
	
	ArrayList<BoardVO> adminGetBoardList(Criteria cri);

	BoardVO getBoardContents(Integer num);
	
	public void updateViews(Integer num);

	boolean modify(BoardVO bVo, HttpServletRequest r);

	boolean register(BoardVO bVo);

	boolean boardDelete(Integer num);

	boolean isWriter(Integer num, HttpServletRequest r);

	int getTotalCount(Criteria cri);
	
	int adminGetTotalCount(Criteria cri);

	void modify(BoardVO bVo);
	
}
