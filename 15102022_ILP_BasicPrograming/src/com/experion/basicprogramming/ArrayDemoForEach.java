package com.experion.basicprogramming;

import java.util.Scanner;

public class ArrayDemoForEach {

	public static void main(String[] args)
	{
		 {
			Scanner scanner = new Scanner(System.in);
			String productNames[] = new String[5];

			System.out.println("Enter 5 product names");
			for (int index = 0; index < productNames.length; index++) {
			productNames[index] = scanner.nextLine();
			}
			System.out.println("*********** Product In Stock ******************* ");
			for (String productName :productNames) {
			System.out.println(productName+ "     "+productName.length());
			}

	}
	}
}
