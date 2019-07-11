package kr.green.spring.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.spring.dao.BoardDAO;
import kr.green.spring.vo.BoardVO;

@Service
public class BoardServiceImp implements BoardService{

	@Autowired
	BoardDAO boardDao;
	
	@Override
	public ArrayList<BoardVO> getBoardList() {
		
		return boardDao.getBoardList();
	}

	@Override
	public BoardVO getBoardContents(Integer num) {
		if(num == null) {
			return null;
		}
		BoardVO bVo = boardDao.getBoardContents(num);
		if(bVo == null) {
			return null;
		}
		boardDao.boardUpdate(num);
		return boardDao.getBoardContents(num);
	}

	@Override
	public void updateViews(Integer num) {
		
		BoardVO tmp = boardDao.getBoardContents(num);	//게시글에 맞는 객체를 가져와서 새로운 객체에 저장
		if(tmp != null) {	//객체가 비어있지 않다면
			int oldViews = tmp.getViews();	//가져온 객체의 조회수를 변수에 저장 
			tmp.setViews(oldViews+1);	//setter를 통해 조회수를 기존에서 +1증가한 값으로 변경
			boardDao.updateBoard(tmp);	//DAO의 메서드를 선언한 뒤 quick fixed를 통해 인터페이스를 생성
		}
	}


}
