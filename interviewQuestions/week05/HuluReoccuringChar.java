package interviewQuestions.week05;

import java.util.Scanner;

public class HuluReoccuringChar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter s String");
		String word = input.nextLine();

		char c = findTheReoccuringChar2(word);
		System.out.println("The first reoccuring char is : " + c);

	}

	// metodumuzun bir String parametresi olsun
	// ilk tekrar eden char i dondursun

	// Tarik Akan -> a
	// word = Tarik Akan
	// temp = Tarik A

	// Afife -> f

	// 1 - yeni bos bir string olusturalim
	// 2 - tek tek word kelimesindeki harfleri once barmi diye kontrol edelim
	// yoksa yeni stringe atalim

	public static char findTheReoccuringChar(String word) {
		char cevap = ' ';
		String temp = "";
		// herhangin bir degeri String ile birlestirirsek = String olur
		// "" + 4.5 = "4.5"

		for (int i = 0; i < word.length(); i++) {
			char harf = word.charAt(i);
			if (!temp.contains("" + harf)) {
				temp = temp + harf;
			} else {
				return harf;
			}
		}

		return cevap;
	}

	public static char findTheReoccuringChar2(String word) {
		char cevap = ' ';
		// tarik akan
		// a (i ==1 , j=7)
		for (int i = 0; i < word.length() - 1; i++) {
			for (int j = i + 1; j < word.length(); j++) {
				if (word.charAt(i) == word.charAt(j)) {
					return word.charAt(i);
				}
			}
		}

		return cevap;
	}

}