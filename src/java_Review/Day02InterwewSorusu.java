package java_Review;

public class Day02InterwewSorusu {

	public static void main(String[] args) {
		//*** interview question***
	       // Verilen iki değeri üçüncü bir değer kullanmadan yerlerini değiştiriniz
	       int  x = 50; //=>10
	       int  y  = 10; //=>50

	       System.out.println("---Değişiklik Öncesi---");
			System.out.println("1. sayi = " +x);
			System.out.println("2. sayi = " + y);
			
			x = x + y;
			y = x-y;
			x = x -y;
			  System.out.println("---Değişiklik ---");
				System.out.println("1. sayi = " +x);
				System.out.println("2. sayi = " + y);
	       
	       
	}

}
