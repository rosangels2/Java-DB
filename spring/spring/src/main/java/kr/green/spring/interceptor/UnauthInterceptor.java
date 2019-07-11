package kr.green.spring.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class UnauthInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, 
			HttpServletResponse response, 
			Object handler)
			throws Exception {
		HttpSession session = request.getSession();	//현재 요청된 페이지의 세션을 가져와 새 세션에 저장한다
		Object user = session.getAttribute("user");	//세션에서 변수 user를 가져와 객체 user에 저장한다
		if(user != null) {	//객체가 null이 아니면(로그인이 성공했다면) 
			response.sendRedirect(request.getContextPath()+"/board/list");	//servlet-conext에서 설정한 경로에 접근할 시 해당 URI의 절대경로로 이동한다
		}
		return true;	//조건식에 해당하지 않는다면 true를 반환해 URI 또는 컨트롤러의 요청을 그대로 진행한다
	}
	
}
