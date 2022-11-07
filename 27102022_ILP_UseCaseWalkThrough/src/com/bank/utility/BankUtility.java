package com.bank.utility;

import java.util.Scanner;

import com.bank.entity.Service;
import com.bank.service.BankService;

public class BankUtility {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int mainChoice;
		do {
			Service service=null;
			System.out.println("1. create service 2.create rate 3.display service details 4.exit");
			mainChoice = scanner.nextInt();
			switch(mainChoice)
			{
			case 1 : service =BankService.createService();
			break;
			case 2 :
				BankService.createRateCard(service);
			break;
			case 3 :
				BankService.displayServiceDetails(service);
			break;
			case 4 : 
				System.exit(0);
			
			}
			
		} while(mainChoice !=4);
	
	}

}

