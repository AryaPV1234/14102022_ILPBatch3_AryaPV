package com.experion.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Product;
import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) {
		char mainChoice;
		char customerChoice;
		int serialNumber;
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Product> productList = new ArrayList<Product>();
		System.out.println("************Welcomes to Our Shop**********");
	do {
		
			System.out.println("Enter 1 for Fabric Enter 2 for Electronics Enter 3 for Display product Enter 1 forBuy Product ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
				case 1:  productList.add(Service.createProduct("Fabric"));
						 break;
				case 2: productList.add(Service.createProduct("Electronics"));
						break;
				case 3 : Service.displayProductDetails(productList);
				break;
				case 4 : Service.buyProducts(productList);
				break;
				default :System.out.println("Invalid Choice");
			}
			System.out.println("Dear Customer Do You want to continue (y/n)");
			mainChoice=scanner.next().charAt(0);
	}
 while(mainChoice=='y');
	}

}
