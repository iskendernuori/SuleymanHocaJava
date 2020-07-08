package day02wrapperclasses;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
	
		// Kullanıcı iki tam sayı versin
		// Program bu tam sayıların toplamını ve çarpımını ekrana yazdırsın
		
		
		Scanner scan = new Scanner(System.in);  //Scanner da kırmızı çizgi çıktı. bunu import etmem gerekiyor
		        								//Scanner in üzerine geldiğimizde kütüphane açılır. import scanner i seçtiğimizde üst satıra calss gelir
		
		System.out.println("Lutfen iki tam sayı giriniz:");
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		System.out.println(sayi1+ sayi2);
		System.out.println(sayi1* sayi2 );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();	
		
	}

}
