package com.dao;

import com.dto.Director;

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
	
	public static Director findDirector(int DirectorId) {
		return manager.find(Director.class, DirectorId); 
	}
	
	public static void updateDirector(int DirectorId) {
		Director Director = findDirector(DirectorId);
		tr.begin();
		Director.setAwards_Won(5);
		tr.commit();
	}
	
	public static void deleteDirector(int DirectorId) {
		Director Director = findDirector(DirectorId);
		tr.begin();
		manager.remove(Director);
		tr.commit();
	}
}