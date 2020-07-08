package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTekrar01 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		System.out.println(list1.equals(list2));
		
		list1.add("A");
		System.out.println(list1.equals(list2));// flase
		
		list2.add("B");
		System.out.println(list2.equals(list1));// true
		// indexleri ve srialamasi ayni olmasi gerekiyorç
		
		
		
		
		
	}

}
