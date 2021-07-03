package com.cos.blog.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http://localhost:8000/blog/user
@WebServlet("/board")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}
	public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("cmd")==null || request.getParameter("cmd").equals("")) {
		
			return;
		}
		
		String cmd = request.getParameter("cmd");
		
		if (cmd.equals("list")) {
				
		}else if(cmd.equals("detail")) {
			
		}else if(cmd.equals("delete")) {
			
		}else if(cmd.equals("updateForm")) { 
			
		}else if(cmd.equals("update")) { 
			
		}else if(cmd.equals("saveForm")) { 
			
		}else if(cmd.equals("save")) { 
			
		}else if(cmd.equals("search")){  //서치는 폼이 필요 없겠다.
			
		}
		//MVC 패턴 기능 정의 완료 
	
	}

}
