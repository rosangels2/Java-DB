package kr.green.spring.dao;

import java.util.ArrayList;
import java.util.List;

import kr.green.spring.pagination.Criteria;
import kr.green.spring.vo.BoardVO;

public interface BoardDAO {

	ArrayList<BoardVO> getBoardList(Criteria cri);
	
	ArrayList<BoardVO> adminGetBoardList(Criteria cri);
	
	BoardVO getBoardContents(Integer num);
	
	BoardVO adminGetBoardContents(Integer num);
	
	void updateViews(Integer num);

	void updateBoard(BoardVO tmp);

	void register(BoardVO bVo);

	void boardDelete(Integer num);
	
	int getTotalCount(Criteria cri);
	
	int adminGetTotalCount(Criteria cri);

	void validModify(BoardVO bVo);
}