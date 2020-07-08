package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator03Tekrar {

	public static void main(String[] args) {
				// Kullanıcıdan 2  sayi alınız
				// Kucuk sayiyi ekrana yazdiriniz
				
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen Ilk Sayiyi Giriniz : ");
		double num1 = scan.nextDouble();
		
		System.out.println("Lutfen Ikinici Sayiyi Giriniz : ");
		double num2 = scan.nextDouble();
		
		double result = (num1 >= num2) ? num2 : num1 ;
		System.out.println("result : " + result);
		
		
		scan.close();
	}

}
