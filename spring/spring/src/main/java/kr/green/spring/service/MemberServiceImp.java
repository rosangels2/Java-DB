package kr.green.spring.service;

import java.util.ArrayList;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kr.green.spring.dao.MemberDAO;
import kr.green.spring.pagination.Criteria;
import kr.green.spring.vo.MemberVO;

@Service	//서비스로 인식시키기 위한 키워드
public class MemberServiceImp implements MemberService{

	@Autowired
	MemberDAO memberDao;
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	@Autowired
	private JavaMailSender mailSender;
	
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
	public MemberVO modify(MemberVO mVo, String oPw, String pw1){
		if(mVo == null) {
			return null;
		}
		mVo.setName("");
		MemberVO oVo = memberDao.getMember(mVo.getId());
		if(oVo == null) {
			return null;
		}
		if(mVo.getPw().length() < 8 || mVo.getPw().length() > 13){	//새 비밀번호의 길이가 맞지 않다면(변경o)
			return null;
		}
		if(!mVo.getPw().equals(pw1)) {	//새 비밀번호와 새 비밀번호 확인이 일치하지 않는다면(변경o)
			return null;
		}
		if(!passwordEncoder.matches(oPw, oVo.getPw())){	//현재 비밀번호와 회원의 비밀번호가 일치하다면
			return null;
		}
		if(mVo.getPw() == null || mVo.getPw() == ""){	//새 비밀번호를 입력하지 않은 경우(변경x)
			mVo.setPw(oVo.getPw());
			memberDao.modify(mVo);
			return mVo;
		}
		String encodePw = passwordEncoder.encode(mVo.getPw());
		mVo.setPw(encodePw);
		memberDao.modify(mVo);
		return mVo;
	}

	@Override
	public boolean isMember(String id) {
		if(memberDao.getMember(id) == null) {
			return false;
		}
		return true;
	}
	
	@Override
	public String getVal(String str) {
		String [] arr = str.split("=");	//입력받은 문자열을 =을 기준으로 배열로 나눠서 저장 
		if(arr.length == 2){	//배열의 길이가 2라면 	예시)id=xxx -> 0번지 = id, 1번지 = xxx
			return arr[1];	//배열의 1번지를 반환(실제 입력값인 xxx)
		}else{
			return "";
		}
	}
	
	@Override
	public boolean checkMember(String id, String email) {	//입력받은 id와 email값을 매개변수로 사용
		MemberVO user = memberDao.getMember(id);	//id를 통해 가져온 회원 정보를 저장
		if(user != null && user.getEmail().equals(email)) {	//회원정보의 이메일과 입력한 이메일이 같다면 
			return true;	//true를 반환
		}
		return false;
	}

	@Override
	public String createPw() {		//랜덤한 비밀번호를 생성
		String str ="0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String pw="";
		for(int i=0; i< 8; i++) {
			int r = (int)(Math.random()*62);
			pw += str.charAt(r);
		}
		return pw;
	}
	
	@Override
	public void modify(String id, String email, String newPw) {	
		MemberVO user = memberDao.getMember(id);	//id를 통해 회언 정보를 가져와서 변수에 저장
		if(user == null)	return;
		if(!user.getEmail().equals(email))	return;
		String encodePw = passwordEncoder.encode(newPw);	//새로 생성된 임시 비밀번호를 암호화해 변수에 저장
		user.setPw(encodePw);	//암호화된 비밀번호로 객체 정보를 수정
		memberDao.modify(user);	//해당 객체 정보를 통해 회원 정보를 수정
	}

	@Override
	public void sendMail(String email, String title, String contents) {		//입력받은 정보를 통해 이메일을 전송
		String setfrom = "stajun@google.com";         
	    try {
	        MimeMessage message = mailSender.createMimeMessage();
	        MimeMessageHelper messageHelper 
	            = new MimeMessageHelper(message, true, "UTF-8");
	        
	        messageHelper.setFrom(setfrom);  // 보내는사람 생략하거나 하면 정상작동을 안함
	        messageHelper.setTo(email);     // 받는사람 이메일
	        messageHelper.setSubject(title); // 메일제목은 생략이 가능하다
	        messageHelper.setText(contents);  // 메일 내용

	        mailSender.send(message);
	    } catch(Exception e){
	        System.out.println(e);
	    }
	}
	@Override
	public boolean updateUserToSession(HttpServletRequest r, MemberVO nUser){
		if(nUser == null)
			return false;
		HttpSession s = r.getSession();
		s.removeAttribute("user");//이전 회원정보 제거
		s.setAttribute("user", nUser);//새 회원 정보 추가
		return true;
	}
	@Override
	public ArrayList<MemberVO> getUserList(Criteria cri){
		return  memberDao.getUserList(cri);
	}
	@Override
	public int getTotalCount(Criteria cri) {
		return memberDao.getTotalCount(cri);
	}
	@Override
	public void modify(MemberVO mVo) {
		MemberVO oVo = memberDao.getMember(mVo.getId());
		if(oVo == null){
			return;
		}
		oVo.setAuthority(mVo.getAuthority());
		memberDao.modify(oVo);
		return;
	}
}
