package com.bank.service;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.bank.entity.Rate;
import com.bank.entity.Service;


public class BankService {
	public static Service createService() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the following details to reate service");
		System.out.println("serive code :-");
		String serviceCode= scanner.nextLine();
		
		System.out.println("serive Name :-");
		String serviceName= scanner.nextLine();
		
		
		System.out.println("serive Descriptions :-");
		String serviceDescriptions= scanner.nextLine();
		
		System.out.println("open Date :-");
		String openDate= scanner.nextLine();
		System.out.println( "validity Date :-");
		String validityDate= scanner.nextLine();
		System.out.println("expiry Date :-");
		String expiryDate= scanner.nextLine();
	
	    Date openDateConverted= stringToDate(openDate);
	    Date validDateConverted= stringToDate(validityDate);
	    Date expiryateConverted= stringToDate(expiryDate);
		
		
		Service service= new Service(serviceCode,serviceName,serviceDescriptions,openDateConverted,validDateConverted,expiryateConverted);
		return service;

}
	public static void createRateCard(Service service) {
		Scanner scanner=new Scanner(System.in);
		Rate rate= new Rate();
		
		System.out.println("********enter the rate card for"+ service.getServiceName()+"********");
		
		System.out.println("enter the number of tiers you want to add : ");
		int noOfTiers =scanner.nextInt();
		int[]min = new int[noOfTiers];
		int[]max = new int[noOfTiers];
		double[]fees = new double[noOfTiers];
		 for(int tier=0;tier< noOfTiers; tier++)
		 {
			 System.out.println("enter the MIN MAX and Rate for the" + (tier+1)+"tier");
			 min[tier]= scanner.nextInt();
			 max[tier]=scanner.nextInt();
			 fees[tier]=scanner.nextDouble();
			 
			 System.out.println("successfully inserted values in the "+ (tier+1)+"tier");
			 if(tier< noOfTiers)
			 {
				 System.out.println("do you add more tier -(y/n");
				 char ch =scanner.next().charAt(0);
				 if(ch =='y')
					 continue;
				 else
					 break;
		 }
		
		
		
		
		
		service.setRate(rate);
		service.getRate().setMin(min);
		service.getRate().setMax(max);
		service.getRate().setRate(fees);
		System.out.println("successfully created rate card for service"+service.getServiceName());
		}

}
	public static void displayServiceDetails(Service service) {
		System.out.println("*****************service Details************");
		System.out.println("service code"+"      "+"service name"+"      "+"service description"+"       "+"open date"+"       "+"validity date"+"        "+"expiry date");
		System.out.println(service.getServiceCode() +"      "+service.getServiceName()+"      "+service.getServiceDesc()+"       "+service.getOpenDate()+"       "+service.getValidityDate()+"        "+service.getExpiryDate() );
		System.out.println("*************Rate card for the service"+service.getServiceName()+"is given below************");
		System.out.println("MIN       MAX       RATE");
		
		for(int index=0; index <service.getRate().getMin().length; index++)
		{
			if((service.getRate().getMax()[index] <=999999)&&(service.getRate().getMax()[index] !=0)) {
				System.out.println(service.getRate().getMin()[index]+"             "+service.getRate().getMax()[index]+"     "+service.getRate().getRate()[index]);
             
		}
			
		
		System.out.println(service);
		System.out.println(service.getRate());
		}
		
	}
	public static Date stringToDate(String dateString)
	{
			Date convertDate = null;
			try {
				convertDate = new SimpleDateFormat("dd/mm/yyyy").parse(dateString);
			} catch (ParseException e) {
				
				e.printStackTrace();
			}
			return convertDate;
		}
		
		
	}


