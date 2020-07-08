package day21maltidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
	
		// Array lerde length sabittir, degistirilemez,
		// ArrayList lerde "List" length esnektir. Siz eleman ekledikçe List length ini arttırır.
		// siz eleman sildikçe List length ini azaltır.
		
		int arr[] = {1,2,3};
		
		//List<String> list01 = new List<>() bu olamaz
		//ArrayList<String> list01 = new List<>()==> bu olmaz
		//ArrayList<String> list01 = new ArrayList<>()==> bu olabilir
		
		// yaygın kullanım 
		//List<String> list01 = new ArrayList<String>(); cok kullanılan
		// aşagıdaki kullanım da yaygındır
		
		
		
		List<String> list01 = new ArrayList<>();
		System.out.println(list01);
		
		// List e eeleman eklemek için add() methodu kullanılır. 
		
		list01.add("Ali");  /// kaldırdığımızda [] boş olr
		System.out.println(list01); // [Ali ]
		
		list01.add("Can");
		System.out.println(list01);

		
		// Veli yi ali ile can ın arasına ekleyin
		
		list01.add(1, "Veli");
		System.out.println(list01);//[Ali, Veli, Can]
		
		
		//[Han, Ali, Kemal, Veli, Can, Ayşe]
		
		
		list01.add(0, "Han");
		System.out.println(list01);
		list01.add(1, "Kemal");
		System.out.println(list01);
		list01.add("Ayse");
		System.out.println(list01);
		
		// list01 in eleman sayisini ekrana yazdiriniz.
		System.out.println("Eleman Sayisi :" + list01.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
