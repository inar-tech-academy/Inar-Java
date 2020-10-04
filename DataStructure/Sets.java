package DataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sets {
	/*
	 * Given a string define how many different words it has.
	 * Ex : I love java since I have started Introduction to java Programming.
	 */

	public static void main(String[] args) {
		
		Set<String> myset = new HashSet<>();
		myset.add("Tarik");
		myset.add("Serhat");
		myset.add("Akif");
		
		System.out.println(myset);
		
		myset.add("Tarik");
		myset.add("Serhat");
		myset.add("Ozgur");
		System.out.println(myset);
		
		String text = "I love java since I have started Introduction to java Programming.";
		
		
		String[] array = text.split(" ");
		Set<String> set = new HashSet<>(Arrays.asList(array));
		System.out.println(array.length);
		System.out.println(Arrays.toString(array));
		System.out.println(set.size());
		System.out.println(set);
		

	}

}
