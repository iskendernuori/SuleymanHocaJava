package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator02 {

	public static void main(String[] args) {
		// kullancıdan 2 sayi alın
		// Bu sayilar birbirine esit ise toplamlarini ekrana yazdirin
				// Bu sayilar birbirinden farkli ise carpimlarini ekrana yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen ilk  sayiyi giriniz");
		double num1 = scan.nextDouble();
		System.out.println("Lutfen ikinci sayiyi giriniz");
		double num2 = scan.nextDouble();
		
		
		double  sonuc = (num1==num2 ) ? (num1 + num2)  : (num1*num2);
		
			System.out.println(sonuc);	
				

			
			scan.close();
	}

}
