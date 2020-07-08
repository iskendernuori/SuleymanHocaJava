package day04operators;

import java.util.Scanner;

public class Modulus03 {

	public static void main(String[] args) {
		// kullanıcıdan 3 bir tamsayi alın bu sayinin. bu sayinin rakamları toplamını bulun.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen uc basamaklı bir tam sayi giriniz:");
		
		int sayi = scan.nextInt();
		
		int sonRakam  = sayi % 10;
		int v  = sayi /10;
		
		int ortaRakam = v % 10;
		int ilkRakam  = sayi / 100;
		
		System.out.println(ilkRakam + ortaRakam + sonRakam);
		
		
		scan.close();	
				

	}

}
