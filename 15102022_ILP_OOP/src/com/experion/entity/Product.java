package com.experion.entity;

import java.util.Scanner;

public class Product {

	String productCode;
	String productName;
	String productDescription;
	double productPrice;
	String openDate;
	String validityDate;
	String expiryDate;
	boolean active;
	
	public void inputProductDetails()
	{
		Scanner scanner = new Scanner (System.in);
		System.out.println(" Enter productCode ");
		productCode=scanner.nextLine();
		
		System.out.println(" Enter productName ");
		productName=scanner.nextLine();
		
		System.out.println(" Enter productDescription ");
		productDescription=scanner.nextLine();
		
		System.out.println(" Enter productPrice ");
		productPrice=scanner.nextDouble();
		
		
		System.out.println(" Enter openDate ");
		openDate=scanner.nextLine();
		
		scanner.nextLine();
		System.out.println(" Enter validityDate ");
		validityDate=scanner.nextLine();
		
		System.out.println(" Enter active ");
		active=scanner.nextBoolean();
		
	}
	public void displayProductDetails() {
		System.out.println(" Enter productName "+ "    "+"productDescription"+"   "+"productPrice"+"   "+"openDate"+"   "+"validityDate"+"   "+"active");
		System.out.println(productName +"   "+ productDescription +"   "+ productPrice+"    "+ openDate+"   "+ validityDate+"   "+ active);
	}

}
