package com.experion.entity;

import java.util.ArrayList;

public class Account extends Product {
 private String accountType;
 private ArrayList<BankServices> bankService;
 

public Account(String productCode, String productName, String productType, String accountType,
		ArrayList<BankServices> bankService) {
	super(productCode, productName, productType);
	this.accountType = accountType;
	this.bankService = bankService;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public ArrayList<BankServices> getBankService() {
	return bankService;
}
public void setBankService(ArrayList<BankServices> bankService) {
	this.bankService = bankService;
}


 

 
 
 
}
