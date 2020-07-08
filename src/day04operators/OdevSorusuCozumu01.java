package day04operators;

import java.util.Scanner;

public class OdevSorusuCozumu01 {

	public static void main(String[] args) {
		// Kullancıdan integer aldıktan sonra String alamıyoruz.
		
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Yasınızı Giriniz:");
	//	int yas = scan.nextInt(); int değerinden sonra string giremiyoruz. Aama yaşı string olarka alırsak sıkıntı olmaz
	// Java da netInt() kullandıktan sonta nextLine()	kullanırsak kod çalışmıyor
	// Integer.parselInt() kullanarak integer'a çevir.	
		String yas = scan.nextLine();
		int yeniYas = Integer.parseInt(yas);// stringi tam sayıya çevirme yöntemidir
		// Integer.parseInt() sadece rakam içeren strinler için
		System.out.println(yeniYas + 1);
		
		System.out.println("Adinizi ve Soyadinizi Giriniz");
		
		String isim = scan.nextLine();
		System.out.println(isim);
		
		scan.close();
	}

}
