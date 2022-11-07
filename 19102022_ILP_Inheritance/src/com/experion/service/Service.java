package com.experion.service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Account;
import com.experion.entity.BankServices;
import com.experion.entity.Card;
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
		

		Product product = new Product(productCode, productName, productType);

		return product;
	}

	
	public static Product createProduct(String productType) {
		ArrayList<BankServices> bankServices = new ArrayList<BankServices>();
		bankServices.add(new BankServices("SOB100","ONLINE BANKING"));
		bankServices.add(new BankServices("SOB100","MOBILE BANKING"));
		bankServices.add(new BankServices("SOB100","MOBILE BANKING"));
		BankServices bankservice= new BankServices("QWER234","Cash Deposit");
		Product product=null;
		//Card card =new Card("PRDMC100","Master Card","Card","Master");
		if(productType.compareTo("Card")==0){
			product =new Card("PRDMC100","Master Card","Card","Master");
		}
		else if(productType.compareTo("Accounts")==0) {
			product =new Account("PRDMC100","Women Saving Card","Account","Saving Account",bankServices);	
		}
			
		return product;
	}

	public static void creatAccountProduct() {
	
		
	}

	public static void displayProductDetails(ArrayList<Product> productList) {
	
		Card card=null;
		Account account=null;
		System.out.println("Product code"+"   "+"product name"+"   "+"product type"+"   "+"Account/card"+"  "+"Banking Service");
		for (Product product: productList)
		{
				if(product instanceof Card) {
					card =(Card)product;
					System.out.println(card.getProductCode()+"  "+card.getProductName()+"    "+ card.getProductType()+"  "+card.getCardType());
				}
				else if(product instanceof Account) {
					account=(Account)product;
					System.out.println(account.getProductCode()+"  "+account.getProductName()+"    "+ account.getProductType()+"  "+account.getAccountType());
					System.out.println("List of the given below");
					for(BankServices bankServices : account.getBankService())
						System.out.println(bankServices.getServiceName());
				}
			
				
	}
}


	 {
		// TODO Auto-generated method stub
		
	}


}
