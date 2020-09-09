package week08;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word :");
		String word1 = input.nextLine();

		System.out.println("Please enter another word :");
		String word2 = input.nextLine();

		System.out.println("Are '" + word1 + "' and '" + word2 + "' anagram?");
		System.out.println(" - " + isAnagram(word1, word2));
	}

	static boolean isAnagram(String word1, String word2) {
		// earth -heart
		// a,b,c,d.....z
		// 0,1,2,3.....,25

		// iills ssiil
		int[] harfler = new int[26];

		fillArray(harfler, word1, true);
		fillArray(harfler, word2, false);

		for (int i = 0; i < harfler.length; i++) {
			if (harfler[i] != 0) {
				return false;
			}
		}
		return true;
	}

	static void fillArray(int[] arr, String s, boolean ekle) {
		int a = ekle ? 1 : -1;

		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i) - 'a'] = arr[s.charAt(i) - 'a'] + a;
		}
	}
}
