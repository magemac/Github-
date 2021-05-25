package com.cos.blog.domain.board;



import java.util.List;

import com.cos.blog.domain.CrudDAO;
import com.cos.blog.domain.user.UserDAO;
import com.cos.blog.web.dto.BoardDetailDTO;



public class BoardDAO implements CrudDAO<Board>{ //CLUD   create list update delete
	
	private static BoardDAO instance = new BoardDAO();
	private BoardDAO() {}
	public static BoardDAO getInstance() {
		return instance;
	}//싱글톤
	
	public BoardDetailDTO mDetail(int id) {//상세보기시 Board 정보와 User정보를 조인해서 리턴 
		return null;
	}

	@Override
	public Board findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Board> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Board data) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Board data) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(Board data) {
		// TODO Auto-generated method stub
		return 0;
	}
}
	//get
	
