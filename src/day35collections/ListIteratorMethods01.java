package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods01 {

	public static void main(String[] args) {
	// elemanlari A, B  ve C stringleri olan bir list oluşstuunuz
		
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		
// listiterator oluşturunuz . 
		
		ListIterator<String> listIterator = list.listIterator();
		
		while (listIterator.hasNext()) { // bir sonraki eleman varsa dongu çalışacak, yoksa kırılacak
										 // iterator kullanırken her zaman while kullanılır
		Object element = 	listIterator.next();
			System.out.print(element + " ");
		}
		System.out.println();
		
		
		// hasPrevious()  ve previous() methodlarini kullanrak 
		// bir listin elemanlarini tersten yazdirmak isterseniz mutlaka 
		// once hasNext() ve next() kullanmalisiniz.
		
		while(listIterator.hasPrevious()) { // previous bir onceki demek.
			Object element = listIterator.previous();
			System.out.println(element + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
