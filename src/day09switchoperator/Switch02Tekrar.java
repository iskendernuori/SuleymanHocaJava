package day09switchoperator;

import java.util.Scanner;

public class Switch02Tekrar {

	public static void main(String[] args) {
				// Kullanci haftanin gun numarasini girsin
				// Programniz gunun ismini yazsin
				// Yanlıs gun sayisi girerese, " Geçerli Gun Sayisi Giriniz"
				// switch kullanrak yaziniz
				
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen Haftanin Gun Numarsini Giriniz :");
		int daynum = scan.nextInt();
		
		
		switch (daynum) {
		
		case 1 :
			System.out.println("Pazaresi");
			break;
		case 2 :
			System.out.println("Sali");
			break;
		case 3 :
			System.out.println("Carsamba");
			break;
		case 4 :
			System.out.println("Persembe");
			break;
		case 5 :
			System.out.println("Cuma : Mubarek Gun ");
			break;
		case 6 :
			System.out.println("Cumaresi: Museviler İcin Kutsak Gun");
			break;
		case 7 :
			System.out.println("Pazar : Hiristiyanlar Icın Kutsal Gun");
			break;
		default  :
			System.out.println("Yanlıs Sayi Girdiniz");
			break;
		}
		
		scan.close();
	}

}
