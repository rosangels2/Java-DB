package kr.green.practice.dao;

import kr.green.practice.vo.MemberVO;

public interface MemberDAO {

	boolean signup(MemberVO mVo);

	MemberVO signin(MemberVO mVo);

}
