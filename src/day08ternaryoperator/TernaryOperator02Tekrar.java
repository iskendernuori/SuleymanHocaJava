package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator02Tekrar {

	public static void main(String[] args) {

				// kullancıdan 2 sayi alın
				// Bu sayilar birbirine esit ise toplamlarini ekrana yazdirin
				// Bu sayilar birbirinden farkli ise carpimlarini ekrana yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 1. Sayiyi Giriniz :");
	    int num1 = scan.nextInt();
		System.out.println("Lutfen 2. Sayiyi Giriniz :");
		int num2 = scan.nextInt();	
		
		int result = (num1==num2) ? (num1 + num2) : (num1 * num2);
		System.out.println("result :" + " " + result  );
		
		
		scan.close();
	}

}
