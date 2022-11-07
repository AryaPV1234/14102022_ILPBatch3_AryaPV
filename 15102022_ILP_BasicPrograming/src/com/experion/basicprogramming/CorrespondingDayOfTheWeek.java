package com.experion.basicprogramming;

import java.util.Scanner;

public class CorrespondingDayOfTheWeek {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int oneDay ;
		
		System.out.println(" Enter a character ");
		oneDay=scanner.nextInt();
		switch (oneDay)
		{
		case 1:
			System.out.println(oneDay + " is MONDAY ");
			break;
		case 2:
			System.out.println(oneDay + " is TUESDAY ");
			break;
		case 3:
			System.out.println(oneDay + " is WEDNESDAY ");
			break;
		case 4:
			System.out.println(oneDay + " is THURSDAY ");
			break;
		case 5:
			System.out.println(oneDay + " is FRIDAY ");
			break;
		case 6:
			System.out.println(oneDay + " is SATURDAY ");
			break;
		case 7:
			System.out.println(oneDay + " is MONDAY ");
			break;
	}
	}
}
