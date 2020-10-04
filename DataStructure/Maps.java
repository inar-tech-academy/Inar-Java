package DataStructure;

import java.util.HashMap;
import java.util.Map;

public class Maps {
	/*
	 * Bir stringdeki kelimeleri sayilariyla beraber yazdiriniz
	 * 
	 * ben sen ben o sen
	 * 
	 * ben - 2
	 * sen - 2
	 * o - 1
	 */

	public static void main(String[] args) {
		Map<String, String> myMap = new HashMap<>();
		
		myMap.put("hamza", "belcikada");
		myMap.put("akif","istanbul");
		myMap.put("tarik", "seattle");

		myMap.putIfAbsent("hamza", "br");
		myMap.put("tarik","a");

		printWordsWithNumbers("I love java programming since I have started java programming");
		/*
		 * I love java programming since I have started java programming programming
		 * I - 2
		 * love -1
		 * java - 2 
		 * programming - 
		 * since -1
		 * have -1
		 * started - 1
		 */
	}
	
	static void printWordsWithNumbers(String text){
		Map<String, Integer> myMap = new HashMap<>();
		String[] array = text.split(" ");
		
		for (int i = 0; i < array.length; i++) {
			String kelime = array[i];
			
			if(myMap.containsKey(kelime)){
				int sayi = myMap.get(kelime);
				myMap.put(kelime, (sayi+1));
			}else{
				myMap.put(kelime, 1);
			}
		}
		System.out.println(text);
		System.out.println(myMap);
	}

}
