package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperatorOdev01 {

	public static void main(String[] args) {
		//Kullanıcıdan bir tamsayı girmesini isteyin, tamsayı çift ise ekrana “Çift” tek ise ekrana “Tek”
		//yazdırın.
			
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen Bir Tamsayi Giriniz : ");
		int num = scan.nextInt();
		
		String result = num % 2 == 0 ? "Cift Sayi " : "Tek Sayi";
		System.out.println("Result : " + result );
		
		scan.close();
	}

}
