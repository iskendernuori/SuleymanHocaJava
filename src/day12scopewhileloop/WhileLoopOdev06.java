package day12scopewhileloop;

import java.util.Scanner;

public class WhileLoopOdev06 {

	public static void main(String[] args) {
		//Kullanıcıdan başlangıç ve bitiş harflerini alın ve 
		//başlangıç harfinden başlayıp bitiş harfinde biten tüm harfleri büyük harf olarak ekrana yazdırın. 
		//Kullanıcının hata yapmadığını farz edin.
		
		
		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen baslangic Harfini giriniz :");
		char start = scan.next().toUpperCase().charAt(0);
		System.out.println("Lutfen bitiş harfi giriniz :");
		int finish =scan.next().toUpperCase().charAt(0);
		
		while(start<finish) {
			System.out.print(start + " ");
			start++;
		}
scan.close();
	}

}
