package day11stringmethods;

import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {
		//Kullanıcıdan başlangıç ve bitiş değerlerini alın ve 
		//başlangıç değerinden başlayıp bitiş değerinde biten tüm tamsayıların çarpımını ekrana yazdırın.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Baş ve Son Degeri Giriniz");
		int bs = scan.nextInt();
		int bt = scan.nextInt();
		
		int product = 1;
		for(int i=bs; i<bt;i++) {
		product = product * i;
		
	}
System.out.println("Toplam : " + product);
scan.close();
}
}