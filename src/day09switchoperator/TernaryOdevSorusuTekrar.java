package day09switchoperator;

import java.util.Scanner;

public class TernaryOdevSorusuTekrar {

	public static void main(String[] args) {
		//Kullanıcıdan bir pozitif tamsayı girmesini isteyin, o tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
		//3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
		//Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Lutfen Bir Pozitif Tamsayi Giriniz : ");
	int num = scan.nextInt();
	
	String result = (num>99 && num<1000) ? "Uc Basamakli Sayi" :((num%2==0)? "Uc Basamakli Olmayan Cift Sayi" : "Uc Basamakli Olmayan Tek Sayi");
	System.out.println("Result :" + result);
	
	
	
	
	scan.close();
	}
	
	

}
