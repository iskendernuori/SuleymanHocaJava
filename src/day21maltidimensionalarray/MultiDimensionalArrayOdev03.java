package day21maltidimensionalarray;

public class MultiDimensionalArrayOdev03 {

	public static void main(String[] args) {
		//Aşağıdaki multi dimensional array’lerin iç array’lerinde aynı index’e sahip elemanların toplamını ekrana yazdıran bir program yazınız
		//arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }

		int arr1 [][]= { {1,2}, {3,4,5}, {6} } ;
		int arr2 [][] = { {7,8,9}, {10,11}, {12} };
		
		int sum= 0;
	
		
		for(int i = 0; i<arr1.length; i++) {
			for(int j= 0; j<arr1[i].length; j++) {
				for(int x=0; x<arr2.length; x++) {
					for(int y=0; y<arr2[x].length; y++) {
						if(i==x && j==y) {
							sum= sum+ arr1[i][j] + arr2[x][y];
						}
					}
				}
							}
			System.out.println(sum);
			
		
		
	
				}	
		
	}

			
	}

