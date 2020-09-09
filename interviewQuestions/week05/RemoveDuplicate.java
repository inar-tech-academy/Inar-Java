package interviewQuestions.week05;

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String word = input.nextLine();
		String kelime = removeDuplicate(word);
		System.out.println(kelime);

	}
	
	public static String removeDuplicate(String kelime){
		String cevap = "";
		
		//abca -> kelime
		//ab    -> cevap

		for (int i = 0; i < kelime.length(); i++) {
			//if cevap ta a harfi varsa -> pas gec
			//   cevap ta a harfi yoksa -> a yi cevaba ekle
			
			// cevap stringinde a harfi var mi yok mu?
			char harf = kelime.charAt(i);//b
			boolean harfVarMi = false;
			for (int j = 0; j < cevap.length(); j++) {
				if(cevap.charAt(j) == harf){
					harfVarMi = true;
					break;
				}
			}
			
			if(harfVarMi){
				continue;//pas gecer
			}else{
				cevap = cevap + harf ;
			}
		}
	
		
		return cevap;
	}

}
