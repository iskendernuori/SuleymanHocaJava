package day11stringmethods;

import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {
		//Kullanıcıdan başlangıç ve bitiş harflerini alın ve 
		//başlangıç harfinden başlayıp bitiş harfinde biten tüm harfleri büyük harf olarak ekrana yazdırın.

		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen Baslangic Harfi Giriniz");
		char bs =scan.next().toUpperCase().charAt(0);
		System.out.println("Lutfen Son Harfi Giriniz");
		char bt =scan.next().toUpperCase().charAt(0);
		
	
		for(char  i=bs; i<bt; i++ ) {
			System.out.print(i +" ");
				
		}
		
		scan.close();
		
	}

}
