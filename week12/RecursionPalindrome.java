package week12;

import java.util.Scanner;

public class RecursionPalindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word : ");
		String word = input.nextLine();
		// level -> true
		// inar -> false
		if (isPalindrome(word)) {
			System.out.println(word + " is Palindrome, CONGRATS!!!");
		} else {
			System.out.println("NOPE");
		}
	}

	private static boolean isPalindrome(String word) {
		if (word.charAt(0) != word.charAt(word.length() - 1)) {
			return false;
		} else if (word.length() < 2) {
			return true;
		} else {
			return isPalindrome(word.substring(1, word.length() - 1));
		}
	}

}
