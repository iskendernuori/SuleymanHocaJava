package day06ifstatemente;

import java.util.Scanner;

public class IfElseIfStatement02 {

	public static void main(String[] args) {
		// Kullanıcdan sınav notunu tam sayi olarak girmesini istein
		//Negatif girerse ekrana "yanlış değer girdiniz "
		//0 dan büyük 50 den kücük girerse ekranan "Kaldınız" yazdırın
		//50 den büyük ve eşit 80 den küçük ise "Gectiniz" yazdırın
		//80 den büyük ve eşit 100 den küçük ise ekrana "Tebrikler" yazdırın
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Sınav Notunuzu Giriniz: ");
		
		int sinav= scan.nextInt();
		if(sinav<0) {
			System.out.println("Negatif Deger Girmezsiniz");		
		}else if(sinav<50){
			System.out.println("Kaldıniz");			
		}else if(sinav<80) {
			System.out.println("Gectiniz");		
		}else if(sinav<=100) {
			System.out.println("Tebrikler");
		}else {
			System.out.println("100 den Buyuk Deger Giremezsiniz");
		}
		
		
		scan.close();

	}

}
