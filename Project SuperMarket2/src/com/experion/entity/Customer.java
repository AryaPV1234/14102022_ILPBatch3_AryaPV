package com.experion.entity;

public class Customer {
	private String customerName;
	private String customerCode;
	private String purchaseDate;
	private Product product;
	
	public Customer(String customerName, String customerCode, String purchaseDate, Product product) {
		super();
		this.customerName = customerName;
		this.customerCode = customerCode;
		this.purchaseDate = purchaseDate;
		
		this.product = product;
	
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	
	
}
