package day06ifstatemente;

import java.util.Scanner;

public class IfElseStatementOdev2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen Ilk Sayiyi Giriniz:");
		double sayi1 = scan.nextDouble();
		System.out.println("Lutfen Ikinci Sayiyi Giriniz:");
		double sayi2 = scan.nextDouble();
		
		double sonuc = sayi1*sayi2;
		System.out.println("sonuc ="+sonuc);
		
		
		if((sayi1<0) && (sayi2<0) || (sayi1>0) && (sayi2>0)) {
			System.out.println("Ayni Isaretli");
			
		}else {
			System.out.println("Farkli Isaretli");
			
		}
		if((sayi1==0) || (sayi2==0)) {
			System.out.println("Sayilardan En az biri O dır.");
			scan.close();
		}
		
		
	}

}
