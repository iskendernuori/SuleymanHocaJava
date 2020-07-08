package day20arrays;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
		// Bir array in icinde belli bir elemanin var olup olmadığını kontrol ediniz.
		// birnarySearch() methodu bu iş için kullanılır. 
		// ONEMLİ NOT : binarySearch() methodunu kullanmadan once, sort() methodunu kullanmak zorundasınız. 
		// Aksi takdirde; binarySeach() methodu manali bir sonuc vermez.
		
		
		int arr[]= {1,5,2,4,3,9,9};
		
		// yukarıda verilen array de 3 elaman olarak var mı? 
		
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 3));// burada aradığımız sayinin indexini verirr. True veya false vermez.
														// binarySerach() aranan eleman var olduğunda o elemanaın index ini verir.
		
		System.out.println(Arrays.binarySearch(arr, 7));// olmayan elemanda negatif deger veriir.  -6 verdi. VAR OLSA İDİ 6. ELEMAN OLACAKTI AMA YOKKKK
		
		System.out.println(Arrays.binarySearch(arr, 9)); // 9 dan iki tane var. BINARYSEARCH() ARDIĞI ELEMANI BULDUGUNDA BREAK VERİR. YANİ FIRST İNDEX İ VERİR
		
		
		int arr1[]= {1,5,2,4,3,6,9};
		
		System.out.println(Arrays.binarySearch(arr1, 8));
	}

}
