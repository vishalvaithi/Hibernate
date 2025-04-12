package com.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Director {
	@Id
	private int Director_LNo;
	private String Dir_Name;
	private String Notionality;
	private int Awards_Won;
	public int getDirector_LNo() {
		return Director_LNo;
	}
	public void setDirector_LNo(int director_LNo) {
		Director_LNo = director_LNo;
	}
	public String getDir_Name() {
		return Dir_Name;
	}
	public void setDir_Name(String dir_Name) {
		Dir_Name = dir_Name;
	}
	public String getNotionality() {
		return Notionality;
	}
	public void setNotionality(String notionality) {
		Notionality = notionality;
	}
	public int getAwards_Won() {
		return Awards_Won;
	}
	public void setAwards_Won(int awards_Won) {
		Awards_Won = awards_Won;
	}
}