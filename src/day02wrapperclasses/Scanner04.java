package day02wrapperclasses;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		// kullancıdan dikdörtgenin çevresini ve daha sonra alanını hesaplayalım
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen dikdortgenin en ve boy uzunlugunu giriniz: ");

		
	    int boy = scan.nextInt();
		int en  = scan.nextInt();
		
		System.out.println((boy*2) + (en*2));
		System.out.println(en * boy);
		
		scan.close();	
	}

}
