package com.cos.blog.service.user;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cos.blog.domain.user.User;
import com.cos.blog.domain.user.UserDAO;
import com.cos.blog.service.Action;
import com.cos.blog.util.Script;
import com.cos.blog.util.ValidationHandler;

public class LoginAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		ValidationHandler vh = new ValidationHandler();
		
		List<String> keys = Arrays.asList("username","password");
		if (vh.validation(keys,request, response) != 1) {
			return;
		}
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
	
		UserDAO userDAO = UserDAO.getInstance();//싱글톤 
		
		//entitiy 는 데이터베이스와 동기화된 user 오프젝트
		
		User userEntity = userDAO.findByUsernameAndPassword(username,password);
		
		if(userEntity!=null) {
		//리맴버 미  체크가 완료 되었고=>response의 header에 Cookie를 저장해서 날리세요
		// 브라우저는 rememberMe=ssar을 가지고 있으면 된다.
		
		
		HttpSession session =request.getSession();
		//${principal}
		session.setAttribute("principal", userEntity);	
		//session.invalidate(); //로그아웃 코드
		response.sendRedirect("/blog");
		
		}else {	//alert 창 
			
			Script.back("아이디와 패스워드를 확인해주세요", response);
		 
	}

}
}
