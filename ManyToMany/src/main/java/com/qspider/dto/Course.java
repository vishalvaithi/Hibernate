package com.qspider.dto;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Course {

	@Id
	private int courseId;
	private String name;
	private int duration;
	private int fees;
	@ManyToMany(mappedBy = "courseList")
	private List<Student> studList=new ArrayList<Student>();
	
	public List<Student> getList() {
		return studList;
	}
	public void setList(List<Student> list) {
		this.studList = list;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	
	
}
