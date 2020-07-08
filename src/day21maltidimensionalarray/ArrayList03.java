package day21maltidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {

	public static void main(String[] args) {
		// ["Ali", "Can", "Ayse", "Ali"]
		
		List<String> list = new ArrayList<>();
		
		list.add("Ali");
		list.add("Can");
		list.add("Ayse");
		list.add("Ali");
		System.out.println(list);
		
		//list.remove("Ali"); // ilk gorduğunu uzaklaştırır.
		System.out.println(list);
		
		list.remove("Can");
		System.out.println(list);
		
		//list.remove("Ayse");
		//System.out.println(list); // remove metodu listede olmayan elemanlarla alakalı hata vermez
		
		list.remove("Kemal");
		System.out.println(list); //kemal yok o yuzden silmiyor fakar hata da vermiyor. hiç birsey yapmıyor
								  //sayıyla yapınca exeption verir. olmayan index i kullanmak her zaman exeption veirr
		
								//Remove methodun içine sayı yazarsak onu sayı olarak dusunur ama sayı dısında birsey yazarsam 
									//onu index olarak dusunmez.
		System.out.println(list.remove("Ali")); // evet  Ali var uzaklastırdım diye true veriri.
		
		System.out.println(list.remove("Kemal"));// kemal e baktım listede yok. False verdi
		
		System.out.println(list.remove(0));
		
		// Ayşe elemanını Guzel Ayse yapalım... bunun için set methodu kullanılır
		
		list.set(0, "Aysegul");
		System.out.println(list);
		
		// list e "Kenan" ve "Zeynep"  ekleyelim
		
		list.add("Kenan");
		list.add("Zeynep");
		System.out.println(list);
		
		list.clear();
		System.out.println(list); // true işinin boş olduğunu ogrendik
		System.out.println(list.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
