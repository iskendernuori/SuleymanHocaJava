package day21maltidimensionalarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTekrar04 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("C");
		list.add("B");
		list.add("C");
		System.out.println(list);
		
		// list de eleman olarak b var mı? 
		System.out.println(list.contains("B"));
		System.out.println(list.contains("F"));
		
		// list teki elemanlari alfabetik sıraya koyun
		
		Collections.sort(list);
		System.out.println(list);
	}

}
