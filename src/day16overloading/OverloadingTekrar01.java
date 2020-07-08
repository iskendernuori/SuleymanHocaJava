package day16overloading;

public class OverloadingTekrar01 {

	public static void main(String[] args) {
		
		// iki sayinin toplamını ekrana yazdiran bir method oluşsurunuz
		
		
		toplama(2,4);
	}
	
	
	
	public static void toplama(int num1, int num2) {
		System.out.println(num1+num2);
		
	}
	public static void toplama(  ) {
		System.out.println(2+3);
		

	}
}