package day19arrays;

public class ArraysTekrar02 {

	public static void main(String[] args) {
	// 4 elemanli bir array oluşturun, bu array a eleman atamasi yapıp
		// for dongusu ile yazdirin
		// son elemanı yazdirin
		
				
		
		
		
		char arr[] = new char[4];
		arr[0]= 'a';
		arr[1]= 'b';
		arr[2]= 'c';
		arr[3]= 'd';
		for(int i= 0; i<4; i++) {
			System.out.print(arr[i] + " ");
			
		
		}
		System.out.println(arr[3]);
		System.out.println(arr.length); // String den farki farantezsiz olamasi
		System.out.println(arr[arr.length-1]);
		
		

	}

}
