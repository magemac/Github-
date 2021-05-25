package com.cos.blog.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	//1.http body 데이터 유효성 검사
	//2. http body 데이터 변수로 받아야됨
	//3. DAO 연결해서 save()하기
	//4. result 받아야함
	//5. 1일때 1이 아닐때 분기하여 1일때는 loginForm 페이지로 보내기, 1이 아니면 joinForm페이지로 보내기
}
