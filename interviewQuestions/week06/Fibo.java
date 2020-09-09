package interviewQuestions.week06;

import java.util.Scanner;

public class Fibo {
	// Interviewda soru cevaplarken
	/*
	 * 1. Soruda anladigini anlat 
	 * 2. Edge case leri sor (Negatif sayi verirse,doublem int, float, null, 0, sayi limit) 
	 * 		a - null verilirse 
	 * 		b - edge case(limitler) 
	 * 		c - type (return type, parameter type) 
	 * 		Can I assume the number is int? Can I assume it is in the boundaries? 
	 * 3. Soru cozumunu sozel olarak anlat 
	 * 4. Kodu yaz
	 * 5. Test et
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = input.nextInt();


		printFibonacci(number);
	}

	private static void printFibonacci(int step) {
		for (int i = 0; i < step; i++) {
			System.out.print(findFibonacci(i) + "  ");
		}
	}

	private static int findFibonacci(int num) {
		if (num < 2) {
			return 0;
		}
		if (num == 2) {
			return 1;
		}
		int num1 = 0;
		int num2 = 1;
		int sum = num1 + num2;
		for (int i = 1; i < num; i++) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
		return num2;
	}

}
