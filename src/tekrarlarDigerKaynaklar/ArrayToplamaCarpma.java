package tekrarlarDigerKaynaklar;

import java.util.Scanner;

public class ArrayToplamaCarpma {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int diziBoyut;
		int toplam = 0;
		
		System.out.println("Kac elemanli bir dizi olusturacaksiniz :");
		diziBoyut = scan.nextInt();
		
		int [] sayilar = new int[diziBoyut];
		
		for(int i=0 ; i<sayilar.length ; i++) {
			System.out.println((i+1) + ". elemani giriniz : ");
			
			sayilar[i]= scan.nextInt();
			
		}
		for(int i=0 ; i<sayilar.length; i++) {
			
			toplam = toplam + sayilar[i];
			
		}
		System.out.println("Sayilarin Toplamı = " + toplam);
		System.out.println("Sayilarin Ortalamasi = " + (toplam/sayilar.length));
		scan.close();
	}

}
