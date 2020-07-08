package day13whiledowhileloops;

import java.util.Scanner;

public class StringMethodOdev02 {

	public static void main(String[] args) {
		//Kullanıcıdan bir String alın ve bu String’in ilk harfi ile son harfinin yerlerini değiştirerek ekrana yazdırın.
		//Ornegin; Kullanıcı “Java” girerse ekrana “aavJ” yazdıracaksınız.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz");
		String word = scan.nextLine();
		
         int length = word.length()-1;
		//int start = word.charAt(0);
		
		System.out.println((word.charAt(length)+ (word.substring(1, length-1))+(word.charAt(0)))); 
		
		
		
		scan.close();
	}

}
