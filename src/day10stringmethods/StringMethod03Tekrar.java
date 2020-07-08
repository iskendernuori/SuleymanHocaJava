package day10stringmethods;

import java.util.Scanner;

public class StringMethod03Tekrar {

	public static void main(String[] args) {
		
		String str1 ="mavimavimasmavi";
		
		System.out.println(str1.charAt(4));
		System.out.println(str1.charAt(9));
		System.out.println(str1.charAt(14));
	
		System.out.println(str1.length());// 15 verir. lenght de indx 1 den başlar. 0 dan başlamaz. direkt karakterleri sayar.
		
		
		// Kullanicdan ismini girmesini isyelim, sonra isminin son harfini ekrana yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen İsminizi Giriniz");
		
		String isim =scan.next();
		
		int lenght = isim.length();
		
		System.out.println(isim.charAt(lenght-1));
		
		scan.close();
	
		
	}
	

}
