<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    //username=ssar&password=1234&name=쌀
    
    //톰켓이 request, response를 만들어준다
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String name = request.getParameter("name");
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
유저네임:<%=username %>
패스워드:<%=password %>
이름:<%=name %>
</body>
</html>