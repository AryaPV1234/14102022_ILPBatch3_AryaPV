import java.util.Scanner;

public class withOutTemporary {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner (System.in);
		int firstNumber;
		int secondNumber;
		
		System.out.println("Enter first number -");
		firstNumber=scanner.nextInt();
		System.out.println("Enter second number -");
		secondNumber=scanner.nextInt();
		firstNumber = firstNumber+secondNumber;
		secondNumber = firstNumber-secondNumber;
		firstNumber = firstNumber-secondNumber;
		System.out.println(firstNumber);
		System.out.println(secondNumber);

	}

}
