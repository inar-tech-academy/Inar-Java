package DataStructure;

import java.util.ArrayList;
import java.util.Scanner;

public class IsimEkle {
	//Listeye userdan input alip islem yapin, eger + ile basliyorsa ekleyin, - ile basliyorsa cikartin,
	// ! 
	//+Ibo 
	//+Tarik
	//-Ibo
	//! yazdir ve bitir
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
		System.out.println("Please enter a student name");
		String isim = "";
		
		do{
			isim =input.nextLine();
			//-tarik
			if(isim.startsWith("+")){
				list.add(isim.substring(1));
			}else if(isim.startsWith("-")){
				list.remove(isim.substring(1));
			}else{
				continue;
			}
			
		}while(!isim.equals("!"));
		
		System.out.println(list);
		

	}

}
