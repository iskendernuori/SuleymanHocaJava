package day20arrays;

import java.util.Arrays;

public class ArraysTekrar04 {

	public static void main(String[] args) {
		
		// bir aray in içnde bir eleman var olup olmadığını kontrol ediniz
		//binarySearch() kullanılır. bundan once sorth kullanmak gerekir
	
		int arr[]= {1,5,2,4,3};
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr,3));
		System.out.println(Arrays.binarySearch(arr,7));
		
	}

}
