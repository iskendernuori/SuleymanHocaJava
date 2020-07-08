package day10stringmethods;

import java.util.Scanner;

public class StringMethodOdev02 {

	public static void main(String[] args) {
//		Kullanıcıdan ilk ve soy ismini alın ilk ve soy isminin kaç harften oluştuğunu ekrana yazdırın.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen İsminizi Giriniz :");
		String isim = scan.nextLine();
		System.out.println("Lutfen Soyisminizi Giriniz :");
		String soyad = scan.nextLine();
		
		
		System.out.println((isim+soyad).length());
		
		scan.close();
	}
	

}
