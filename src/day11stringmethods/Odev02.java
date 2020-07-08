package day11stringmethods;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
//		Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden 
		//veya sonrasından başlayıp bitiş değerinde veya öncesinde biten tüm çift tamsayıları ekrana yazdırın.

		

			Scanner scan = new Scanner(System.in);
			System.out.println(" Lutfen Baslangıc Tamsayi Degerini ve Giriniz : ");
			int bs =scan.nextInt();
			System.out.println(" Lutfen Bitis Tamsayi Degerini ve Giriniz : ");
			int bt =scan.nextInt();
		
		for(int i=bs ; i<bt; i+=2 ) {
			System.out.print(i+ " ");	
			
		}
		 
			
			scan.close();
	}

}
