package day09switchoperator;

import java.util.Scanner;

public class ArtikYilTernaryInterview {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Lutfen  Yil Giriniz : ");
		int yil = scan.nextInt();
		
		//Ternary kalıp :    () ? ():()   temel kalıp bu
		String result =(yil % 100 == 0 && yil %400== 0) ? "Artik Yil" : (yil % 100 != 0 && yil % 4 == 0 ? "Artık Yil" : "Artik Yil Degil");
		System.out.println("Result : " + result);
		
		//String result=(year%100==0)?  (year%400==0? "artik yil": "artik yil degil") : (year%4==0? "artik yil":"artik yil degil");	
		
		//String result = (yil%100==0) ? (yil%400==0) ? "Artik Yil" : "Artik Yil Degil") :(yil%4==0 ? "Artik Yil" : "Artik Yil Degil");
		//System.out.println("Result : "  + result");
		
		
		
		
		scan.close();
	}


		
	}


