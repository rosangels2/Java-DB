package kr.green.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.practice.dao.MemberDAO;
import kr.green.practice.vo.MemberVO;

@Service
public class MemberServiceImp implements MemberService{

	@Autowired
	MemberDAO memberDao;
	
	@Override
	public boolean signup(MemberVO mVo) {
		if(mVo == null){
			return false;
		}
		memberDao.signup(mVo);
		return true;
		
	}

	@Override
	public MemberVO signin(MemberVO mVo) {
		if(mVo == null){
			return null;
		}
		MemberVO oVo = memberDao.signin(mVo);
		if(oVo.getPw().equals(mVo.getPw())){
			return oVo;
		}
		return null;
	}

}
