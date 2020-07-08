package day06ifstatemente;

import java.util.Scanner;

public class IfElseIfStatement03 {

	public static void main(String[] args) {
		/*Kullacıdan 6 basamaklı bir  sayi isteyin. 0 ilede başlyabilir
		kazanma ihtimali %20, amortiihtimali %30 , kaybetme ihtimali %50 olan bir 
		jackpot oyunu için program yazınız.
		000000-000001-000002-...-999998-999999==> 1000000
		*/
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen 6 basamakli bir Sayi Giriniz. Sifir basta kullanilabilir");
		
		int num = scan.nextInt();
		
		if(num<200000) {
			System.out.println("Kazandiniz");
		}else if(num<500000) {
			System.out.println("Tekrar Deneyin");
		}else {
			System.out.println("Kaybettiniz");
			
			
			scan.close();
		}
		
		
		
		
	
		
	}

}
