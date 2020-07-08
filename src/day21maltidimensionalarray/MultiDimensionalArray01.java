package day21maltidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArray01 {

	public static void main(String[] args) {
		//MultiDimensionalArray olusturma :  (2 boyutlu oluşturma)
		
		int arr[][] =  new int[3][4]; 
		System.out.println(Arrays.toString(arr)); // [[I@1540e19d, [I@677327b6, [I@14ae5a5] dış stringin adreslerini yazdirir.
		
		System.out.println(Arrays.deepToString(arr)); // kokune kadar yazdır deemek. 
		
		// deger atama 1. yontem.
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		arr[0][3]=4;
		
		arr[1][0]=5;
		arr[1][1]=5;
		arr[1][2]=6;
		arr[1][3]=7;
		
		arr[2][0]=8;
		arr[2][1]=9;
		arr[2][2]=10;
		arr[2][3]=11;
		
		
		
		System.out.println(Arrays.deepToString(arr));
		System.out.println(arr[1][3]);
		System.out.println(arr[2][2] +arr[0][3]);
		
		
		
		
		
		
	}

}
