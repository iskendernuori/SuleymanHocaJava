package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethodsTekrar02 {

	public static void main(String[] args) {
		// Elemenanlari A, B, C olan bir list oluşturunuz.
		// List iterator kullanarak bu elemanlari AW, BW ve CW ye donsturunuz.
		
		List<String> list	= new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		
		ListIterator<String> listIterator = list.listIterator();
		
		while(listIterator.hasNext()) {
			Object element = listIterator.next();
			listIterator.set(element + "W");
			
		}
		System.out.println(list);
		list.add("Kemal");
		list.add("Can");
		
		System.out.println(list);
//		System.out.println();
//		while(listIterator.hasPrevious()) {
//			Object element = listIterator.previous();
//			System.out.println(element + "W " );
//		}
			
		
		

	}

}
