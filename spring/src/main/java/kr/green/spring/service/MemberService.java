package kr.green.spring.service;

import org.springframework.stereotype.Service;

import kr.green.spring.vo.MemberVO;

public interface MemberService {
	public boolean signup(MemberVO mVo);	//기존에 아이디가 있어 실패했을 경우
}
