package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoopTekrar {

	public static void main(String[] args) {
	// String içeren bir array oluşturun, elemanlarini yanyan aralarına bosluk koyarak 
		// for each loop ile yazdirin
		
		String arr[]= {"Ramazan", "Mahmut", "Rıza", "Nur"};
		
		for(String w: arr){
			System.out.print(w + " ");
			
		}
		// integer elemanlar içeren bir list oluştur
		// for each ile elemanlarin toplamını ekrana yazdirn
		
		
		List<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(3);
		list.add(3);
		int sum= 0;
		for(int w:list) {
			sum= sum+w;
		}
		System.out.println(sum);
		
		
		
	}

}
