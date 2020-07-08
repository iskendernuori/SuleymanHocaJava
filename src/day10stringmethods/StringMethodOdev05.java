package day10stringmethods;

import java.util.Scanner;

public class StringMethodOdev05 {

	public static void main(String[] args) {
		//Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin ilk iki harfini büyük harf olarak ekrana yazdırın.
//System.out.println(merhaba.toUpperCase
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Yasadıgınız Ulkeyi Giriniz");
		String live = scan.next();
		
		System.out.println(live.substring(0, 2).toUpperCase() + live.substring(2));
	
		scan.close();
	}

}
