package day37maps;

import java.util.HashMap;

public class Maps01 {

	public static void main(String[] args) {
		// Map bir interface dir. Map interface inin 3 child classi vardır
		/* 1) HashMap:  HashMap key-value yapisini kullanir. Key ve value
		 *    			programci tarafından yazilir
		 *    			key ve value da null degeri kullanilabilir. key de
		 *    			birden fazla null degeri kullanilirsa Java son kullanilan Null i
		 *    			kabul eder
		 *    			Value da birden fazla null degeri kullanilabilir.
		 *    			HashMap konsola yazdirildiğinda hem key degerleri hemede 
		 *    			value degerleri aralarına  = sembolu konularak yazdirilir.
		 *    			HashMap ler ekrana yazdirirken rastgele siralama yapar
		 *    			HashMap ler arasinda en hızlisidir
		 *    			HashMap "trend Safe " degildir. bazen bir app a aynı anda
		 *    			iki birlikte çalışabilir.
		 *    			App buna musaitse "thread safe" deniyr
		 */

		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(3,"Ali");
		hashMap.put(1, "Veli");
		hashMap.put(2, "Mine");
		System.out.println(hashMap);
		
		hashMap.remove(4);
		System.out.println(hashMap);
		
		System.out.println(hashMap.remove(3,"Veli"));
		System.out.println(hashMap.remove(3, "Ali"));
		
		
		System.out.println(hashMap.get(1));
		System.out.println(hashMap.get(34));
		System.out.println(hashMap.keySet());
		System.out.println(hashMap.values());
		System.out.println(hashMap.size());
		System.out.println(hashMap.containsKey(2));
		System.out.println(hashMap.containsKey(45));
		
		System.out.println(hashMap.containsValue("Mine"));
		System.out.println(hashMap.containsValue("Rıza"));
		
		hashMap.replace(2, "Emin");
		System.out.println(hashMap);
		hashMap.clear();
		System.out.println(hashMap);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
