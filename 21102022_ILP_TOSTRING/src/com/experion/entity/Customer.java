package com.experion.entity;

public class Customer {
	private String customerNumber;
	private String customerCode;
	public Customer(String customerNumber, String customerCode) {
		super();
		this.customerNumber = customerNumber;
		this.customerCode = customerCode;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	@Override
	public String toString() {
		return "Customer [customerNumber=" + customerNumber + ", customerCode=" + customerCode + "]";//eg for ToString.We can change values inside the bracket[]
	}
	
	

}
