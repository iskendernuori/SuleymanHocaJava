package day07nestedif;

import java.util.Scanner;

public class NestedIf03 {

	public static void main(String[] args) {
				// Kullanicidan yil girmesini isteyin
				// Girilen yil artik yil ise ekrana “Artik Yil” yazdirin
				// Girilen yil artik yil degil ise ekrana “Artik Yil Degil” yazdirin.
				
				// Artık yıl 1) yıl 100 e bölünürse 400 de bölünmeli
			   //2) yıl 100 e bölünmezse 4 e bölünmeli 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen Yil Giriniz");
		int yil = scan.nextInt();
		
		if(yil%100 == 0) {
			if(yil%400 == 0) {
				System.out.println("Artik Yil");	
			}else {
				System.out.println("Artik Yil Degil");
			}
		}else if(yil%100!=0) {
			if(yil%4 == 0) {
				System.out.println("Artik Yil");
			}else {
				System.out.println("Artik Yil Degil");
			}
		}
		
		
		
		
		
		
		
		
		
		scan.close();
	}

}
