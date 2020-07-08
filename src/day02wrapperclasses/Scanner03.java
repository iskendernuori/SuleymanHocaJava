package day02wrapperclasses;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		//Kullanıcı karenin bir kenar uzunluğunu girsin 
		//Karenin çevresini ve alanını hesaplasın
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Lütfen karenin bir kenar uzunlugunu giriniz.:");
				
	int kenarUzunlugu = scan.nextInt();
	
	System.out.println(kenarUzunlugu*4);
	System.out.println(kenarUzunlugu*kenarUzunlugu);
	
	scan.close();
	}

}
