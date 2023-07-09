package com.pooja.basic.bean;

public class Address {
	
private Integer houseNo;
private String houseName;
private Integer pinCode;
public void setHouseNo(Integer houseNo) {
	this.houseNo = houseNo;
}
public void setHouseName(String houseName) {
	this.houseName = houseName;
}
public void setPinCode(Integer pinCode) {
	this.pinCode = pinCode;
}
@Override
public String toString() {
	
	return "Address[houseNo=" +houseNo +",houseName=" + houseName +",pinCode=" + pinCode +"]";
}



}
