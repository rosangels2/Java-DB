package kr.green.spring.dao;

import java.util.ArrayList;
import java.util.List;

import kr.green.spring.pagination.Criteria;
import kr.green.spring.vo.BoardVO;

public interface BoardDAO {

	ArrayList<BoardVO> getBoardList(Criteria cri);
	
	BoardVO getBoardContents(Integer num);
	
	void updateViews(Integer num);

	void updateBoard(BoardVO tmp);

	void register(BoardVO bVo);

	void boardDelete(Integer num);
	
	public List<BoardVO> listPage(Criteria cri); 

	int getTotalCount();
}
