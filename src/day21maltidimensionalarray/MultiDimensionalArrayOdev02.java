package day21maltidimensionalarray;

public class MultiDimensionalArrayOdev02 {

	public static void main(String[] args) {
		// Aşağıdaki multi dimensional array’in iç array’lerindeki son elemanların çarpımını ekrana yazdıran bir program yazınız
		
		//{ {1,2,3}, {4,5}, {6} }
	
		
		int arr[][] = { {1,2,3}, {4,5}, {6} };
		int product = 1;
		
		for(int i=0; i<arr.length; i++) {
			product= product*arr[i][arr[i].length];
			
		}
			System.out.println("Son Elemanları carpımı = " + product);
	}

}
