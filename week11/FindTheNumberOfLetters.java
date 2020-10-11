package week11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindTheNumberOfLetters {
	/*
	 * 2- Count letters. Write a method that will accept a string as an
	 * argument. The method will count the number of appearances of each char
	 * and return map. The key will be a letter and the value will be a number
	 * of appearances in the string. See input and output in the example. Java
	 * -> J - 1, a - 2, v -1
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word : ");
		String word = input.nextLine();
		printTheLettersWithOccurances(word);

	}

	private static void printTheLettersWithOccurances(String word) {
		Map<Character, Integer> map = new HashMap<>();
		
		//ankara
		for (int i = 0; i < word.length(); i++) {
			Character c = word.charAt(i);

			if (Character.isLetter(c)) {
				
				if(map.containsKey(c)){
					int value = map.get(c);
					value++;
					map.put(c,value);
				}else{
					map.put(c, 1);
				}
			}
		}
		System.out.println(map);
		System.out.println(map.keySet());
	}

}
