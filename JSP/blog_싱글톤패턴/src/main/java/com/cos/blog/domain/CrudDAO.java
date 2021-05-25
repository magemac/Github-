package com.cos.blog.domain;

import java.util.List;

public interface CrudDAO<T> {
	
	public T findById(int id) ;
	//get
	public List<T> findAll() ;
	//post
	public int save(T data) ;
	
	public int update(T data) ;
	//post
	public int deleteById(T data);
}

