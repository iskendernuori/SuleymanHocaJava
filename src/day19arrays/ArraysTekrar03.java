package day19arrays;

public class ArraysTekrar03 {

	public static void main(String[] args) {
		// elemanlari 1,2,3,4,5 olan integer arry oluşturun
		
	// bu array da 3 elemanının olup olmadığını kontrol ediniz
		// 3 varsa "3 var yazdirin" 3 yoksa 3 yok yazdirin
		
		
//		int arr[] = new int[5];
//		 arr[0]=1;
//		 arr[1]=2;
//		 arr[2]=3;
//		 arr[3]=4;
//		 arr[4]=5;

		 // array 2. yol
		 int arr[]= {1,2,3,4,5};
		 
		 int count = 0;
		 
		 for(int i=0; i<5; i++) {
			 if(arr[i]==3) {
				 count++;			 
			 }
			 }
		 if(count>0) {
			 System.out.println(count +"tane 3 var");
		 }else {
			 System.out.println("3 yok");
		 }
	}

}
