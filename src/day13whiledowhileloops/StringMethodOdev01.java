package day13whiledowhileloops;

import java.util.Scanner;

public class StringMethodOdev01 {

	public static void main(String[] args) {
		//Kullanıcıdan uzunluğu çift sayı olan bir String alın ve bu String’in ilk yarısını ekrana yazdırın.
		//Ornegin; Kullanıcı “Hollanda” girerse ekrana “Holl” yazdıracaksınız.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir kelime giriniz :");
		String word = scan.next();
		
		int str = (word.length()-1)/2;
		System.out.println(word.substring(0,str));
		
		
		
		
		
		scan.close();
	}

}
