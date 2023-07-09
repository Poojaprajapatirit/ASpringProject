package com.pooja.basic.bean;

import java.util.Date;

public class Employee {

	private Integer empNo;
	private String empName;
	private Address empAddress;
	private Date empDoj;
	/*
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}
	public void setEmpDoj(Date empDoj) {
		this.empDoj = empDoj;
	}
	*/
	
	public Employee(Integer empNo, String empName, Address empAddress, Date empDoj) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empDoj = empDoj;
	}
	
	
	@Override
	public String toString() {
		
		return "emoNo=" + empNo +"\nempName=" + empName +"\nempAddress=" + empAddress +"\nempDoj=" + empDoj ;
	}
	
	
	
}
