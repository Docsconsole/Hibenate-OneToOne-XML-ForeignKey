package com.docsconsole.tutorials.hibernate5.entity;

import java.io.Serializable;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 88889999998L;
	private Long empId;
	private String empName;
	private Long empSal;
	private EmployeeDetails empDet;
	
	public Employee() {
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Long getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Long empSal) {
		this.empSal = empSal;
	}

	public EmployeeDetails getEmpDet() {
		return empDet;
	}

	public void setEmpDet(EmployeeDetails empDet) {
		this.empDet = empDet;
	}

	
	
	

	
}
