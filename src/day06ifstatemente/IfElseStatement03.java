package day06ifstatemente;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
		// Kullanıcıdan alacağı ürün miktrını ve fiyatını alalım
		//Eğer kullancı 1000 den fazla ürün alırsa %20 indirim yapan 
		//ve kullancının ödeyeceği toplam fiyatı ekrana yazdırın
		//1000 den az veya 1000 ürün alırsa indirim yapmayın
		// ve kullanıcının odeyeceği toplam fiayatı ekrana yazdırın
		// para konularında double kullanalaım
		// 60tl ye %20 inidirm ==> 60*80 /100  
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen Ürünün miktarıni giriniz: ");
		double miktar = scan.nextDouble();
		
		System.out.println("Lütfen Ürünün Birim Fiyatıni giriniz");
		double fiyat = scan.nextDouble();
		
		if(miktar >1000) {
			System.out.println(miktar*(fiyat*80)/100);
		
		}else {
			System.out.println(miktar*fiyat);
			
			
			scan.close();
			
		}

	}

}
