package day07nestedif;

import java.util.Scanner;

public class ArtikYilSorusuInterview {

	public static void main(String[] args) {
		
		// Kullanicidan yil girmesini isteyin
		// Girilen yil artik yil ise ekrana “Artik Yil” yazdirin
		// Girilen yil artik yil degil ise ekrana “Artik Yil Degil” yazdirin.
		
		// Artık yıl 1) yıl 100 e bölünürse 400 de bölünmeli
				   //2) yıl 100 e bölünmezse 4 e bölünmeli 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen Yılı Giriniz:");
		int yil = scan.nextInt();
		
		if(yil%100 == 0 && yil%400 == 0 ) {
			System.out.println(yil + " artik yildır");
		}else if(yil % 100 !=0 && yil % 4 == 0) {
			System.out.println(yil  + " artik yildır");	// 2020 artık yildir yazdıralım
		}else {
			System.out.println(yil + " artik yil degildir");	
			scan.close();
		}
	}

}
