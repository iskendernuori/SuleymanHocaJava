package day04operators;

import java.util.Scanner;

public class ModulusOdev1 {

	public static void main(String[] args) {
		
		
		// Kullacının girdiği 5 basamakı bir sayinin ilk ve son rakamlarının toplamını ekrana yazdıracak bir program yazınız
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen 5 basamakli bir sayi giriniz: ");// 34345
		
		int sayi = scan.nextInt();
		
		int sonRakam = sayi % 10;
		
		int ilkRakam = sayi / 10000;
		
		System.out.println(sonRakam + ilkRakam);
		
		scan.close();
				
	}

}
