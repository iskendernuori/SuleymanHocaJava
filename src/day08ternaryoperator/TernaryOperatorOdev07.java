package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperatorOdev07 {

	public static void main(String[] args) {
		
		//Kullanıcıdan bir yıl girmesini isteyin, yıl artık yıl ise ekrana “Artık yıl” degilse ekrana “Artık yıl degil” yazdırın.
		// Artık yıl 1) yıl 100 e bölünürse 400 de bölünmeli
		   //2) yıl 100 e bölünmezse 4 e bölünmeli 

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen  Yil Giriniz : ");
		int yil = scan.nextInt();
		
		
		String result =(yil % 100 == 0 && yil %400== 0) ? "Artik Yil" : (yil % 100 != 0 && yil % 4 == 0 ? "Artık Yil" : "Artik Yil Degil");
		System.out.println("Result : " + result);
		
		//String result=(year%100==0)?  (year%400==0? "artik yil": "artik yil degil") : (year%4==0? "artik yil":"artik yil degil");	
		
		scan.close();
	}

}
