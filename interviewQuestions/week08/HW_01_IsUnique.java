package interviewQuestions.week08;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*Is Unique: Implement an algorithm to determine if a string has all unique characters. 
 * Inar -> true
 * Los Angeles -> false (ee) 
 */

/*
 * 
 */
public class HW_01_IsUnique {
	public static void main(String[] args) {
		
		String isim = "afife";
		HashSet<Character> mySet = new HashSet<>();
		for (int i = 0; i < isim.length(); i++) {
			mySet.add(isim.charAt(i));
		}
		System.out.println(mySet);
		
		
		System.out.println(mymethod(isim));
		
	}
	
	static boolean mymethod(String isim){
		ArrayList<Character> list = new ArrayList<>();
		
		
		for (int i = 0; i < isim.length(); i++) {
			char harf = isim.charAt(i);
			
			if(list.contains(harf)){
				return false;
			}else{
				list.add(harf);
			}
		}
		return true;
	} 

}
