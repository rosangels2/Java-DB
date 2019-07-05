package kr.green.spring.dao;

import kr.green.spring.vo.MemberVO;

public interface MemberDAO{

	MemberVO getMember(String id);	//id를 입력하면 해당 id를 가진 memberVO의 객체를 가져오는 함수

	void signup(MemberVO mVo);

	void modify(MemberVO mVo);
	
}
