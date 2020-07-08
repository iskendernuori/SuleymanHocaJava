package uygulamalartekrar;

import java.util.Scanner;

public class WhileLoopTekrar03 {

	public static void main(String[] args) {
		//Kullanıcıdan başlangıç ve bitiş değerlerini alın ve 
				//başlangıç değerinden başlayıp bitiş değerinde biten tüm tamsayıların toplamını ekrana yazdırın.

		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Baslangıc Degerini Giriniz :");
		int start = scan.nextInt();
		System.out.println("Bitis Degerini Giriniz :");
		int finish = scan.nextInt();
		
		int sum= 0;
		while(start<finish) {
			sum= sum+start;
			
			
			start++;
		}
		
		System.out.println("Toplam = " + sum);	
		
		scan.close();

	}

}
