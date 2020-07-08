package day06ifstatemente;

import java.util.Scanner;

public class IfElseIfStatementOdev3 {

	public static void main(String[] args) {
		//Kullacıdan alacağı ürün miktarını ve ürün birim fiyatıni alın.
		//Eger urun miktarı 1000 den fazla ise kullancıya %10 inidirm yapın ve 
		//Ödemesi gereken toplam parayi ekrana yazdırın
		//Diger durumlarda ödemsi gereken toplam paraya herhagi bir indirim yapmada ekrana yazdırın.
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Alacagınız Urun Miktarini Giriniz:");
		double miktar = scan.nextDouble();
		System.out.println("Lutfen Urunun Fiyatini Giriniz:");
		double fiyat = scan.nextDouble();
		
		if(miktar>1000) {
			System.out.println((fiyat*90/100)*miktar);
			
		}else {
			scan.close();
			
		}
	}

}
