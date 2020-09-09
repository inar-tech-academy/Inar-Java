package interviewQuestions.week05;

import java.util.Scanner;

public class RemoveTheSecondStringChars {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter s String");
		String s1 = input.nextLine();
		System.out.println("Please enter s String");
		String s2 = input.nextLine();

		String s = removeSecondString(s1, s2);
		System.out.println("Removed version is : " + s);

	}

	// s1 =india is great
	// s2 =in
	// answer =da s great
	public static String removeSecondString(String s1, String s2) {
		String answer = "";
		// 1 - ilk kelimeden (s1) harf al
		// 2 - ikinci kelimede(s2) var mi yok mu control et
		// 3 - yoksa answer'a ekle || varsa step 1 e don

		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);

			boolean varMi = false;
			for (int j = 0; j < s2.length(); j++) {
				char s2harf = s2.charAt(j);
				if (ch == s2harf) {
					varMi = true;
				} 
			}
			
			if (varMi) {
				continue;
			} else {
				answer = answer + ch;
			}
			
			
		}

		return answer;
	}
}
