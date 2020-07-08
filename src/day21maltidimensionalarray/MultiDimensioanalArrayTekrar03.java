package day21maltidimensionalarray;

public class MultiDimensioanalArrayTekrar03 {

	public static void main(String[] args) {
		// arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} } veriliyor.
		// Bu iki array’in tum elemanlarinin toplamini bulan programi yaziniz.
		
		int arr1[][]= { {1,2}, {3,4,5}, {6} }; 
		int arr2[][] = { {7,8,9}, {10,11}, {12} };
		
		int sum1=0;
		int sum2=0;
		
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				sum1= sum1+arr1[i][j];
				System.out.println();
			}
			
		}
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				sum1= sum1+arr2[i][j];
				System.out.println();
			}
			
		}		
		System.out.println(sum1+ sum2);
		
	}

}
