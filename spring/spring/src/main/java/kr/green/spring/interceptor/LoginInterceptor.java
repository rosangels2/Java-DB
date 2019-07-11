package kr.green.spring.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import kr.green.spring.vo.MemberVO;

public class LoginInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public void postHandle(	//컨트롤러에서 JSP에 정보를 전송할 때 작동하는 방식
	    HttpServletRequest request, 
	    HttpServletResponse response, 
	    Object handler, 
	    ModelAndView modelAndView)
	    throws Exception {	//오바라이딩하는 메서드의 선언부
	    ModelMap modelMap = modelAndView.getModelMap();	//modelAndView클래스의 객체가 컨트롤러에게서 얻은 model의 값을 ModelMap의 객체에 저장한다
	    MemberVO user = (MemberVO)modelMap.get("user");	//ModelMap 객체의 변수 user를 가져와서 MemberVO클래스 형식으로 형변환하고 객체에 저장

	    if(user != null) {	//가져온 객체가 null이 아니라면(로그인이 성공했다면)
	        HttpSession session = request.getSession();	//요청한 페이지에서 세션을 가져와 객체 세션에 저장한다
	        session.setAttribute("user", user);	//객체 세션의 변수 user에 가져온 객체 user를 저장한다 
	    }	
	 }		//해당 Interceptor에선 response를 통해 URI에 연결하지 않기 때문에 기능만 실행하고 컨트롤러에서 요청한 경로로 이동한다
	
}
