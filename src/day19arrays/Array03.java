package day19arrays;

public class Array03 {

	public static void main(String[] args) {
		
		// Elemanlari 1,2,3,4,5 olan bir integer array olusturunuz
		// Bu erray de 3 elemanın olup olmadıgını kontorol ediniz.
		// 3 varsa ekrana "3 var yazdirin". 
		// 3 yoksa ekrana " 3 yok yazidirin"
		// kac tane 3 oludğunu da yazdirin
		
	/* Array olusturup Eleman eklemek icin 1.yol 
		 
//		int arr[] = new int[5];
//		arr[0] =1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
*/		
         
  // Array olusturup eleman eklemek için 2. yol
		
		int arr[] = {1,2,3,4,5,3,3};
		
		int count = 0;// flag bayrak denir
		
		for(int i = 0; i<7; i++) {
			if(arr[i]==3) {
				count++;
			
			}
			
		}
		if (count>0 ) {
			System.out.println(count + "tane " + " " + "3 var");
		}else {
			System.out.println("3 yok");
		}
		
		
		
	}

}
