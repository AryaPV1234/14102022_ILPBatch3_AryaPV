package com.experion.utility;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Service;

//import com.experion.entity.Product;
public class ProductUtility { 

	public static void main(String[] args) {
		
		int customerSelection;
		char mainChoice;
		
		Scanner scanner = new Scanner(System.in);
		 ArrayList<Product> productList=new ArrayList<Product>();
		System.out.println("****************Welcome**************");
		System.out.println("1. Fabric  2.Electronics");
		 int mainChoice1 = scanner.nextInt();
 	do {
			System.out.println("1. Fabric  2.Electronics");
			mainChoice1 = scanner.nextInt();
		switch(mainChoice)
		{
		case 1 : do {
						System.out.println("1.top 2.jeans");
						int choice = scanner.nextInt();
			
						switch(choice) {
						case 1: try {
								productList.add(Service.createProduct());
						} catch (ParseException e) {
							e.printStackTrace();
							}
								break;
						case 2: if (productList.isEmpty()) {
									System.out.println("No Available Product to Display");
									} else {
										Service.displayProductDetails(productList);
									}
									break;
									System.out.println("Do you want to continue ? y/n");
									mainChoice = scanner.next().charAt(0);
						}
						while((mainChoice=='y');
						break;
						
						
/	}
						
			case 2: do {
				System.out.println("1.top 2.jeans");
				int choice = scanner.nextInt();
			}
				
			}
//						System.out.println("1.ProductExchange 2.ProductRepair 3.WarrantyReplacemen 4.bill");
//						int choice = scanner.nextInt();
//////						switch(choice) {
////							case 1: if (productList.isEmpty()) {
////										System.out.println("No Available Product to Display");
////									} else {
////										Service.displayProductDetails(productList);
////									}
////									break;
////							case 2: if (productList.isEmpty()) {
////										System.out.println("No Available Product to Purchase");
////									} else {
////										do {
////											System.out.println("Enter Serial Number of the product you wish to Purchase");
////											serialNumber = scanner.nextInt();
////											Service.displayValidProducts(productList, serialNumber);
////											System.out.println("Do you wish to Purchase other product : y/n ");
////											customerChoice = scanner.next().charAt(0);
////										}while(customerChoice=='y');
////									}
////									break;
////								}
////								System.out.println("Dear customer do you wish to continue ? y/n");
////								customerChoice = scanner.next().charAt(0);
////						}while(customerChoice=='y');
////			}
////			System.out.println("Exit from the App - y/n");
////			mainChoice = scanner.next().charAt(0);
////		}while(mainChoice=='n');
////		System.out.println("Thank you");
//			
 	}
}
}	

	
	
