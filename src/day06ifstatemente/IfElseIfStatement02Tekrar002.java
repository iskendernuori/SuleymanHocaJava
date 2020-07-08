package day06ifstatemente;

import java.util.Scanner;

public class IfElseIfStatement02Tekrar002 {

	public static void main(String[] args) {
		// Kullanıcdan sınav notunu tam sayi olarak girmesini istein
				//Negatif girerse ekrana "yanlış değer girdiniz "
				//0 dan büyük 50 den kücük girerse ekranan "Kaldınız" yazdırın
				//50 den büyük ve eşit 80 den küçük ise "Gectiniz" yazdırın
				//80 den büyük ve eşit 100 den küçük ise ekrana "Tebrikler" yazdırın
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Sınav notunuz giriniz :");
		
		double not = scan.nextDouble();
		
		
		if(not<0) {
			System.out.println("Sınav notu negatif sayi olamaz !...");
		}else if(not>0 && not<50) {
			System.out.println("Dersten Kaldınız");
		}else if(not>=50 && not<80) {
			System.out.println("Dersten Gectiniz ...");
		}else if(not>=80 && not<=100) {
			System.out.println("Tebrikler");
		}
		
		
		scan.close();
		
	}

}
