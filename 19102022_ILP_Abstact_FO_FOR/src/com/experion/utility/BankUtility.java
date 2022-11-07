package com.experion.utility;
import java.util.Scanner;

import com.experion.entity.Account;
import com.experion.entity.Card;
import com.experion.entity.Loan;
import com.experion.entity.Product;
import com.experion.service.AccountService;


public class BankUtility {
	public static void main(String[]args)
	{
//		Account account= new Account("WOMEN SAVINGS ACCOUNT","ACC1234",100);
//		AccountService accountService= new AccountService();
//		accountService.depositCash(account, 1222);
//		accountService.depositCash(0,account,"qweh");
//		accountService.depositCash(account,343, "qweh");
		Product product= null;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1.Account 2.Card 3.Loan");
		int choice = scanner.nextInt();
		if (choice ==1)
		{
			product =new Account("womens savings account","ASD1123",121);
			
		}
		else if (choice ==2 )
		{
			product =new Card("master card","ASD1123",121);
		}
		else if (choice ==3)
		{
			product =new Loan("Home Loant","ASD1123",1211);
			
		}
		product.checkProductValidity();
		
	}

}
