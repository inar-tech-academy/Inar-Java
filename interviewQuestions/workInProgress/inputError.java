package interviewQuestions.workInProgress;

import java.util.Scanner;

public class inputError {

	public static void main(String[] args) {
		final int number = 8;

		for (int i = 0; i < number; i++) {
			for (int j = number - i; j > 1; j--) {
				System.out.printf("%4s", " ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.printf("%4d", (int)Math.pow(2, j-1) );
			}
			for (int j = i + 1; j > 0; j--) {
				System.out.printf("%4d", (int)Math.pow(2, j-1));
			}
			
			System.out.println();
		}

	}


}
