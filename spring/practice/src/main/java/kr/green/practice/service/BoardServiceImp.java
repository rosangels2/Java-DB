package kr.green.practice.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.practice.dao.BoardDAO;
import kr.green.practice.vo.BoardVO;

@Service
public class BoardServiceImp implements BoardService{

	@Autowired
	BoardDAO boardDao;
	
	@Override
	public ArrayList<BoardVO> getBoardList() {

		return boardDao.getBoardList();
	}

	@Override
	public BoardVO getBoard(Integer num) {
		BoardVO bVo = boardDao.getBoard(num);
		if(bVo == null){
			return null;
		}
		boardDao.updateViews(num);
		return boardDao.getBoard(num);
	}

}
