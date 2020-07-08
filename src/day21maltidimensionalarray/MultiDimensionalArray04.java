package day21maltidimensionalarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MultiDimensionalArray04 {

	public static void main(String[] args) {
		
		// ["A", "C","B","C"] OLUSTURUALIM.
		
		
		List<String> list = new ArrayList<String>();
		
		
		list.add("A");
		list.add("C");
		list.add("B");
		list.add("C");
		System.out.println(list);
		
		// Lİst te eleman olarak B var mı?
		
		System.out.println(list.contains("B")); // Eger B eleman olarak varsa true , yoksa false return eder.
		
		// list de eleman olarak Z var mı?
		
		System.out.println(list.contains("Z"));
		
		// list deki elemanları alfabedik sıraya koyunuz
		// Collection bir araya getirilmiş parçalar demek.
		// Bir listeki elemanları alfabatik siraya (Natural Order ) dizmek için.
		// Collections.sort(); parametre yerine list in adını kullanmak lazım. Argument olarak listin adını kullanınız.
		
		Collections.sort(list);
		System.out.println(list);
		
		
		
	}

}
