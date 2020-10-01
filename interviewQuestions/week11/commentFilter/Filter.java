package interviewQuestions.week11.commentFilter;

public class Filter {
	/*
	 *  - badwords : String[]
	 *  -----------------------
	 *  + addBadWords(String) : void
	 *  + removeBadWords(String) : void
	 *  + filterBadWords(String) : boolean
	 */
	
	private static String[] badwords = {"idiot" , "dumb"};
	
	public static void addBadWords(String word){
		badwords = new String[badwords.length + 1];
		badwords[badwords.length-1] = word;
		
	}
	
	public static boolean filterBadWords(String text){
		//dumba dumb idiots !!!
		// this product is dumb!=> ["this", "product", "is" "dumb!"]
		String[] words = text.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < badwords.length; j++) {
				if(words[i].equalsIgnoreCase(badwords[j])){
					return false;
				}
			}
		}
		return true;
	}

}
