package kr.green.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kr.green.spring.dao.MemberDAO;
import kr.green.spring.vo.MemberVO;

@Service	//서비스로 인식시키기 위한 키워드
public class MemberServiceImp implements MemberService{

	@Autowired
	MemberDAO memberDao;
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public boolean signup(MemberVO mVo, String pw1) {
		//기존에 해당 아이디가 있는지 체크
		//있으면 false 반환하고 종료 없으면 회원가입 진행
		if(mVo == null){	//예외처리
			return false;
		}
		if(mVo.getPw().length() < 8 || mVo.getPw().length() > 13) {
			return false;
		}
		if(!mVo.getPw().equals(pw1)) {
			return false;
		}
		MemberVO oVo = memberDao.getMember(mVo.getId());	//mVo.getID를 통해 getMember에서 객체를 가져와 oVo에 저장
		if(oVo != null){	//입력된 id를 통해 가져온 객체가 null이 아니라면(이미 가입돼 있다면)
			return false;	//false를 반환
		}
		mVo.setName("");
		//비밀번호 암호화 추가 코드
		String encodePw = passwordEncoder.encode(mVo.getPw());	//passwordEncoder의 encode 메서드로 비밀번호를 암호화하여 저장
		mVo.setPw(encodePw);	//암호화된 비밀번호로 비밀번호를 재설정
		memberDao.signup(mVo);
		return true;
	}
	@Override
	public MemberVO signin(MemberVO mVo){
		if(mVo == null){	//예외처리 
			return null;
		}
		mVo.setName("");
		MemberVO oVo = memberDao.getMember(mVo.getId());	//mVo.getID를 통해 getMember에서 객체를 가져와 oVo에 저장
		if(oVo == null){	
			return null;
		}
		//비밀번호 암호화 추가 코드
		if(passwordEncoder.matches(mVo.getPw(), oVo.getPw())){	//matches(입력 비밀번호, 암호화돼 저장된 비밀번호) - 입력 비밀번호를 암호화해 비교하는 메서드
			return oVo;
		}
		return null;
	}
	@Override
	public boolean modify(MemberVO mVo, String oPw, String pw1){
		if(mVo == null) {
			return false;
		}
		mVo.setName("");
		MemberVO oVo = memberDao.getMember(mVo.getId());
		if(oVo == null) {
			return false;
		}
		if(oVo.getPw().equals(oPw)){	//현재 비밀번호와 회원의 비밀번호가 일치하다면
			if(mVo.getPw() == null || mVo.getPw() == "" || pw1 == null || pw1 == ""){	//새 비밀번호를 입력하지 않은 경우(변경x)
				mVo.setPw(oVo.getPw());	//새 비밀번호에 기존 비밀번호를 저장
			}else if(mVo.getPw().length() < 8 || mVo.getPw().length() > 13){	//새 비밀번호의 길이가 맞지 않다면(변경o)
				return false;
			}else if(!mVo.getPw().equals(pw1)) {	//새 비밀번호와 새 비밀번호 확인이 일치하지 않는다면(변경o)
				return false;
			}
			if(mVo.getEmail() == null || mVo.getEmail() == "") { //이메일을 변경하지 않는 경우
				mVo.setEmail(oVo.getEmail());	//기존 이메일 정보를 가져와서 추가
			}
			memberDao.modify(mVo);	//DAO의 메서드를 호출해 mapper의 쿼리문을 실행
			return true;
		}
		return false;
	}
	
}
