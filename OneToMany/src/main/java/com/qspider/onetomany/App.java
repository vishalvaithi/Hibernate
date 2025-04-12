package com.qspider.onetomany;

import com.qspider.dao.DepartmentDao;
import com.qspider.dao.EmployeeDao;
import com.qspider.dto.Department;
import com.qspider.dto.Employee;


/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {

//    	DepartmentDao.createDepartment(10, "sales", "Chennai");
//    	DepartmentDao.createDepartment(20, "Accounts", "Trichy");
//    	DepartmentDao.createDepartment(30, "Operation", "Sirkali");
//    	DepartmentDao.createDepartment(40, "Research", "Madurai");
//		EmployeeDao.createEmployee(7369, "SMITH", "CLERK", 7902, "17-DEC-80", 800, 0,10);
//		EmployeeDao.createEmployee(7499, "ALLEN", "SALESMAN", 7698, "20-FEB-81", 1600, 300,20);
//		EmployeeDao.createEmployee(7521, "WARD", "SALESMAN", 7698, "22-FEB-81", 1250, 500,30);
//		EmployeeDao.createEmployee(7566, "JONES", "MANAGER", 7839, "02-APR-81", 2975, 0,10);
//		EmployeeDao.createEmployee(7654, "MARTIN", "SALESMAN", 7698, "28-SEP-81", 1250, 1400,40);
//		EmployeeDao.createEmployee(7698, "BLAKE", "MANAGER", 7839, "01-MAY-81", 2850, 0,20);
//		EmployeeDao.createEmployee(7782, "CLARK", "MANAGER", 7839, "09-JUN-81", 2450, 0,30);
//		EmployeeDao.createEmployee(7788, "SCOTT", "ANALYST", 7566, "19-APR-87", 3000, 0,10);
//		EmployeeDao.createEmployee(7839, "KING", "PERSIDENT", 7839, "17-NOV-81", 5000, 0,40);
//		EmployeeDao.createEmployee(7844, "TURNER", "SALESMAN", 7698, "08-SEP-81", 1500, 0,20);
//		EmployeeDao.createEmployee(7876, "ADAMS", "CLERK", 7788, "23-MAY-87", 1100, 0,30);
//		EmployeeDao.createEmployee(7900, "JAMES", "CLERK", 7698, "03-DEC-81", 950, 0,30);
//		EmployeeDao.createEmployee(7902, "FORD", "ANALYST", 7566, "03-DEC-81", 3000, 0,10);
//		EmployeeDao.createEmployee(7934, "MILLER", "CLERK", 7782, "23-JAN-82", 1300, 0,40);

//		
//		Department dept = DepartmentDao.findDept(10);
//		System.out.println(dept.getLocation());
//		System.out.println(dept.getDepartmentName());
//		
//		DepartmentDao.updateDept(40, 7934);
		DepartmentDao.deleteDept(40, 7934);
		
		
		
		
	}
}
