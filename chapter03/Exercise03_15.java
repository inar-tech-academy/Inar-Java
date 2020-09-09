package chapter03;

import java.util.Scanner;

public class Exercise03_15 {
	/*
	 * Revise Listing 3.8, Lottery.java, to generate a lottery of a three digit
	 * number. The program prompts the user to enter a three-digit number and
	 * determines whether the user wins according to the following rules: 1. If
	 * the user input matches the lottery number in the exact order, the award
	 * is $10,000.
	 * 
	 * 2. If all digits in the user input match all digits in the lottery
	 * number, the award is $3,000.
	 * 
	 * 3. If one digit in the user input matches a digit in the lottery number,
	 * the award is $1,000.
	 */

	public static void main(String[] args) {
		int luckyNum = (int) (100 + (Math.random() * 900));// Math.random 0
															// dahil 1 haric
															// araliginda random
															// sayi atar
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your lucky number :");
		int num = input.nextInt();

		int luckyNum1 = luckyNum % 10;
		int luckyNum10 = (luckyNum / 10) % 10;
		int luckyNum100 = luckyNum / 100;

		int num1 = num % 10;
		int num10 = (num / 10) % 10;
		int num100 = num / 100;

		// 825 -528 - 258 - 285 - 852-..
		// 387
		if (num == luckyNum) {
			System.out.println(luckyNum + "Congrats!! You won $10,000");
		} else if ((luckyNum1 == num1 || luckyNum1 == num10 || luckyNum1 == num100)
				&& (luckyNum10 == num1 || luckyNum10 == num10 || luckyNum10 == num100)
				&& (luckyNum100 == num1 || luckyNum100 == num10 || luckyNum100 == num100)) {
			System.out.println(luckyNum + "Congrats!! You won $3,000");
		} else if ((luckyNum1 == num1 || luckyNum1 == num10 || luckyNum1 == num100)
				|| (luckyNum10 == num1 || luckyNum10 == num10 || luckyNum10 == num100)
				|| (luckyNum100 == num1 || luckyNum100 == num10 || luckyNum100 == num100)) {
			System.out.println(luckyNum + "Congrats!! You won $1,000");
		}else {
			System.out.println(luckyNum + " LOOSER!!");
		}

	}

}
