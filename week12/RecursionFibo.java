package week12;

import java.util.Scanner;

public class RecursionFibo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an int num : ");
		int num = input.nextInt();

		// 0  1  1  2  3  5  8  13 21 34  55
		// 1. 2. 3. 4. 5. 6. 7. 8. 9. 10. 11.

		int Fibonacci = Fibonacci(num);
		System.out.println(Fibonacci);
	}

	private static int Fibonacci(int i) {
		if (i == 2) {
			return 1;
		} else if (i == 1) {
			return 0;
		} else {
			return Fibonacci(i - 2) + Fibonacci(i - 1);
		}
	}
}
