package day04operators;

import java.util.Scanner;

public class ModulusOdev {

	public static void main(String[] args) {
		// Kullancinin girdiği 4 basamakli sayinin tum rakamlarının toplamını ekrana yazdıran bir program yazınız
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen 4 basamakli bir sayi giriniz: "); // 1234
		
		int sayi = scan.nextInt();
		
		int s4 = sayi % 10;
		
		int x = sayi % 100;
		int s3 = x / 10;
		
		int y = sayi % 1000;
		int s2 = y / 100;
		
        int s1 = sayi / 1000;
		
		System.out.println(s4 + s3 + s2 + s1); // 10
		
		
		scan.close();
		
		
		
		
		
	}

}
