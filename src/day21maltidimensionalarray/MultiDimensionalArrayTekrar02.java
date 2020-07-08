package day21maltidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArrayTekrar02 {

	public static void main(String[] args) {
		
// multi dimesional Array olusturup deger atama 2. yol
		
		int arr[][] = {{1,2}, {3}, {4,5,6}}; // 2,3 ve 6 nın toplamını ekrana yaz
		
		System.out.println(Arrays.deepToString(arr));
		System.out.println(arr[0][1] + arr[1][0]+ arr[2][2]);
		
		// array in tum elemanlarinin toplamanı ekrana yazdiriniz
		int sum= 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				sum= sum+arr[i][j];
			}
			
		}
		System.out.println(sum);
	}

}
