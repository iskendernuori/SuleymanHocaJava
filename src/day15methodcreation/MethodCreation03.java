package day15methodcreation;

import java.util.Scanner;

public class MethodCreation03 {

	public static void main(String[] args) {
		// basit hesap makinasi 
		// kullancıdan yapacağı işlemi işlem sembolu ile secmesini saglayin
		// kullancıdan 2 sayi girmesini isteyelim
		// girilen iki sayi ve secilen sayiya göre sonucu ekrana yazdirin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("+, -, *, : islemlerinden birini secin :");
		char islem = scan.next().charAt(0);
		System.out.println("İslem Yapmak İçin İki sayi giriniz :");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
		hesapMakinasi(islem,num1,num2);// sıralama asagidaki hesapMakinasi methodundaki sıra ile ayni olmasi gerekiyor.
		
		
		scan.close();
	}
	
	public static void hesapMakinasi(char islem, double num1, double num2) {
		
		switch(islem) {
		case '+':
			System.out.println(num1 + "+" + num2 + " ="+ (num1+num2));
			break;
		case '-':
			System.out.println(num1 + "-" + num2 + " ="+ (num1-num2));
			break;
		case '*':
			System.out.println(num1 + "x" + num2 + " ="+ (num1*num2));
			break;
		case ':':
			System.out.println(num1 + ":" + num2 + " ="+ (num1/num2));//5.0:0.0 =Infinity cıkar.   0.0:0.0 =NaN
			break;
		default:
			System.out.println("+,-,x,: dısında girmeyiniz :" );
		}
	}

}
