package tekrarlarDigerKaynaklar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTekrar01 {

	public static void main(String[] args) {
	
		
		
		List<String> list = new ArrayList<>();
		
		list.add("Ahmet");
		list.add("Rıza");
		list.add("Ramazan");
		list.add("kos");
		list.add("neden");
		list.add("bize");
		
		System.out.println(list);
		
		list.remove("kos");
		System.out.println(list);
		
		list.remove("bize");
		System.out.println(list);
		
		
		
		
		String cumle = "Kara kasların, kirpiklerine vuruldum. Sorma neden sorma cunku artık asığım ben.";
		
		String kelime [] =  cumle.split(" ");
		System.out.println(Arrays.deepToString(kelime));
		
		System.out.println(kelime.length);
		
		String harf [] = cumle.split("");
		System.out.println(Arrays.deepToString(harf));
		System.out.println(harf.length);
		
		
		
		

	}

}
