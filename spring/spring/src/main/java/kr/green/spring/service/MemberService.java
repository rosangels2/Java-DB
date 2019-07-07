package kr.green.spring.service;

import org.springframework.stereotype.Service;

import kr.green.spring.vo.MemberVO;

public interface MemberService {
	public boolean signup(MemberVO mVo, String pw1);	//기존에 아이디가 있어 가입에 실패했을 경우 false
	public boolean signin(MemberVO mVo);
	public boolean modify(MemberVO mVo, String oPw, String pw1);
}