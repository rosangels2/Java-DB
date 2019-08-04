package kr.green.practice.service;

import java.util.ArrayList;

import kr.green.practice.vo.BoardVO;

public interface BoardService {

	ArrayList<BoardVO> getBoardList();

	BoardVO getBoard(Integer num);

	boolean register(BoardVO bVo);

	boolean modify(BoardVO bVo);

	boolean delete(Integer num);

}
