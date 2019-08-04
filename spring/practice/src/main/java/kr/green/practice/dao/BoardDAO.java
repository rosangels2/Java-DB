package kr.green.practice.dao;

import java.util.ArrayList;

import kr.green.practice.vo.BoardVO;

public interface BoardDAO {

	ArrayList<BoardVO> getBoardList();

	BoardVO getBoard(Integer num);

	void updateViews(Integer num);

	void register(BoardVO bVo);

	void modify(BoardVO bVo);

	void delete(Integer num);

}
