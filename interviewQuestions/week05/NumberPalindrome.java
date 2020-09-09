package interviewQuestions.week05;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String word = input.nextLine();
		System.out.printf("Is %s palindrome? -%b",word, isPalindrome(word));

	}
	
	// tarik -> kirat -> false
	// anna -> anna -> true
	// a nna -> ann a -> false
	public static boolean isPalindrome(String kelime){
		boolean isPalindrome =false;
		String s = "";
//		byte, short, int, long
//		float, double
//		boolean, char
		
		int uzunluk = kelime.length();
		
		for (int i = uzunluk-1; i >=0; i--) {
			s = s + kelime.charAt(i);
		}
		
		
		if(s.equals(kelime)){
			isPalindrome =true;
		}else{
			isPalindrome = false;
		}
		
		return isPalindrome;
//		return s.equals(kelime);
	}

}
