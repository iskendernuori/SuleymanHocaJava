package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu01 {

	public static void main(String[] args) {
		//Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin bastan ikinci harfi ile 
				//sondan ikinci harfini büyük harf olarak ekrana yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Yasadiginiz Ulkeyi Giriniz : ");
		String live = scan.nextLine();
		
	System.out.println(live.toUpperCase().charAt(1));
	System.out.println(live.toUpperCase().charAt(live.length()-2));
	
	scan.close();
	
		
	}

}
