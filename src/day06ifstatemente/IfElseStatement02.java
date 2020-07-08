package day06ifstatemente;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		// kullancıdan bir tam sayi isteyin ve o tamsinin 
		//mutlak degereini ekrana yazdirin
		//mutlak deger bir sayinin kendi işareti ile çarpılmasıdır
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz");
		
		int num1 = scan.nextInt();
		if(num1>0) {
			System.out.println(num1 * (+1));
			
			
		}else {
		System.out.println(num1*(-1));
		
		scan.close();

	}
		
	}
}

