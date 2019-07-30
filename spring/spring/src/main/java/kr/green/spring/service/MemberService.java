package kr.green.spring.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import kr.green.spring.pagination.Criteria;
import kr.green.spring.vo.MemberVO;

public interface MemberService {
	
	public boolean signup(MemberVO mVo, String pw1);	//기존에 아이디가 있어 가입에 실패했을 경우 false

	public MemberVO signin(MemberVO mVo);
	
	public MemberVO modify(MemberVO mVo, String oPw, String pw1);
	
	public boolean isMember(String id);		//아이디가 중복되는지 확인
	
	public String getVal(String str);	//입력받은 값에서 실제 값만을 추출	예시)id=xxx > xxx추출
	
	public String createPw();	//새 비밀번호를 랜덤으로 생성
	
	public void modify(String id, String email, String newPw);		//새 비밀번호를 랜덤으로 생성해 암호화한 뒤 회원 정보를 수정
	
	public boolean checkMember(String id, String email);	//회원정보와 입력한 email이 일치하는지 확인
	
	public void sendMail(String email, String title, String contents);	//매개변수를 입력받아 email을 전송하는 인터페이스

	public boolean updateUserToSession(HttpServletRequest r, MemberVO nUser);

	public ArrayList<MemberVO> getUserList(Criteria cri);

	public int getTotalCount(Criteria cri);

	public void modify(MemberVO mVo);
	
}