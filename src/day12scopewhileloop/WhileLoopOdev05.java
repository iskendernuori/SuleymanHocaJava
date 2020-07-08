package day12scopewhileloop;

import java.util.Scanner;

public class WhileLoopOdev05 {

	public static void main(String[] args) {
		//Kullanıcıdan başlangıç ve bitiş değerlerini alın ve 
		//başlangıç değerinden başlayıp bitiş değerinde biten tüm tamsayıların çarpımını ekrana yazdırın.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen baslangic tamsayisini giriniz :");
		int start =scan.nextInt();
		System.out.println("Lutfen son tamsayiyi giriniz :");
		int finish =scan.nextInt();
		
		int product = 1;
		while (start<finish) {
			product = product* start;
			start = start +1;
		}
		System.out.print("Sonuc :" + product);
		
		scan.close();
	}

}
