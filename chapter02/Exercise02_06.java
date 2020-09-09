package chapter02;

import java.util.Scanner;

public class Exercise02_06 {
	/*
	 * (Sum the digits in an integer) Write a program that reads an integer
	 * between 0 and 1000 and adds all the digits in the integer. For example,
	 * if an integer is 932, the sum of all its digits is 14. Hint: Use the %
	 * operator to extract digits, and use the / operator to remove the
	 * extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93. Here is a
	 * sample run
	 * 
	 * Enter a number between 0 and 1000: 999 The sum of the digits is 27
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a digit");
		int num = input.nextInt();
		
		int birler = num % 10;
		int onlar = (num /10) % 10;
		int yuzler = num / 100;
		
		System.out.println(birler + onlar + yuzler);
		
	}

}
