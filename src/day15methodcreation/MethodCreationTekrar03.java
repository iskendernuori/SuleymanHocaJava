package day15methodcreation;

import java.util.Scanner;

public class MethodCreationTekrar03 {

	public static void main(String[] args) {
		// basit hesap makinasi 
				// kullancıdan yapacağı işlemi işlem sembolu ile secmesini saglayin
				// kullancıdan 2 sayi girmesini isteyelim
				// girilen iki sayi ve secilen sayiya göre sonucu ekrana yazdirin.
				
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen  + -  * / işlemlerinden birini secini  :  ");
		char islem =scan.next().charAt(0);
		
		System.out.println("İslem yapmak icin 2 sayi giriniz :");
		double num1 = scan.nextDouble();
		double  num2 = scan.nextDouble();
		hesapMakinasi(islem,num1,num2);
	
		
	}
	public static void hesapMakinasi(char islem, double num1, double num2) {
		
		switch(islem) {
		case '+':
			System.out.println(num1+num2 + " = " + (num1 + num2));
			break;
		case '-':
			System.out.println(num1-num2 + " = " + (num1 - num2));
			break;
		case '*':
			System.out.println(num1*num2 + " = " + (num1 * num2));
			break;
		case '/':
			System.out.println(num1/num2 + " = " + (num1 / num2));
			break;
		default:
			System.out.println("+ -  * / dışında işlem giremezsiniz'");
		}
		
	}
}
