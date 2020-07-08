package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator06Tekrar {
	
	public static void main(String []args ) {
		
		
		
		// Kullancıdan bir sayi alınız
					// Sayi çift ise 10 bolunup bolunmedigini kontrol ediniz?
					// Sayi 10 a bolunuyorsa "Woow10" yazdiriniz.
					// 10 bolunmuyorsa "Yazik10" yazdiriniz
					// sayi tek ise 5 e bolunup bolunmedgini kontrol ediniz
					// sayi 5 bolunurse "Woow 5" yazdiriniz?
					// 5 bolunmuyorsa "Yazik" yazdiriniz
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir sayi giriniz :");
		double sayi = scan.nextDouble();
		
		
		String sonuc =(sayi%2==0 ? (sayi%10==0 ? "Wow10": "Yazik10" ) :(sayi%5==0 ? "Woow5" : "Yazik"));
		System.out.println("Sonuc : " + sonuc);
		
		
		
		scan.close();
	}
	
	
	

}
