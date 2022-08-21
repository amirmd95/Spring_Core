package com.springcore.Autowire.Annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private String empName;
	private String empId;
	@Autowired
	private Address address;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", address=" + address + "]";
	}
	public Employee(String empName, String empId, Address address) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.address = address;
	}
	

}
