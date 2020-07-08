package tekrarlarDigerKaynaklar;

import java.util.Scanner;

public class ArrayForElemanVerme {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int diziBoyut;
		
		System.out.println("Dizinin Boyutunu Giriniz");
		diziBoyut = scan.nextInt();
		
		//int []sayilar = new int[5];
		
		///sayilar = new int[10];// Array in boyutunu degiştirdik. Bu şekilde sintax ile degişebilir.
		
     	int [] sayilar = new int[diziBoyut];
//		boyutu sonradan degiştirebilirz
//		sayilar = new int[10];
		
		for(int i=0; i<sayilar.length ; i++) {
			System.out.println((i+1) + ".Sayi giriniz : " );
			sayilar[i]= scan.nextInt();
		}
		for(int i=0 ; i<sayilar.length ; i++) {
			System.out.print(sayilar[i]+ " ");
		}
		
		scan.close();
	}

}
