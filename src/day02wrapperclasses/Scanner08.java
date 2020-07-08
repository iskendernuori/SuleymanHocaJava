package day02wrapperclasses;

import java.util.Scanner;

public class Scanner08 {

	public static void main(String[] args) {
		

		// Kenar uzunlukları kullanıcıdan alınan bir üçgenin çevresini hesaplayan bir Program yazınız. (byte kullanınız)
		//Not 1: Üçgenin Cevresi: a + b + c
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen kenar uznunluklarini giriniz: ");
		
		byte kenarA = scan.nextByte();
		byte kenarB = scan.nextByte();
		byte kenarC = scan.nextByte();
		
		System.out.println(kenarA + kenarB + kenarC );
		
		//Lütfen kenar uznunluklarini giriniz: 
		//22
		//23
		//24
		//  cevre = 69

		
		scan.close();
		
	}

}
