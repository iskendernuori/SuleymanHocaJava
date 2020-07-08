package day21maltidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArray02 {

	public static void main(String[] args) {
		// Multi Dimesional Array Olusturup Deger Atama 2. Yontem

		int arr[][] = {{1,2}, {3}, {4,5,6,7},{8,9} };
		
		System.out.println(Arrays.deepToString(arr));// [[1, 2], [3], [4, 5, 6]]
		
		System.out.println(arr[0][1] + arr[1][0]+ arr[2][2]);
		
		// arr array indeki tum elemanların toplamını veren programı yazınız. 
		
		int sum=0;
		
		for(int i=0; i<arr.length ;i++) {
			
			for(int j = 0; j<arr[i].length; j++) {
				sum = sum+arr[i][j];
				
			}
			
		}
		
		System.out.println("Tum elemanlarin Toplamı :" +sum);
		
		
	}

}
