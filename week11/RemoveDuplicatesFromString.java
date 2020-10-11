package week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesFromString {
	/*
	 * 1 - Remove duplicates from a string.
	 * a)Show the number of the unique letters
	 * b)Write a method that will accept one string argument and return it without duplicates. 
	 * 
	 * 
	 * Karakartal - 6 (Karktl)
	 * aNkara - 4 (aNkr)
	 */

	 /*
	  * Data Structures :
	  * 	List - ordered data collection
	  * 	Set - unordered unique data collection
	  * 	Map - Key, Value type data collection
	  */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word : ");
		String word = input.nextLine();
		printUniqueLetters(word);
		printOrderedUniqueLetters(word);
	}
	
	private static void printOrderedUniqueLetters(String word) {
		List<Character> list = new ArrayList<Character>();
		
		for (int i = 0; i < word.length(); i++) {
			Character c = word.charAt(i);
			if(list.contains(c)){
				continue;
			}else{
				list.add(c);
			}
		}
		System.out.println(list);
		
	}

	public static void printUniqueLetters(String word){
		Set<Character> setOfChars = new HashSet<>();
		
		for (int i = 0; i < word.length(); i++) {
			setOfChars.add(word.charAt(i));
		}
		System.out.println(setOfChars.size());
		System.out.println(setOfChars);
	}

}
