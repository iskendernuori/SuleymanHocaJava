package day20arrays;

import java.util.Arrays;

public class ArraysTekrar02 {

	public static void main(String[] args) {
		// Bir int array in elemanlarini kucuten buyuge dogru diziniz.
		
		
		int arr[]= {2,11,0,9};
		System.out.println("Siralamdan once : " +Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		char arr2[]= {'a','g', 'c', 'f', 'i','A'};
		System.out.println("Siralamdan once : " +Arrays.toString(arr2));
		Arrays.sort(arr2);
		System.out.println("Siralamadan sonra :" + Arrays.toString(arr2));// ASCII koduna göre sıralar
		
		
		String arr3[] = {"Ali", "geldi", "hosgeldi", "bende geldim","123"};
		System.out.println("Siralamdan once : " +Arrays.toString(arr3));
		Arrays.sort(arr3);
		System.out.println("Siralamadan sonra :" + Arrays.toString(arr3)); // ilk karakterin koduna göre sıralar
		
		boolean arrBl[]= {true,false,false};
		System.out.println("Siralamdan once : " +Arrays.toString(arrBl));
//		Arrays.sort(arrBl);
//		System.out.println("Siralamadan sonra :" + Arrays.toString(arrBl));  // short arrays için kullanılmaz.
		// boolean lar için sort metodu kullanılmaz
		 
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
