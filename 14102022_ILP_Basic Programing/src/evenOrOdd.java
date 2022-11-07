import java.util.Scanner;

public class evenOrOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int number;
	
		
		System.out.println(" number ");
		number=scanner.nextInt();
		number= number%10;
		
		if(number==0)
		{
			System.out.println("digit is zero");
			
		}
		else if(number%2 ==0)
		{
			System.out.println("digit is even");
			
		}
		else 
		{
			System.out.println("digit is odd");
		}
        
	}

}
