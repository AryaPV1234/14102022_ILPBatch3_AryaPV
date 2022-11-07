package com.experion.entity;

import java.util.Scanner;

import com.experion.service.Product;

public class Service {
	
	public static Product createProduct()
	{
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Fabric");
	String Fabric = scanner.nextLine();
	System.out.println("Electronics ");
	String Electronics = scanner.nextLine();
	
	System.out.println("Enter Which Fabric product you want");
	String productFabric = scanner.nextLine();
	
	System.out.println("Enter Which electronics product you want");
	String productelectronics = scanner.nextLine();
	String ProductRepair= null;
	String ProductExchange = null;
	String WarrantyReplacemen = null;
	char bill;
	Product product = new Product(Fabric, Electronics, ProductExchange , ProductRepair, WarrantyReplacemen,bill);
	return product;
	}
	System.out.println("Fabric" + "    " + "Electronics" + "    " + "ProductExchange" + "    " + "ProductRepair"+"     "+"WarrantyReplacemen"+"    "+"bill");
	
	for (Product product : productList) {
		System.out.println("    " + product.get + "        " + product.getProductCode() + "        "
				+ product.getProductName() + "        " + product.getProductDescription() + "          "
				+ product.getProductPrice() + "        " + dateFormat.format(product.getExpiryDate()) + "         " );

	}
}

