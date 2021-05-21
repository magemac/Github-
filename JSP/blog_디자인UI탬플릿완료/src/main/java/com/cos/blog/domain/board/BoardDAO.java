package com.cos.blog.domain.board;

import java.util.List;

import com.cos.blog.web.dto.BoardDetailDTO;

public class BoardDAO { //CLUD   create list update delete
	
	
	public BoardDetailDTO mDetail(int id) {//상세보기시 Board 정보와 User정보를 조인해서 리턴 
		return null;
	}
	
	//get
	public Board findById(int id) {
		return null;
	}
	//get
	public List<Board> fintAll(){
		return null;
	}
	//post
	public int save(Board board) {
		return -1;
	}
	//post
	public int update(Board board) {
		return -1;
	}
	//post
	public int deleteById(Board board) {
		return -1;
	}
}
