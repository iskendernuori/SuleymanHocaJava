package day11stringmethods;

public class StringMethod02Tekrar {

	public static void main(String[] args) {
		// subtrging() 
				// subtrging() methodu bir String in belli bir bolumunu kesip almak için kullanilir.
				
		String str1 = "Dunya sana guzel.";
			System.out.println(str1.substring(2));//	nya sana guzel.
			System.out.println(str1.substring(6));// sana guzel.
			
			System.out.println(str1.substring(2, 6)); // ilk index dahil 2. index dahil degil
			System.out.println(str1.substring(8, 11)); // 8 ve 11 index arasini yazdirdik
	}

}
