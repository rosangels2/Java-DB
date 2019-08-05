package kr.green.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kr.green.practice.dao.MemberDAO;
import kr.green.practice.vo.MemberVO;

@Service
public class MemberServiceImp implements MemberService{

	@Autowired
	MemberDAO memberDao;
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public boolean signup(MemberVO mVo) {
		if(mVo == null){
			return false;
		}
		mVo.setPw(passwordEncoder.encode(mVo.getPw()));
		memberDao.signup(mVo);
		return true;
	}

	@Override
	public MemberVO signin(MemberVO mVo) {
		if(mVo == null){
			return null;
		}
		MemberVO oVo = memberDao.getMember(mVo.getId());
		if(passwordEncoder.matches(mVo.getPw(), oVo.getPw())){
			return oVo;
		}
		return null;
	}

	@Override
	public boolean modify(MemberVO mVo, String oPw) {
		if(mVo == null || oPw == null){
			return false;
		}
		MemberVO oVo = memberDao.getMember(mVo.getId());
		if(!passwordEncoder.matches(oPw, oVo.getPw())){
			return false;
		}
		mVo.setPw(passwordEncoder.encode(mVo.getPw()));
		memberDao.modify(mVo);
		return true;
	}
	
}
