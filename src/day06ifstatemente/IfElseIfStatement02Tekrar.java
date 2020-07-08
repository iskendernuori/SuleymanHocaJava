package day06ifstatemente;

import java.util.Scanner;

public class IfElseIfStatement02Tekrar {

	public static void main(String[] args) {
				// Kullanıcdan sınav notunu tam sayi olarak girmesini istein
				//Negatif girerse ekrana "yanlış değer girdiniz "
				//0 dan büyük 50 den kücük girerse ekranan "Kaldınız" yazdırın
				//50 den büyük ve eşit 80 den küçük ise "Gectiniz" yazdırın
				//80 den büyük ve eşit 100 den küçük ise ekrana "Tebrikler" yazdırın

		
		Scanner scan = new Scanner(System.in);
		
			System.out.println("Lutfen Notunuzu Tam Bir Sayi Olarak Giriniz:");
			int great =scan.nextInt();
			
			if(great<0) {
				System.out.println("Negatif Değer Giremezsiniz");
			}else if(great<50) {
				System.out.println("Kaldınız");
			}else if(great<80) {
				System.out.println("Gectiniz");				
			}else if(great<=100) {
				System.out.println("Tebrikler");
			}else {	
				System.out.println("100 den Buyuk Deger Giremezsiniz");
				
				scan.close();
			}	
			
	}

}
