package day02wrapperclasses;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		// Kullanıcıdan alınan bir sayının küpünü hesaplayan bir prgram yazın
		
		System.out.println("Lütfen bir sayi giriniz: ");
		
		int sayi1 = scan.nextInt();
		
		System.out.println(sayi1  * sayi1 * sayi1);
		
		scan.close();
		
	}

}
