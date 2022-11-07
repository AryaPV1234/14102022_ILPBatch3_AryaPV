import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner (System.in);
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		
		System.out.println("Enter first number -");
		firstNumber=scanner.nextInt();
		System.out.println("Enter second number -");
		secondNumber=scanner.nextInt();
		System.out.println(" number before swapping  "+ firstNumber + secondNumber);
		thirdNumber=firstNumber;
		firstNumber=secondNumber;
		secondNumber=thirdNumber;
		
		System.out.println(" number after swapping" + firstNumber + secondNumber);

	}

}
