package com.qspider.dao;

import java.util.List;
import java.util.Scanner;

import com.qspider.dto.Course;
import com.qspider.dto.Student;

public class StudentDao implements JpaSteps {

	public static void createStudent(int id, String name, String email, long contact, String password) {

		Student s = new Student();
		s.setStudentId(id);
		s.setsName(name);
		s.setsEmail(email);
		s.setContact(contact);
		s.setPassword(password);
		List<Course> list = s.getCourseList();

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of course :");
		int num = scan.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.println("Enter course Id :");
			Course course = manager.find(Course.class, scan.nextInt());
			list.add(course);
		}
		s.setCourseList(list);

		tr.begin();
		manager.persist(s);
		tr.commit();

		System.out.println("Success");

	}

	public static Student findStudent(int studId) {
		return manager.find(Student.class, studId);
	}

	public static void updateStudent(int studId) {
		Student student = findStudent(studId);

		tr.begin();
		student.setPassword("QweAsd");
		tr.commit();
		System.out.println("Changed");

	}

	public static void deleteStudent(int studId) {
		Student student = findStudent(studId);

		tr.begin();
		manager.remove(student);
		tr.commit();
		System.out.println("Deleted...");

	}

}
