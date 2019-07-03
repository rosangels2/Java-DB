package kr.green.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller	//컨트롤러 어노테이션 - 입력하면 controller로 인식(없을 경우 일반 클래스로 인식)
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	//@RequestMapping(요청을 연결) - 서버 부분을 제외한 URL이 /고 방식이 get이면 home 메서드를 실행
	@RequestMapping(value = "/", method = RequestMethod.GET)	//get방식으로 호출했을 떄 값과 일치하는 메서드를 호출
	public String home(Model model, String id, Integer num1, Integer num2, Integer zero) {
		logger.info("메인페이지 실행");	//console에 입력되는 메세지
//		
//		//model - 화면(jsp)과 관련된 정보를 저장하는 객체
//		model.addAttribute("serverTime", "안녕하세요" ); //객체.addAttribute(변수,값) - 해당 객체의 변수에 값을 추가하는 기능을 가진 메서드 
//		model.addAttribute("name", id);
//		
//		int res = num1+num2;	//매개변수로 객체를 가져왔을 경우 자료형이 일치해야 한다(또는 Integer로 했을 때 null+null을 실행해 에러 발생 가능)	
//		if(num1 != null && num2 != null) {
//			model.addAttribute("res",num1+num2);
//		}
//		model.addAttribute("num1", num1);
//		model.addAttribute("num2", num2);
//		//model.addAttribute("res", num1+num2); //num1, num2 입력 없이 계산할 경우 nullPointException 발생
		
		if(zero == null) {
			zero = 0;
			model.addAttribute("zero", 0);
		}else{
			model.addAttribute("zero", zero++);
		}
		
		return "home";	//사용자에게 home.jsp를 보내준다
	}
	
	
	/*
	 @RequestMapping(value = "/", method = RequestMethod.GET) 
	  일치하는 메서드를 호출 public String home(Locale locale, Model model) {
	 logger.info("Welcome home! The client locale is {}.", locale);
	  
	  Date date = new Date(); DateFormat dateFormat =
	  DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
	  
	  String formattedDate = dateFormat.format(date);
	  
	  model.addAttribute("serverTime", formattedDate)); 
	  return "home"; //사용자에게 home.jsp를 보내준다 }
	 */
}
