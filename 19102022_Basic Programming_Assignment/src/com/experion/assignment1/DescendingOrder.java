package com.experion.assignment1;

import java.util.Scanner;

public class DescendingOrder 
	{

	public static void main(String[] args)
	{
		//Program to arrange three numbers in descending order
		Scanner scanner = new Scanner (System.in);
		int numbers[]=new int[3];
		int tempNumber;
		
		System.out.println("Enter three numbers");
		for(int i=0;i<3;i++)
		
			numbers[i] = scanner.nextInt();
		for(int i=0;i<3;i++)
		for (int j=i+1;j<3;j++);
		int j;
		int i;
		if(numbers[i]<numbers[j])
		{
			tempNumber = numbers[i];
			numbers[i]= numbers[j];
			numbers[j]= tempNumber;
		}
		
		System.out.println("Numbers in descending order");	
		for( i=0;i<3;i++)
		System.out.println(numbers[i]);
		
	
		
	}

}
//Scanner scanner = new Scanner(System.in);
//int numbers[] = new int[3];
//int tempNumber;
//System.out.println("Enter three numbers - ");
//for (int i = 0; i < numbers.length; i++)
//    numbers[i] = scanner.nextInt();
//for (int i = 0; i < numbers.length; i++) {
//    for (int j = i + 1; j < numbers.length; j++) {
//        if (numbers[i] < numbers[j]) {
//            tempNumber = numbers[i];
//            numbers[i] = numbers[j];
//            numbers[j] = tempNumber;
        }