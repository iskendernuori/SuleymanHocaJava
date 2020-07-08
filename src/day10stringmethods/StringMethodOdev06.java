package day10stringmethods;

import java.util.Scanner;

public class StringMethodOdev06 {

	public static void main(String[] args) {
		//Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin bastan ikinci harfi ile 
		//sondan ikinci harfini büyük harf olarak ekrana yazdırın.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Yasadıgınız Ulkeyi Giriniz");
		String live = scan.next();
	
		System.out.println(live.substring(1,2).toUpperCase()+ live.substring(live.length()-2,live.length()-1).toUpperCase() );

		
		
		
		
		
		//System.out.println((live.charAt(1)).substring(1));
		
		scan.close();
		
	}

}
