package interviewQuestions.week05;

import java.util.Scanner;

public class StringReplacement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String word = input.nextLine();
		
		String answer = seslileriDegistir(word);
		System.out.println(answer);
	}
	
	public static String seslileriDegistir(String kelime){
		// sesli harfler yerine x yazdiriniz, while/for 
		// Java Is Fun -> Jxvx xs Fxn
		// a,e,i,o,u -> x
		// o/w -> olani yazdir
		String cevap ="";
		int uzunluk = kelime.length();
		
		for(int i=0; i < uzunluk; i++ ){
			char harf = kelime.toLowerCase().charAt(i);
			
			if(harf == 'a' || harf == 'e'|| harf == 'i'|| harf == 'o'|| harf == 'u'){
				cevap = cevap + 'x';
			}else{
				cevap = cevap + kelime.charAt(i);
			}
		}
		//cevap = Jxvx
		return cevap;
	}

}
