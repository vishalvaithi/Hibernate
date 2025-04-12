package com.qspider.ManyToMany;

import com.qspider.dao.CourseDao;
import com.qspider.dao.StudentDao;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    		
    
    	CourseDao.createCourse(1, "Java", 100, 15000);
    	StudentDao.createStudent(1, "Vishal", "vishal@gmail.com", 9965362864l, "QWEasd");

//    	StudentDao.updateStudent(1);
//    	StudentDao.deleteStudent(1);
    	
    	CourseDao.updateStudent(1);
//    	CourseDao.deleteStudent(1);
    }
}
