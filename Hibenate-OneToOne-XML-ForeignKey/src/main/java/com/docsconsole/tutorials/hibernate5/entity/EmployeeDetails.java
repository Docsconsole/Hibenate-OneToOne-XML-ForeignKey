package com.docsconsole.tutorials.hibernate5.entity;

import java.io.Serializable;

public class EmployeeDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 88889999999L;
	private Long empDetId;
	private Long empPhoneNum;
	private Employee employee;
	
	public EmployeeDetails() {
	}

	public Long getEmpDetId() {
		return empDetId;
	}

	public void setEmpDetId(Long empDetId) {
		this.empDetId = empDetId;
	}

	public Long getEmpPhoneNum() {
		return empPhoneNum;
	}

	public void setEmpPhoneNum(Long empPhoneNum) {
		this.empPhoneNum = empPhoneNum;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	

	

}
