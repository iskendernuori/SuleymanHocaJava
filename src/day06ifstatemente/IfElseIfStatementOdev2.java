package day06ifstatemente;

import java.util.Scanner;

public class IfElseIfStatementOdev2 {

	public static void main(String[] args) {
		//Kullancıdan bir ucgennin üç kenar uzunlugunu alın eğer üç genar uzunlugu birbirine eşitse
		//Ekrana "Eşkenar Ucgen" yazdırın. Değilse "Eskenar Degil" yazdırın
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 1.Kenar Uzunlugunu Giriniz:");
		double kenar1 = scan.nextDouble();
		System.out.println("Lutfen 2.Kenar Uzunlugunu Giriniz:");
		double kenar2 = scan.nextDouble();
		System.out.println("Lutfen 3.Kenar Uzunlugunu Giriniz:");
		double kenar3 = scan.nextDouble();

		
		if(kenar1==kenar2 && kenar1==kenar3) {
			System.out.println("Eskenar Ucgen");
			
		}else {
			System.out.println("Eskenar Ucgn Degil");
			scan.close();
		}
		
		
		
		
		
	}

}
