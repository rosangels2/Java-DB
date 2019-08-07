package kr.green.practice.service;

import kr.green.practice.vo.MemberVO;

public interface MemberService {

	boolean signup(MemberVO mVo);

	MemberVO signin(MemberVO mVo);

	boolean modify(MemberVO mVo, String oPw);

	String getVal(String str);

	boolean checkMember(String id, String email);

	void sendMail(String email, String title, String contents);

	String createPw();

	void modify(String id, String email, String newPw);

}
