package day09switchoperator;

import java.util.Scanner;

public class SwitchOdev01 {

	public static void main(String[] args) {
		//1) Kullanıcıdan bir gun alın eğer gun “Cuma” ise ekrana “Müslümanlar için kutsal gün” yazdırın.
		// “Cumartesi” ise ekrana “Yahudiler için kutsal gün” yazdırın. “Pazar” ise ekrana
		// “Hıristiyanlar için kutsal gün” yazdırın. Diler günler icin “Kutsal gün değil” yazdırın.

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen Bir Gun Girin : ");
		String day = scan.next();
		day = day.toUpperCase();
		
		switch(day) {
			case "Cuma":
			System.out.println("Muslumanlar Icin Muberek Gun ");
			break;
			case "Cumartesi":
				System.out.println("Yahudiler Icin Kutsal Gun ");
				break;
			case "Pazar":
				System.out.println("Hristiyanlar Icin Kutsal Gun ");
				break;
			default:
				System.out.println("Kutsal Gun Degil");
				
			scan.close();
		}
		
		
		
		
	}

}
