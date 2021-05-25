package com.cos.blog.domain.board;

import java.security.Timestamp;

public class Board { //N
	
	private Integer id; //Primary Key , Sequence
	private String title; 
	private String content;
	private Integer userId;
	private Timestamp created;
	
	
	public Board() {
		
	}
	public Board(Integer id, String title, String content, Integer userId, Timestamp created) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.userId = userId;
		this.created = created;
	}
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Timestamp getCreated() {
		return created;
	}
	public void setCreated(Timestamp created) {
		this.created = created;
	} 
}
