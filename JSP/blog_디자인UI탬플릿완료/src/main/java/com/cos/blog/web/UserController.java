package com.cos.blog.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.blog.service.Action;
import com.cos.blog.service.user.JoinAction;
import com.cos.blog.service.user.JoinFormAction;


//http://localhost:8000/blog/board
@WebServlet("/user")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}
	public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. web.xml에 utf 8로 받게 인식하게 설정 
		
		
		//2. null과 공백 접근 금지(유효성검사)
		if(request.getParameter("cmd")==null || request.getParameter("cmd").equals("")) {
			return;
		}
		String cmd = request.getParameter("cmd");
		
		if (cmd.equals("joinForm")) { //join폼 페이지를 달라 폼은 샌드 리다이랙트
				
		}else if(cmd.equals("join")) { //조인수행하는 페이지를 달라 joinProc
			
		}else if(cmd.equals("loginForm")) { //로그인폼 페이지를 달라
			
		}else if(cmd.equals("login")) { //로그인수행하는 페이지를 달라
			
		}else if(cmd.equals("updateForm")) { //업데이트폼 페이지를 달라
			
		}else if(cmd.equals("update")) { //업데이트 폼 페이지를 달라
			
		}else if(cmd.equals("logout")) { //로그아웃 페이지를 달라
			
		}
		
		
			Action action =	router(cmd);  //router에 넘김 
				if(action!=null) {
					action.execute(request, response);
				}
				
				}
	
//router에게 객체생성을 위임하고 결과를 응답받음(팩토리패턴)
private Action router(String cmd)  {
	//팩토리 패턴 
	if (cmd.equals("joinForm")) { 
		
		return new JoinFormAction();
		
	}else if(cmd.equals("join")) { 
		
	return new JoinAction();
			
	}
	else if(cmd.equals("loginForm")) {
	
	}else if(cmd.equals("login")) { 
		
	}else if(cmd.equals("updateForm")) { 
		
	}else if(cmd.equals("update")) { 
		
	}else if(cmd.equals("logout")) { 
		
	}
	return null;
	
}
}
