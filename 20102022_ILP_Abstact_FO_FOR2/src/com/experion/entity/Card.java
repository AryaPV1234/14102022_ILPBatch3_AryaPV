package com.experion.entity;

import java.util.ArrayList;

public class Card extends Product implements CardAccountService{
	
	private String cardNumber;
	private double cardBalance;
	
	public Card(String productName, String cardNumber, double cardBalance) {
		super(productName);
		this.cardNumber = cardNumber;
		this.cardBalance = cardBalance;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public double getCardBalance() {
		return cardBalance;
	}
	public void setCardBalance(double cardBalance) {
		this.cardBalance = cardBalance;
	}
	@Override
	public void checkProductValidity() {
		System.out.println("Validity check your card class called");

		
	}
	@Override
	public void checkBalance() {
		System.out.println("checkBalance");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cashWithrow() {
		System.out.println("cashWithrow");
		// TODO Auto-generated method stub
		
	}
 


 
 
 
}
