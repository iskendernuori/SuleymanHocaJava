package uygulamalartekrar;

import java.util.Scanner;

public class ForLoopTekrarInterviewSondanBasa {

	public static void main(String[] args) {
	
		
		// Klavyeden girilen bir stringi tersten yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir strign giriniz :");
		
		String str = scan.next();
		
		
		for( int i = str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		
		scan.close();
		
		

	}

}
