package interviewQuestions.week05;

import java.util.Scanner;

public class ReverseWords {
	// I Love java and Eclipse -> Eclipse and java Love I
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter s String");
		String s1 = input.nextLine();
		
		System.out.println(reverseWords(s1));
	}
	
	public static String reverseWords(String words){
		String answer = "";
		char space = ' ';
		String newWord = "";
		// java is great
		
		String a = "";
	
		
		for (int i = 0; i < words.length(); i++) {
			 //answer -> java 
			//        -> is java
			//        -> great is java
			if(words.charAt(i) == space){
				answer = newWord + " " + answer;
				newWord = "";
			}else{
				newWord += words.charAt(i);
			}
		}
		
		String cevap = newWord + " " + answer;
		return cevap;
	}
	
	public static String splitWords(String s1){
		String answer = "";
		
		String[] kelimeler = s1.split(" ");
		for (int i = kelimeler.length-1; i >=0 ; i--) {
			answer = answer + " " +  kelimeler[i];
		}
		return answer;
	}

}
