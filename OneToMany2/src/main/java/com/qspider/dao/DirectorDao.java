package com.qspider.dao;

import com.qspider.dto.Director;

public class DirectorDao implements JpaSteps{

	public static void createDir(int Director_LNo,String Dir_Name,String Notionality,int Awards_Won)
	{
		Director dir=new Director();
		dir.setDirector_LNo(Director_LNo);
		dir.setDir_Name(Dir_Name);
		dir.setNotionality(Notionality);
		dir.setAwards_Won(Awards_Won);
		tr.begin();
		manager.persist(dir);
		tr.commit();

		System.out.println("Director created Succesfully");
	}
	
	public static Director find(int dirId) {
		
		Director director = manager.find(Director.class, dirId);
		return director;
	}
	
	public static void updateDirector(int dirId) {
		
		Director director = manager.find(Director.class, dirId);
		tr.begin();
		director.setAwards_Won(4);
		tr.commit();
	}
	
}
