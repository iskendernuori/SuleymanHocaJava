package day15methodcreation;

import java.util.Scanner;

public class MethodCreationOdev04 {

	public static void main(String[] args) {

		//		Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini ve iki sayı seçmesini söyleyin. 
//		Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.

		Scanner scan = new Scanner(System.in);
		System.out.println("paralelkenar,dikdorten vey ucgen kelimelerinden birini giriniz :");
			
		String geoSekil = scan.next().toLowerCase();
		System.out.println("Ilk sayiyi giriniz");
		double num1 = scan.nextDouble();
		System.out.println("Ikinci sayiyi giriniz");
		double num2 = scan.nextDouble();
		hesaplama(geoSekil,num1,num2);
		scan.close();
	}
	public static void hesaplama(String geoSekil,double num1,double num2) {
		switch (geoSekil) {
		case ("paralelkenar"):
			System.out.println("Paralelkenarin Alanı = " + (num1*num2/2));
			System.out.println("Paralelkenarin Cevresi = " + (num1*2 +num2*2));
			break;
		case ("ucgen"):
			System.out.println("Ucgenin Alanı = " + (num1*num2/2));// burada 2 deger girildiğinden num2= h olarak alindi. 
			System.out.println("Ucgeninin Cevresi = " + (num1*2 +num2));// ikiz kenar ucgen olarak kabul edildi. 
			break;
		case ("dikdortgen"):
			System.out.println("Dikdortgenin Alanı = " + (num1*num2));
			System.out.println("Dikdortgenin Cevresi = " + (num1*2 +num2*2));
			break;
		default:
			System.out.println("*****  Lutfen 3 geometrik sekilden birini giriniz  ****");
		
		}
	}
/*    SULEYMAN HOCA NIN  COZUMU
 * Scanner scan = new Scanner(System.in);
		System.out.println("Paralelkenar, dikdörtgen ve üçgen kelimelerinden birini seciniz");
		String sekilIsmi = scan.next().toLowerCase();
		System.out.println("Iki sayi giriniz");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		alanVeCevre(sekilIsmi,num1,num2);
​
	}
	 
	public static void alanVeCevre(String sekilIsmi, int num1, int num2) {
		
		switch(sekilIsmi) {
		case "paralelkenar":
			System.out.println("Alan= " + num1*num2);
			System.out.println("Cevre= " + 2*(num1+num2));
			break;
		case "dikdortgen":
			System.out.println("Alan= " + num1*num2);
			System.out.println("Cevre= " + 2*(num1+num2));
			break;
		case "ucgen":
			System.out.println("Alan= " + (num1*num2)/2);
			break;
		default:
			System.out.println("Yanlis sekil ismi girdiniz");

 */
		
		
		
		
}
