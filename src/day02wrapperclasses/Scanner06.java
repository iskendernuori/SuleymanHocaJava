package day02wrapperclasses;

import java.util.Scanner;

public class Scanner06 {

	
	//Boyutları kullanıcıdan alınan bir dikdörtgenler prizmasının hacmini hesaplayan bir program yazınız.
	//Not: Dikdörtgenler Prizmasının Hacmi: En x Boy x Yükseklik
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lütfen prizmanın en, boy ve yuksekligini giriniz   ");
		
		int en = scan.nextInt();
		int boy = scan.nextInt();
		int yukseklik = scan.nextInt();
		
		System.out.println(en * boy * yukseklik );
		
		scan.close();
	}
	

}
