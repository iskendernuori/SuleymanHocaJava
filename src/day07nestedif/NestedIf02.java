package day07nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		// Kullanıcıdan password girmesini isteyin.
		// password 4 basamakli bir sayi ise cift olup olmadigini kontrol edin. 
		// Cift sayi ise "Password tamam" yazdırın ekraana  //sayi>999--- sayi<10000 
		// Tek sayi ise "Tekrar Deneyin" yazdırin
		// Password 4 basamakli degil ise "Tekrar deneyin"
		// 0123 için Java 123 demektir. int girerseniz başta 0 ı kabul etmez, yok sayar
		// Başa 0 koymak isterseniz String yazmanız gerekiyor
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Tamsayi Olan Password Giriniz: ");
		
		int pass = scan.nextInt();
		
		if(pass>999 || pass<10000) {
			if(pass % 2 == 0) {
				System.out.println("Password Tamam");
				}else if(pass%2 != 0) {
					System.out.println("Tekrar Deneyin");
				}else {
					System.out.println("Tekrar Deneyin");
				}
				
			}
			scan.close();
		
	}

}
