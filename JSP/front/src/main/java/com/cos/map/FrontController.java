package com.cos.map;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")  
// 어노테이션 리플렉션 찾아서 개념공부해보자
// 리플렉션 https://www.youtube.com/watch?v=P5fPc2tjOko&list=PL93mKxaRDidFGJu8IWsAAe0O7y6Yw9f5x
// 어노테이션은 (힌트라고 생각할 수 있음) 
// 요청자는 동적이기 때문에 요청이 들어오는 값에 따라서 다르게 응답하기 위해서..
// 리플렉션은 위의 어노테이션은 동적으로 분석해서 런타임과정에서(컴파일링전) 미리 파악하는것 .. 
// 컴파일과정에서 모든걸 정해놓으면 쉽지만 동적인 요청에 응답하기 힘들다.  
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	
    public FrontController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}
	
public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//널에서 .equals 를 찾고 있으니 서버가 터짐
			if(request.getParameter("cmd")==null) {
				return;}
		System.out.println(request.getMethod() + "요청을 : " + request.getRequestURI());
		
		String cmd = request.getParameter("cmd"); //QueryString, x-www-form-urlencoded(Key=Value)
		System.out.println(" cmd : " + cmd); 
		
		
		
		if (cmd.equals("a")  ) {
			response.sendRedirect("a.jsp");
		} else if (cmd.equals("b") ) {
			response.sendRedirect("b.jsp");
		} else if (cmd.equals("c")) {
			int money = 10000;
			request.setAttribute("money", money);
			RequestDispatcher dis = request.getRequestDispatcher("c.jsp");
			dis.forward(request, response);  
		} 
		else 
		{//cmd가 null이거나 공백, cmd=adfkgdafg 일떄
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('Bad Request')");
			out.println("</script>");
		}
	}
}




