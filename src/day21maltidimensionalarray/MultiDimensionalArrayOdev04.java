package day21maltidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArrayOdev04 {

	public static void main(String[] args) {
//		Aşağıdaki multi dimensional array’in iç array’lerindeki tum elemanların toplamını birer birer bulan ve 
//		herbir sonucu yeni bir array’in elemanı yapan ve yeni array’i ekrana yazdıran bir program yazınız
//		{ {1,2,3}, {4,5}, {6,7} }
//		Ornegin; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}

		
	/*	int arr[][] = { {1,2,3}, {4,5}, {6,7} };
		
		int sum1= 0;
		int sum2=0;
		int sum3=0;
		
		
		
		System.out.println(Arrays.deepToString(arr));
//		
		for(int i= 0; i<arr[0].length; i++) {
			sum1 = sum1 +arr[0][i];
		}	
		System.out.println(sum1);
			
		for(int j=0 ; j<arr[1].length; j++) {
			sum2 = sum2 +arr[1][j];
		}	
		System.out.println(sum2);
		for(int k= 0; k<arr[2].length; k++) {
			sum3 = sum3 +arr[2][k];
		}			
			
		System.out.println(sum3);	
		
		
		int arrTpl []= {sum1, sum2, sum3};
		
		System.out.println(Arrays.toString(arrTpl));
					
				}
	*/
		
		int arr[][] = { {1,2,3}, {4,5,11}, {6,7}, {8, 9, 10}};
		int arrToplam[] = new int[arr.length];
		
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				sum = sum + arr[i][j];
			}			 
			arrToplam[i] = sum;
			sum=0; // 3 farklı dongu kullanmamak için, sum=0 yapıp donguyu kırıyoruz. tekrar for a geri donup iç array in ikinci elemanına geçer.
		}
		
		System.out.println(Arrays.toString(arrToplam));
	}

		
		
		
		
		
		
		
		
	}


