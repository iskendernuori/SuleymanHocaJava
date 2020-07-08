package java_Review;

import java.util.Scanner;

public class Day02IfStatement {

	public static void main(String[] args) {
		// Kullanıcıdan bir sayı girmesini isteyiniz
		// Sayı tek sayı ise "Sayınız tek sayıdır."
		// Sayı çift sayı ise "Sayınız çift sayıdır."
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Lutfen Bir Sayi Giriniz :");
	int num = scan.nextInt();
	
	if(num%2 == 0) {
		System.out.println("Sayiniz Cift Sayidir");
	}else {
		
		System.out.println("Sayiniz Tek Sayidir");
	}
	
	
	scan.close();
	
	
	
	
	}

}
