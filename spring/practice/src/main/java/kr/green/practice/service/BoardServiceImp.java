package kr.green.practice.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.practice.dao.BoardDAO;
import kr.green.practice.vo.BoardVO;
import kr.green.practice.vo.MemberVO;

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

	@Override
	public boolean register(BoardVO bVo) {
		if(bVo == null){
			return false;
		}
		boardDao.register(bVo);
		return true;
	}

	@Override
	public boolean modify(BoardVO bVo) {
		if(bVo == null) {
			return false;
		}
		boardDao.modify(bVo);
		return true;
	}
	
	@Override
	public boolean isWriter(Integer num, HttpServletRequest r) {
		BoardVO board = boardDao.getBoard(num);
		MemberVO user = (MemberVO)(r.getSession().getAttribute("user"));
		if(board != null && board.getWriter().equals(user.getId())) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(Integer num) {
		if(num == null){
			return false;
		}
		boardDao.delete(num);
		return true;
	}

}
