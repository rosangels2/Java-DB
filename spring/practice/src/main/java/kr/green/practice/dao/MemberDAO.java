package kr.green.practice.dao;

import kr.green.practice.vo.MemberVO;

public interface MemberDAO {

	boolean signup(MemberVO mVo);

	MemberVO getMember(String id);

	void modify(MemberVO mVo);

}
