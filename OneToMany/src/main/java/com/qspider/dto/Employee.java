package com.qspider.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@Column(name = "EMP_NO")
	private int employeeNumber;
	@Column(name = "ENAME")
	private String employeeName;
	@Column(name = "JOB")
	private String employeeJob;
	@Column(name = "MGR")
	private int managerNumber;
	@Column(name = "HIREDATE")
	private String employeeHiredate;
	@Column(name = "SAL")
	private int employeeSalary;
	@Column(name = "COMM")
	private int commission;

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeJob() {
		return employeeJob;
	}

	public void setEmployeeJob(String employeeJob) {
		this.employeeJob = employeeJob;
	}

	public int getManagerNumber() {
		return managerNumber;
	}

	public void setManagerNumber(int managerNumber) {
		this.managerNumber = managerNumber;
	}

	public String getEmployeeHiredate() {
		return employeeHiredate;
	}

	public void setEmployeeHiredate(String employeeHiredate) {
		this.employeeHiredate = employeeHiredate;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}

	
	

}
