package chapter02;

import java.util.Scanner;

public class Exercise02_13 {
	/*
	 * Suppose you save $100 each month into a savings account with the annual
	 * interest rate 5%. Thus, the monthly interest rate is 0.05/12 = 0.00417.
	 * After the first month, the value in the account becomes 100 * (1
	 * +0.00417) = 100.417 After the second month, the value in the account
	 * becomes (100 + 100.417) * (1 + 0.00417) = 201.252 After the third
	 * month,the value in the account becomes (100 + 201.252) * (1 + 0.00417) =
	 * 302.507 and so on.
	 * 
	 * Write a program that prompts the user to enter a monthly saving amount
	 * and displays the account value after the sixth month. (In Exercise 5.30,
	 * you will use a loop to simplify the code and display the account value
	 * for any month.)
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a score");
		int score = input.nextInt();
		
		if (score >= 90.0)
			System.out.println("A");
		else if (score >= 80.0)
			System.out.println("B");
		else if (score >= 70.0)
			System.out.println("C");
		else if (score >= 60.0)
			System.out.println("D");
		else
			System.out.println("F");
		
		boolean isTrue = 0 < 5;
		
		if(false){
			System.out.println("deneme");
		}
		
		char c = 'k';
		
		
		switch(c){
		case 45:
			System.out.println("A");
			break;
		
		}
		
		System.out.println((12 > 7) + "" +  (5 * 8 + 12 -4) + "" +  (12 > 7));
	}

}
