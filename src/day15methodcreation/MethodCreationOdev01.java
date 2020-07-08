package day15methodcreation;

import java.util.Scanner;

public class MethodCreationOdev01 {

	public static void main(String[] args) {
		// Kullanıcıdan isim ve soyismini alın. 
		// Kullanıcının isim ve soyisminin ilk harflerini büyük diğer harflerini küçük harf olarak ekrana yazdıran programı yazınız.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen İsim Giriniz :");
		String name = scan.nextLine();
		System.out.println("Lutfen Soysim Giriniz :");
		String surname = scan.nextLine();
		newName(name,surname);
		scan.close();
	}
	public static void newName(String name, String surname) {
		System.out.println(name.toUpperCase().charAt(0)+name.substring(1) +" " + surname.toUpperCase().charAt(0)+surname.substring(1));
		
		
	}
	/* SULEYMAN HOCA nin cozumu. bu yontem daha mantıklı ve duzenli
	 *  Kullanıcıdan isim ve soyismini alın. 
		 Kullanıcının isim ve soyisminin ilk harflerini büyük
         diğer harflerini küçük harf olarak ekrana yazdıran programı yazınız.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ilk isminizi giriniz");
		String ilkIsim = scan.next().toLowerCase();
		System.out.println("Soy isminizi giriniz");
		String soyIsim = scan.next().toLowerCase();
		
		isimYazma(ilkIsim, soyIsim);
​
	}
	
	public static void isimYazma(String ilkIsim, String soyIsim) {
		ilkIsim = ilkIsim.substring(0,1).toUpperCase() + ilkIsim.substring(1);
		soyIsim = soyIsim.substring(0,1).toUpperCase() + soyIsim.substring(1);
		
		System.out.println(ilkIsim + " " + soyIsim);
	}

	 */
	
}
