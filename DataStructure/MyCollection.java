package DataStructure;

import java.util.ArrayList;

public class MyCollection {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Munchen");
		list.add("Ankara");
		list.add("Seattle");
		list.add(2, "Istanbul");
		
		ArrayList<String> copyList = new ArrayList<>();
		
		System.out.println("This is copyList " + copyList.toString());
		System.out.println(list.toString());
		
		copyList = (ArrayList) list.clone();
		System.out.println(copyList.toString());

		list.remove(3);
		
		System.out.println(list.toString());
		
		String sehir =list.get(1);
		System.out.println(sehir);
		
		list.set(0, "Hamburg");
		System.out.println(list.toString());
		
		//set, get, add, remove, add(index,element), addAll, removeAll,clear, size
		
		System.out.println(list.size());
		System.out.println(list.size());
		
		//
		
		
	}

}
