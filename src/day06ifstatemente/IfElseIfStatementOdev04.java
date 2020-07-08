package day06ifstatemente;

import java.util.Scanner;

public class IfElseIfStatementOdev04 {

	public static void main(String[] args) {
		//Kullanıcıdan bir üçgenin üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana
		//“Eşkenar üçgen” yazdırın. Sadece iki kenar uzunluğu birbirine eşit ise ekrana
		//“Ikizkenar üçgen” yazdırın. Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar üçgen yazdırın”

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Ucenin 1.Kenarını Giriniz:");
		double kenar1 = scan.nextDouble();
		System.out.println("Lutfen Ucenin 2.Kenarını Giriniz:");
		double kenar2 = scan.nextDouble();
		System.out.println("Lutfen Ucenin 3.Kenarını Giriniz:");
		double kenar3 = scan.nextDouble();
		
		if(kenar1==kenar2 && kenar1==kenar3) {
			System.out.println("Eskenar Ucgen");
		}else if(kenar1==kenar2 || kenar1==kenar3 || kenar2==kenar3) {
			System.out.println("Ikiz Kenar Ucgen");
			
		}else {
			System.out.println("Cesit Kenar Ucgen");
			scan.close();
		}
	}
	

}
