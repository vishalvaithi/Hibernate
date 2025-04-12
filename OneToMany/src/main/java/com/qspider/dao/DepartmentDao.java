package com.qspider.dao;

import java.util.List;

import com.qspider.dto.Department;
import com.qspider.dto.Employee;

public class DepartmentDao implements JpaSteps {
	
	public static void createDepartment(int deptno,String name,String location){
		
		Department d=new Department();
		d.setDepartmentId(deptno);
		d.setDepartmentName(name);
		d.setLocation(location);
		tr.begin();
		manager.persist(d);
		tr.commit();
		System.out.println("success");
		
	}

	public static Department findDept(int deptId) {
		Department department = manager.find(Department.class, deptId);
		return department;
		
	}
	
	public static void updateDept(int deptId,int empId) {
		
		Department dept = findDept(deptId);
		if(dept!=null) {
			List<Employee> listOfEmployees = dept.getListOfEmployees();
			if(listOfEmployees.isEmpty()) {
				System.out.println("No Employee found");
			}else {
				for(Employee e:listOfEmployees) {
					if(e.getEmployeeNumber()==empId) {
						tr.begin();
						e.setEmployeeSalary(e.getEmployeeSalary()+500);
						tr.commit();
					}else {
						System.out.println("Invalid employee Id");
					}
				}
			}
			
			
		}else {
			System.out.println("Invalid department id");
		}
	}
	
	public static void deleteDept(int deptId,int empId) {
		
		Department dept = findDept(deptId);
		if(dept!=null) {
			List<Employee> listOfEmployees = dept.getListOfEmployees();
			if(listOfEmployees.isEmpty()) {
				System.out.println("No employee found");
			}else {
				for(Employee e:listOfEmployees) {
					if(e.getEmployeeNumber()==empId) {
						tr.begin();
						manager.remove(e);
						tr.commit();
						System.out.println("success");
					}else {
						System.out.println("Invalid employee Id");
					}
				}
			}
		}
	}
	
}
