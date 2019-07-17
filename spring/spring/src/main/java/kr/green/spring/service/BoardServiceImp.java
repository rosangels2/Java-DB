package kr.green.spring.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.spring.dao.BoardDAO;
import kr.green.spring.pagination.Criteria;
import kr.green.spring.vo.BoardVO;
import kr.green.spring.vo.MemberVO;

@Service
public class BoardServiceImp implements BoardService{

	@Autowired
	BoardDAO boardDao;
	
	@Override
	public ArrayList<BoardVO> getBoardList(Criteria cri) {
		
		return boardDao.getBoardList(cri);
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
		boardDao.updateViews(num);
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

	@Override
	public boolean modify(BoardVO bVo, HttpServletRequest r) {
		MemberVO user = (MemberVO)r.getSession().getAttribute("user");
		if(user == null || bVo == null){	//세션이 비어있거나 객체가 비어 있다면
			return false;
		}
		if(bVo.getWriter() != null && bVo.getWriter().equals(user.getId())){	//작성자가 null이 아니고 수정글의 작성자와 원본글 작성자가 같으면
			boardDao.updateBoard(bVo);
			return true;
		}
		return false;
		
/*		if(bVo == null) {	//내 방식 - 예외처리(값이 공백이거나 그대로일 때 수정하지 않고 그대로 유지)
			return false;
		}
		BoardVO oldbVo = boardDao.getBoardContents(bVo.getNum());
		
		if(oldbVo == null){
			return false;
		}
		if(bVo.getTitle() == null || bVo.getTitle() == "" || bVo.getTitle().equals(oldbVo.getTitle())){
			bVo.setTitle(oldbVo.getTitle());
		}
		if(bVo.getContents() == null || bVo.getContents() == "" || bVo.getContents().equals(oldbVo.getContents())){
			bVo.setContents(oldbVo.getContents());
		}
		if(bVo.getFile() == null || bVo.getFile() == "" || bVo.getFile().equals(oldbVo.getFile())){
			bVo.setFile(oldbVo.getFile());
		}	
		boardDao.updateBoard(bVo);
		return true;
*/
	}

	@Override
	public boolean register(BoardVO bVo) {
		if(bVo == null){
			return false;
		}
		if(bVo.getFile() == null || bVo.getFile() == ""){
			bVo.setFile("");
		}
		if(bVo.getTitle() == null || bVo.getTitle() == "") {
			bVo.setTitle("제목 없음");
		}
		boardDao.register(bVo);
		return true;		
	}

	@Override
	public boolean boardDelete(Integer num) {
		if(num == null || num < 0) {
			return false;
		}
		boardDao.boardDelete(num);
		return true;
	}

	@Override
	public boolean isWriter(Integer num, HttpServletRequest r){
		MemberVO user = (MemberVO)r.getSession().getAttribute("user");
		BoardVO bVo = boardDao.getBoardContents(num);
		if(bVo == null || user == null){
			return false;
		}
		if(bVo.getWriter() != null && bVo.getWriter().equals(user.getId())){	//DB에서 Not null로 체크했기 때문에 null인지 확인할 필요 x
			return true;
		}
		return false;
	}

	@Override
	public int getTotalCount(Criteria cri) {
		return boardDao.getTotalCount(cri);
	}

}
