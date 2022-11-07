package com.experion.basicprogramming;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		String productName[]= new String[5];
		
		Scanner scanner = new Scanner (System.in);
		 
		System.out.println(" Enter a product ");
		productName[0]=scanner.nextLine();
		productName[1]=scanner.nextLine();
		productName[2]=scanner.nextLine();
		productName[3]=scanner.nextLine();
		productName[4]=scanner.nextLine();
		System.out.println(productName[0]);
		System.out.println(productName[1]);
		System.out.println(productName[2]);
		System.out.println(productName[3]);
		System.out.println(productName[4]);
		
		
	}

}
