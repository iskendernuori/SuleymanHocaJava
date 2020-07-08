package day10stringmethods;

import java.util.Scanner;

public class StringMethod03 {
	public static void main(String[] args) {
		// charAt() methodu belli indexteki characteri return eder.
		//
		
		String str1 = "Cimbombom";
		// str1 in 4. indexindeki karakteri bulan kodu yaziniz.
		
		
		System.out.println(str1.charAt(4)); // indexi 4 olan character o harfidir.Ekranda O görürüz
		System.out.println(str1.charAt(0));// index 0 ilk harf demektir bu yüzden C return eder
		System.out.println(str1.charAt(7));// hata mesaji verir. Character sayiyindan fazla rakam girdik
											// Exception alirsiniz. Bu da büyük bir hata yaptınız demektir
		
		// length() methodu Stirngin icinde kac character oldugunu verir.
		
		System.out.println(str1.length());// Ekrana 9 yazdirir. Length dirkt chacter sayisini verir. İndex ile farki
										  // Length herzaman index ten 1 fazladir.
		// Soru : Son indexi 9 olan bir Stringin length i kactir. 
		// Cevap: 9+1 olur.
		// length = son index + 1
		
		// Kullanicidan bir  ismini girmesini isteyin.
		// isminin son harfini ekrana yazdirin.
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Lutfen Isminiz Giriniz : ");
		String name = scan.next();
		
		int length = name.length();
		System.out.println (name.charAt(length-1));// length son karakter den 1 fazlasi olduğundan 
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
