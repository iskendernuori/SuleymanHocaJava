package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperatorOdev06 {

	public static void main(String[] args) {
		//Kullanıcıdan bir tamsayı girmesini isteyin, o tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
		//3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın. Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen Bir Tamsayi Giriniz");
		int num = scan.nextInt();
		
		String result = num >99 && num<1000  ?  "3 Basamakli" : (num % 2 == 0 ? "Uc Basamakli Olmayan Cift Sayi" : "3 Basamakli Cift Olmayam Tek Sayi");
		System.out.println("Result :" +result);	
		
		
		scan.close();
		
	}

}
