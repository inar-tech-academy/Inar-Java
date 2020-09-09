package interviewQuestions.week02;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		// Swap two numbers
		System.out.println("Please enter two digits");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt() ;
		int b = input.nextInt();
		System.out.println("a :" + a + " b:" + b);
		
			
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a :" + a + " b:" + b);
		
		
	}
//1 - Karakter girmek
//2 - Exceeding boundaries
//3 - sifirlik
//4 - empty values
//5 - individual limits
}
