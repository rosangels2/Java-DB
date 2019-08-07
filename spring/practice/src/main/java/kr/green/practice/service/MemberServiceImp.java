package kr.green.practice.service;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
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
	@Autowired
	private JavaMailSender mailSender;
	
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

	@Override
	public String getVal(String str) {
		String arr[] = str.split("=");
		if(arr.length == 2){
			return arr[1];
		}
		return "";
	}

	@Override
	public boolean checkMember(String id, String email){
		MemberVO mVo = memberDao.getMember(id);
		if(mVo != null && mVo.getEmail().equals(email)){
			return true;
		}
		return false;
	}

	@Override
	public void sendMail(String email, String title, String contents) {
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
	public String createPw() {
		String str ="0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String pw="";
		for(int i=0; i< 8; i++) {
			int r = (int)(Math.random()*str.length());
			pw += str.charAt(r);
		}
		return pw;
	}

	@Override
	public void modify(String id, String email, String newPw) {
		MemberVO mVo = memberDao.getMember(id);		//id를 통해 회언 정보를 가져와서 변수에 저장
		if(mVo != null && mVo.getEmail().equals(email)){
			mVo.setPw(passwordEncoder.encode(newPw));	//암호화된 비밀번호로 객체 정보를 수정
			memberDao.modify(mVo);
		}
		return;
	}
	
}
