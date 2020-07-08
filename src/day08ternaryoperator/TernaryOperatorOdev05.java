package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperatorOdev05 {

	public static void main(String[] args) {
		
		//Kullanıcıdan bir dikdörtgenin en ve boyunu girmesini isteyin. En ve boy eşit ise ekrana “Kare”
		//farklı ise ekrana “Dikdörtgen” yazdırın.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen Dikdortenin En Uzunlugunu Giriniz : ");
		double en = scan.nextDouble();
		System.out.println("Lutfen Dikdortenin Boy Uzunlugunu Giriniz : ");
		double boy = scan.nextDouble();
		
		String result = en == boy ? "Kare" : "Dikdortgen";
		System.out.println("Result : " + result);
		
		
	scan.close();	
		
	}

}
