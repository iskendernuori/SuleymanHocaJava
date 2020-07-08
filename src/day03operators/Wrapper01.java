package day03operators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {
		// Kullanıcıdan ad ve soyadını alıp ekrana bir program yazdırma
		//(string kullnınız)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen adinizi ve soyadinizi giriniz:");
		
		String isim = scan.nextLine();// stringleri almak için 2 yöntem vardır
		                              //next() veya nextln() kullanılır
		                              // next: tek kelimelik strig için
		 							  // nextln: tüm girdiyi  almak için
									  // space i görünce diğer kelimelri bırakır
		System.out.println(isim);
		scan.close();

	}
}
