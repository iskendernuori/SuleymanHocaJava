package day11stringmethods;

public class StringMethods02 {

	public static void main(String[] args) {
	
// subtrging() 
		// subtrging() methodu bir String in belli bir bolumunu kesip almak için kullanilir.
		
		String str1 = "Java calisana kolaydir";

//substring() 1. versiyon.
		
		System.out.println(str1.substring(5));// calisana kolaydir. 5 indexi gosterir.
		System.out.println(str1.substring(8));// isana kolaydir. 8. index 8 dahildir.(inclusive)
		System.out.println(str1.substring(22));
		//System.out.println(str1.substring(23));// index 23 yok ama ben olmayan bir yerden kesmek istiyorum.
											   // Bu bir hatali istektir. Java Exception verir. yani beni uyarir hata yapıyorsun.
		
		System.out.println(str1.substring(4));// 0 tamami oluyor. str1.substring(0) =str1 dir. substring(0) hiç kullanılmaz
		
//substring	() 2. versiyon
		System.out.println(str1.substring(5,13)); // ilk index dahil ikinci index dahil degil.
												  
		System.out.println(str1.substring(6,12));
		System.out.println(str1.substring(6, 6));// kullanilmaz, ekranda birşey göremezsiniz
		//
		
		System.out.println(str1.substring(7, 6));// 7 den başlayıp 6 da durulmaz. exception verir.
		
		
		
		
		
		
	}

}
