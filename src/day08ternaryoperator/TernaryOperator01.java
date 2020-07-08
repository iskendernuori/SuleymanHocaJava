package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator01 {

	public static void main(String[] args) {
		
		// kullancıdan bir sayi alınız
		// Sayi pozitif ise ekrana "Pozitif" yaziniz
		// Sayi negatif ise ekrana "Negatif" yaziniz
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen Bir Sayi Giriniz :  ");
		double num = scan.nextDouble();
		
		/*
		if(num > 0 ) {
			System.out.println("Pozitif Sayi");
		}else if(num<0) {
			System.out.println("Negatif");
		}else {
			System.out.println("Notr");
		}
		
		
		 if(num>=0) {
	            System.out.println("Pozitif veya 0");
	        }else{
	            System.out.println("Negatif");
	        }
*/

		// Ternary Operator  (if Else)  ----> yukarıda yazılan uzun kodun tek satırda yazılmasıdır Ternary Oparator
		// Condition Soru isareti Condition Dogru ise       iki nokt ust uste     Condition Yanlıs ise   
		String sonuc = (num>=0)         ?                "Pozitif veya 0"			:					"Negatif";
		System.out.println(sonuc);
		
		
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
