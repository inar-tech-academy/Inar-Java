package interviewQuestions.week06;

import java.util.Scanner;

public class Fibonacci {
	// 0,1,1,2,3,5,8...etc
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = input.nextInt();
		System.out.println(number + " th fibonacci number is " + findNthFibonacciNumber(number));

		for (int i = 0; i < number; i++) {
			System.out.print(findNthFibonacciNumber(i) + " ");
		}

	}

	public static int findNthFibonacciNumber(int n) {

		int first = 0;
		int second = 1;
		int third = 1;

		if (n < 1) {
			return 0;
		} else if (n == 1 || n == 2) {
			return 1;
		} else {
			while (n > 2) {
				first = second;
				second = third;
				third = first + second;
				n--;
			}

			return third;
		}

	}

}
