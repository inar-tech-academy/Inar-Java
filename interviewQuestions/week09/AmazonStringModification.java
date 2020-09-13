package interviewQuestions.week09;

public class AmazonStringModification {
	/*
	 * Write a function that takes one String and one int as parameters and does
	 * the following: M,i,c,r,o,s,o,f,t,2 -> crosoftMi
	 * 
	 * Microsoft, 2 ftMicroso
	 * 
	 * 
	 * 
	 * tarik, 8
	 * 
	 * null,2 null, -2 boundary !!!
	 * 
	 * 
	 * hazir metotlar yok, substring, split vs.. yok charAt
	 * 
	 * What if ??
	 * 
	 */

	public static void main(String[] args) {
		String word = "Microsoft";
		System.out.println(stringModification(word, 2, false));
	}

	// Microsoft, 2 (7)
	// Microso ft
	// ftMicroso
	// false ->ftMicroso true->crosoftMi
	public static String stringModification(String s, int num, boolean isBegin) {
		int cut = isBegin ? num : s.length() - num;

		String temp = "";
		for (int i = 0; i < cut; i++) {
			temp = temp + s.charAt(i);
		}

		String temp2 = "";
		for (int i = cut; i < s.length(); i++) {
			temp2 = temp2 + s.charAt(i);
		}

		return temp2 + temp;
	}

}
