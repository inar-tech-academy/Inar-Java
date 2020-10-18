package week12;

import java.util.Scanner;

public class RecursionEx {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = input.nextLine();

		// tarik

		// t
		// a
		// r
		// i
		// k
		// print(word);

		// tarik -> kirat
		printReverseWord(word);
		// palindrome mu? kayak => true , level => true, inar => false

	}

	// inar - r
	// ina - a
	// in - n
	// i - i
	
	private static void printReverseWord(String word) {
		int a = word.length() - 1;// 3

		try {
			System.out.print(word.charAt(a));
			System.out.println();
			
		} catch (Exception e) {
			System.out.println("HATALI");
			
		} finally{
			System.out.println("FINALLY");
		}

		if (word.length() != 0) {//HATA VAR
			printReverseWord(word.substring(0, a));//kFINALLY ...   HATALI FINALLY
			//kFINALLY ...  HATALI
		}

	}

	private static void print(String word) {
		String a = word;// tarik -> t yazdir ve sil
		System.out.println(a.charAt(0));
		if (a.length() != 1) {// Base case
			print(a.substring(1));
		}
	}

	private static void print(String word, int i) {
		if (i < word.length()) {// Base Case
			System.out.println(word.charAt(i));
			print(word, (i + 1));
		}
	}

}
