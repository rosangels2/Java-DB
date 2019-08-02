package kr.green.practice.service;

import kr.green.practice.vo.MemberVO;

public interface MemberService {

	boolean signup(MemberVO mVo);

	MemberVO signin(MemberVO mVo);

	boolean modify(MemberVO mVo, String oPw);

}
