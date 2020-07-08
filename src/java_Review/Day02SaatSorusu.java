package java_Review;

import java.util.Scanner;

public class Day02SaatSorusu {

	public static void main(String[] args) {
		// Scanner kullanarak kullanıcıdan 
		// saat, dakika ve saniye bilgilerini alarak sonucu yazdırınz
		// saat,dakika, saniye -->int
		// PM veya AM--> String
		// Örn: 11:25:33 PM
		
		Scanner scan = new Scanner(System.in);
		String amOrPm = "";
		
		System.out.println("Lutfen Saati Giriniz :");
		int st = scan.nextInt();
		System.out.println("Lutfen Dakkikayi Giriniz :");
		int dk = scan.nextInt();
		System.out.println("Lutfen Saniyeyi Giriniz :");
		int sn = scan.nextInt();
		System.out.println("Lutfen Lutfen AM veya PM Degerini Giriniz :");
		amOrPm = scan.next();
		System.out.println("saat : " + st + ":" + dk +":"+ sn + " " + amOrPm) ;
		
		
		
		scan.close();
		
		

	}

}
