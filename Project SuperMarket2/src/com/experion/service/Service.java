package com.experion.service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Electronics;
import com.experion.entity.Fabric;
import com.experion.entity.Customer;
import com.experion.entity.Product;

public class Service {

	public static Product createProduct() throws ParseException {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Product Code: ");
		String productCode = scanner.nextLine();
		System.out.println("Enter Product Name: ");
		String productName = scanner.nextLine();
		System.out.println("Enter Product Type: ");
		String productType = scanner.nextLine();
		System.out.println("Enter Customer Code: ");
		String customerCode = scanner.nextLine();
		

		Product product = new Product(productCode, productName, productType);

		return product;
	}

	
	public static Product createProduct(String productType) {
		
		Product product=null;
		
		if(productType.compareTo("Fabric")==0){
			product =new Fabric("PRDMC100","     Fabric Name","        Fabric Price","            Fabric Type");
		}
		else if(productType.compareTo("Electronics")==0) {
			product =new Electronics("PRDMC105","     Electronics Name","   Electronics Price","      Electronics Type");	
		}
			
		return product;
	}

	

	public static void displayProductDetails(ArrayList<Product> productList) {
	
		Fabric fabric = null;
		Electronics electronics=null;
		System.out.println(" Your Product code"+"   "+"Your product name"+"            "+"Your product type");
		for (Product product: productList)
		{
				if(product instanceof Fabric) {
					fabric =(Fabric)product;
					System.out.println(fabric.getProductCode()+"  "+fabric.getProductName()+"    "+ fabric.getProductPrice()+"  "+fabric.getFabricType());
				}
				else if(product instanceof Electronics) {
					electronics=(Electronics)product;
					System.out.println(electronics.getProductCode()+"  "+electronics.getProductName()+"    "+ electronics.getProductPrice()+"  "+electronics.getElectronicsType());
					//System.out.println("List of the given below");
					
				}
			
				
	}
}


	public static void buyProducts(ArrayList<Product> productList) {
		Scanner scanner = new Scanner(System.in);
		Product selectedProduct=null;
		String customerName;
		String customerCode;
		String purchaseDate;
		String productCode;
		System.out.println("Enter Your CustomerCode");
		customerCode= scanner.nextLine();
		System.out.println("Enter CustomerName");
	    customerName= scanner.nextLine();
		System.out.println("Enter Your PurchaseDate");
		purchaseDate= scanner.nextLine();
		System.out.println("Enter Your ProductCode");
		productCode= scanner.nextLine();
		
		for (Product product: productList) {
			if(product.getProductCode().equals(productCode))
			{
				selectedProduct = product;
			}
			
		}
		Customer customer = new Customer( customerName,customerCode,purchaseDate,selectedProduct);
		System.out.println("Items successfully Purchased");
	}


	 
	}


