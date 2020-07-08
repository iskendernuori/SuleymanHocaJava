package day03operators;

import java.util.Scanner;

public class Wrapper03 {

	public static void main(String[] args) {
		// kullancıdan ad ve soy adını alalım ekrana yazdıralım
		// kullancıdan adresini alıp ekrana yazdıralım (2.cadde Bakirkoy Istanbul Turkiye
		// Kullancıdan yasini alalım ekrana yazdıralim
		// Kullaniciya Turkiye de yasıyorum.  Doğru/ Yanlis diye soralım cevabını ilreana yazdıralım. 
		// True veya false olarak
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen Adinizi yaziniz: ");
		String ad = scan.nextLine();
		
		
		System.out.println("Lutfen Soyadinizi yaziniz: ");
		String soyAd = scan.nextLine();
		
		System.out.println("Lutfen Adresinizi yaziniz: ");
		String adres = scan.nextLine();
		
		System.out.println("Lutfen Yasinizi yaziniz: ");
		byte yas = scan.nextByte();
		
		System.out.println("Turkiye'de yasiyorum. true/false: ");
		boolean blTr = scan.nextBoolean();
		
		
		
		
		
		System.out.println(ad);
		System.out.println(soyAd);
		System.out.println(adres);
		System.out.println(yas);
		System.out.println(blTr);
		
		scan.close();
	}

}
