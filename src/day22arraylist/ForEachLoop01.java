 package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	public static void main(String[] args) {
	
// For Each Loop, for loop un ust versiyonudur. 
//Diger adı "Enhanced( zenginleştırme)	Foor Loop" da denir.
		
		
		int arr[]= {12,21,13,43};
		
		// for loop kullanarak elemanları ekrana yazdır
		for(int i= 0; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		//for each  loop kullanarak elemanları ekrana yazdır
		
		
		for(int w : arr) {
			System.out.println(w);
		}
		
		
		// String içeren bir array oluşturun, elemanlarını yanyana aralarına bosluk koyarak 
		// for each loop ile errana yazdiriniz
		
		
		String arr1[] = {"Seni", "Cok", "Seviyorum"};
		
		for(String w : arr1) {
			System.out.print(w + " ");
		}
		
		// Integer elemanlar iceren bi r list olusturun . For each loop kuulanarak 
		// bu elemanların toplamını ekrana yazdırın
		
		System.out.println();
		
		List<Integer> list = new ArrayList<>();
		
		list.add(11);
		list.add(21);
		list.add(33);
		list.add(23);
		
		int sum= 0;
	
		for(int w : list) {
			sum=sum+w; 
		}
		
		System.out.println(sum);
		
		
		
		// {{1,2}, {5}, {6,7,8}} array indeki tum elemanların toplamını bulunuz.
		
		int arr3[][]= {{1,2}, {5}, {6,7,18}};
		int sum1 = 0;
		
		for(int [] w : arr3) {
			for(int z : w) {
				sum1 = sum1+ z;
				
			}
			System.out.println(sum1);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

