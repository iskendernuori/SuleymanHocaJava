package day09switchoperator;

import java.util.Scanner;

public class TernaryOdevSorusu {

	public static void main(String[] args) {
	/*
		Kullanıcıdan bir pozitif tamsayı girmesini isteyin, o tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
		3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
		Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”
	*/	
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Lutfen Bir Sayi Giriniz");
		int num = scan.nextInt();
		
		String result =(num>99 && num<1000) ? ("3 Basamakli") :(num%2==0 ? "3 Basamakli Olmayan Cift Sayi" : "3 Basamakli Olmayan Tek Sayi Yazdiniz");
		System.out.println("Result :" + result);
		
		
		scan.close();
	}

}
