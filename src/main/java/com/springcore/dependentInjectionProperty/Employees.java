package com.springcore.dependentInjectionProperty;

public class Employees {
	private String empName;
	private String empId;
	private Addresss address;
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
	public Addresss getAddress() {
		return address;
	}
	public void setAddress(Addresss address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employees [empName=" + empName + ", empId=" + empId + ", address=" + address + "]";
	}
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
