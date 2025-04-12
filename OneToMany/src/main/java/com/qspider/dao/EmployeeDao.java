package com.qspider.dao;

import java.util.ArrayList;
import java.util.List;

import com.qspider.dto.Department;
import com.qspider.dto.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EmployeeDao implements JpaSteps {

	public static void createEmployee(int empNo, String eName, String Job, int mNum, String date, int salary, int comm,int deptNo) {

		Employee e = new Employee();
		e.setCommission(comm);
		e.setEmployeeHiredate(date);
		e.setEmployeeJob(Job);
		e.setEmployeeName(eName);
		e.setEmployeeNumber(empNo);
		e.setEmployeeSalary(salary);
		e.setManagerNumber(mNum);
		
		Department d=manager.find(Department.class, deptNo);
		List<Employee> listOfEmployee=d.getListOfEmployees();
		if(listOfEmployee != null) {
			listOfEmployee.add(e);
		}else {
			listOfEmployee = new ArrayList<Employee>();
			listOfEmployee.add(e);
		}
		System.out.println(listOfEmployee);
		d.setListOfEmployees(listOfEmployee);
		tr.begin();
		manager.persist(e);
		tr.commit();

	}

}
