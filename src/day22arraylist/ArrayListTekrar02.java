package day22arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTekrar02 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Ali");
		list.add("Can");
		
		System.out.println(list);
		String arr[] = list.toArray(new String[0]);
		System.out.println(Arrays.deepToString(arr));
		
		String arr2[] = {"Ali", "Can"};
		
		List<String> list1 = Arrays.asList(arr2);
		System.out.println(list1);
		//list1.remove(0); kullanılmaz
		System.out.println(list1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
