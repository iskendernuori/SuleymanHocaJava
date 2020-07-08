package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator03 {

	public static void main(String[] args) {
		
		
		// Kullanıcıdan 2  sayi alınız
		// Kucuk sayiyi ekrana yazdiriniz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen iki Sayi giriniz");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
		double sonuc = num1 >= num2  ? num2 : num1;
		System.out.println(sonuc);
		
		scan.close();
	}

}
