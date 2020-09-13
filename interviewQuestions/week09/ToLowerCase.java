package interviewQuestions.week09;

public class ToLowerCase {
	/*
	 * Implement function ToLowerCase() that has a string parameter str, 
	 * and returns the same string in lowercase 
	 * (https://leetcode.com/problems/to-lower-case/)
	 * 
	 * HelLo => hello
	 * 
	 * 1. Asama : Sorudan anladigini anlat
	 * 2. Asama : soru sor
	 * - ascii tablosuna gore hareket etmeni istiyorum
	 * - harf disi degerler ayni
	 * - null gelirse, "wrong input" dondur
	 * 
	 * 3. soruyu anlat
	 * 4. soruyu yaz
	 * 5. 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(toLower("TaRik"));
		
	}
	
	public static String toLower(String s) {
		//TaRik
		char[] arr = s.toCharArray();//T,a,R,i,k
		for (int i = 0; i < arr.length; i++) {//0 ... <5
			if ('A' <= arr[i] && arr[i] <= 'Z') {
				arr[i] = (char)(arr[i] + ('a' - 'A'));
			}
		}

		s = String.copyValueOf(arr);
		return s;
		
		
	}

}
