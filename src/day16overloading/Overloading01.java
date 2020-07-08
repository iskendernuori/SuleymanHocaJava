package day16overloading;

public class Overloading01 {

	public static void main(String[] args) {
		
		/*
		 * iki sayinin toplamını ekrana yazdiran method olusturunz.
		 * 
		 */
		
		
		toplama(2,3);//METHOD 1
		toplama(7);//METHOD 2
		toplama(2.3,4);//METHOD 3
		toplama(5,4.1);//METHOD 4
		
		
	}
	// Methodun body kismini degistirmek yeterli olmadi.
	// Overloading yapma yollari
	// 1) Parametrelerin sayisini degiştirerek ayni isimli methodlar olusturabilirsiniz.
	// 2) Parmatrelere sayisini degiştirmeden herhangi birinin date type ini 
	//    degiştirerek de ayni isimli methodlar da olusturabilirsiniz.
	//NOTE : toplama(2,3); cagriisi toplama(int num1,int num2) var olduğu sürece
	//		 toplama(int num1,num2) yi kullanir, cunku argument data type ile parmatre
	//		 data type birbir ortusuyor. Fakat birebir ortusen data type yoksa  auto widening e göre 
	//	     Java kullanacagi methodu secer. Auto widening e göre kullanabilecegi bir method yoksa Java hata verir
	// 3) FARKLİ data type indeki parametrelerin yerlerini degistirerek de ayni isimli 
	//	     methodlar olusturabilirz.
	
	
	//METHOD 1
	public static void toplama(int num1, int num2) {
		System.out.println(num1+num2);
	//METHOD 2
	}
	public static void toplama(int num1) {
		System.out.println(num1+num1);
	//METHOD 3
	}
	public static void toplama(double num1, int num2) {
		System.out.println(num1+num1);
	//METHOD 4
	}
	public static void toplama(int num2, double num1 ) {
		System.out.println(num1+num1);
	}
}