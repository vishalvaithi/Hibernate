package com.qspider.dao;

import com.qspider.dto.Author;
public class AuthorDao implements JpaSteps {
	
	public static void createAuthor(int id,String name) {
		
		Author l=new Author();
		l.setId(id);
		l.setName(name);
		tr.begin();
		manager.persist(l);
		tr.commit();
		System.out.println("success");
		
	}
	
	
}
