package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator04Tekrar {

	public static void main(String[] args) {
		// Ternary Operator (If Else If)     Sertifika sınavı soruları
		
				// Kullanicidan bir sayi aliniz
				// Sayi 0 dan byuk esit ise kontrol ediniz 10 dan kucuk olup olmadigino kontrol ediniz.
				// 10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi"
				// Sayi 0 dan kucuk ise ekrana "Negatif Sayi" yazdiriniz

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen Sayiyi Giriniz : ");
		int num = scan.nextInt();
		
		String result = (num>=0) ? ((num<10) ? "Rakam " : " Pozitif Sayi") : "Negatif Sayi";
		System.out.println("result : " +result  );
		
		
		
		scan.close();
	}

}
