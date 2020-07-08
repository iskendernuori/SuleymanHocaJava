package replit;

public class ArraysOrtalama {

	public static void main(String[] args) {
//		Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.
//
//		Array =  [20, 30, 25, 35, -16, 60, -100 ]


		int arr[]= {20, 30, 25, 35, -16, 60, -100};
		
		
		System.out.println("Sayıların ortalaması: "+ ortalama(arr));
		
		
		
		
	}
	public static double ortalama(int[] arr) {
	
	
	int sum = 0;
	for(int i=0; i<arr.length; i++) {
		sum = sum+arr[i];
	}
	sum = sum/arr.length;
	return (double) sum;
		
		
//		
//		
		
//int arr[] = {20, 30, 25, 35, -16, 60, -100};	
//		
//		System.out.println("Array Sayılarının ortalaması: "+ortalama(arr));
//		
//	}
//	
//		

		
		
		
		
	}

}
