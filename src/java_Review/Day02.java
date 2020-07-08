package java_Review;

public class Day02 {

	public static void main(String[] args) {
		// verilen iki sayının yerlerini değiştiriniz
		
        int num1 = 11; // ==>33
        int num2 = 33;// ==>11
		
		
		
		
		
		System.out.println("---Değişiklik Öncesi---");
		System.out.println("1. sayi = " +num1);
		System.out.println("2. sayi = " + num2);
		
		// ilk once 1. sayi degerini temp(geciciDeger) içerisine atiyoruz
		int temp =num1;
		
		// 2. sayi degerini 1.sayiya atıyoruz.
		num1 = num2;
		
		// ve son olarak tem içindeki değeri 2. sayiya eşitliyoruz
		
		num2= temp;
		System.out.println("---Değişiklik Sonrasi ---");
		System.out.println("1. sayi = " +num1);
		System.out.println("2. sayi = " + num2);
		
			
		
		
	}

}
