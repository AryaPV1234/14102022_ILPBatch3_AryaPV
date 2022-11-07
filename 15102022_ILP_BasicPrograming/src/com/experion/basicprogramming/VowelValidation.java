package com.experion.basicprogramming;

import java.util.Scanner;

public class VowelValidation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		char oneLetter ;
		
		
		System.out.println(" Enter a character ");
		oneLetter=scanner.next().charAt(0);
		switch (oneLetter)
		{
		case 'a':
			System.out.println(oneLetter + " is Vowel ");
			break;
		case 'e':
			System.out.println(oneLetter + " is Vowel ");
			break;
		case 'i':
			System.out.println(oneLetter + " is Vowel ");
			break;
		case 'o':
			System.out.println(oneLetter + " is Vowel ");
			break;
		case 'u':
			System.out.println(oneLetter + " is Vowel ");
			break;
	}
	}
	
}
