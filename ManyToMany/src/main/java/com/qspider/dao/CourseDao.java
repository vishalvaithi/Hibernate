package com.qspider.dao;

import com.qspider.dto.Course;
import com.qspider.dto.Student;

public class CourseDao implements JpaSteps {
	
	
	public static void createCourse(int cId,String name,int duration,int fees) {
		
		Course c=new Course();
		c.setCourseId(cId);
		c.setName(name);
		c.setDuration(duration);
		c.setFees(fees);
		
		tr.begin();
		manager.persist(c);
		tr.commit();
		System.out.println("Success");
		
	}
	public static Course findStudent(int courseId) {
		return manager.find(Course.class, courseId);
	}

	public static void updateStudent(int CourseId) {
		Course c = findStudent(CourseId);

		tr.begin();
		c.setFees(16000);
		tr.commit();
		System.out.println("Changed");

	}

	public static void deleteStudent(int courseId) {
		Course c = findStudent(courseId);

		tr.begin();
		manager.remove(c);
		tr.commit();
		System.out.println("Deleted...");

	}

}
