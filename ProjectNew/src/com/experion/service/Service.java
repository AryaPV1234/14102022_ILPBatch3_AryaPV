package com.experion.service;

import java.text.ParseException;
import java.util.Scanner;

import com.experion.entity.Product;

public class Service{

	public static Product createProduct() throws ParseException {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter material Code: ");
		String productCode = scanner.nextLine();
		System.out.println("Enter material Type: ");
		String productName = scanner.nextLine();
		System.out.println("Enter deviceCode: ");
		String deviceCode = scanner.nextLine();
		System.out.println("Enter deviceName: ");
		String deviceName = scanner.nextLine();
	}
	}
