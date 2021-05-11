<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>회원가입 화면</h1>
<hr/>
<form action="joinProc.jsp" method="post">
<input type = "text"placeholder="username"name="username"/>
<input type = "text"placeholder="password"name="password"/>
<input type = "text"placeholder="name"name="name"/>
<button type="submit">전송</button>
</form>
<a href ="login.jsp">이미 가입 하셨나요</a>

</body>
</html>