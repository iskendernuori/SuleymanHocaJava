package day06ifstatemente;

import java.util.Scanner;

public class IfElseIfStatement04Odev {

	public static void main(String[] args) {
		
		// Kullacıdan bir tamsayi alın eger tamsayi 0 dan kücük ise "Negatif" yazdırın
				// 0 ise ekrana "Notr" yazdıırın
				// 0 dan byuk ise "Pozitif yazdırım
				
	Scanner scan = new Scanner(System.in);
	System.out.println("Lutfen Bir Tamsayi Giriniz");
	int num = scan.nextInt();
	
	if(num<0) {
		System.out.println("Negatif");
	}else if(num==0) {
		System.out.println("Notr");
	}else if(num>0) {
		System.out.println("Pozitif");
		scan.close();
	}
	
	}
	}
		
	
		
