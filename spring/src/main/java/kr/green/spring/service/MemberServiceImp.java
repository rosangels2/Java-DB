package kr.green.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.spring.dao.MemberDAO;
import kr.green.spring.vo.MemberVO;

@Service	//서비스로 인식시키기 위한 키워드
public class MemberServiceImp implements MemberService{

	@Autowired
	MemberDAO memberDao;
	
	@Override
	public boolean signup(MemberVO mVo) {
		//기존에 해당 아이디가 있는지 체크
		//있으면 false 반환하고 종료 없으면 회원가입 진행
		if(mVo == null){	//예외처리
			return false;
		}
		mVo.setName("");
		MemberVO oVo = memberDao.getMember(mVo.getId());	//mVo.getID를 통해 getMember에서 객체를 가져와 oVo에 저장
		if(oVo != null){	//입력된 id를 통해 가져온 객체가 null이 아니라면(이미 가입돼 있다면)
			return false;	//false를 반환
		}
		memberDao.signup(mVo);
		return true;
		
	}
	@Override
	public boolean signin(MemberVO mVo){
		if(mVo == null){	//예외처리 
			return false;
		}
		mVo.setName("");
		mVo.setEmail("");
		mVo.setGender("");
		MemberVO oVo = memberDao.getMember(mVo.getId());	//mVo.getID를 통해 getMember에서 객체를 가져와 oVo에 저장
		if(oVo == null){	
			return false;
		}
		if(oVo.getPw().equals(mVo.getPw())){	//oVo의 pw와 mVo의 pw가 일치하다면
			return true;
		}
		return false;
	}
	@Override
	public boolean modify(MemberVO mVo, String oPw){
		if(mVo == null) {
			return false;
		}
		mVo.setName("");
		mVo.setEmail("");
		mVo.setGender("");
		MemberVO oVo = memberDao.getMember(mVo.getId());
		if(oVo.getPw().equals(oPw)){
			memberDao.modify(mVo);
			return true;
		}
		return false;
	}
	
}
