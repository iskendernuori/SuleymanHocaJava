package day11stringmethods;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		//Kullanıcıdan başlangıç ve bitiş değerlerini alın ve 
		//başlangıç değerinden başlayıp bitiş değerinde biten tüm tamsayıların toplamını ekrana yazdırın.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Baslangıc ve Bitis Degerini Giriniz :");
		int bs = scan.nextInt();
		int bt = scan.nextInt();
		
		int sum = 0;
		for(int i=bs; i<bt;i++) {
			sum = sum+i;
			
		}
		System.out.println("Toplam = " +sum);
scan.close();
	}

}
