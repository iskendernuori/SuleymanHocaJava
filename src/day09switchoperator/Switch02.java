package day09switchoperator;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
	
		// Kullanci haftanin gun numarasini girsin
		// Programniz gunun ismini yazsin
		// Yanlıs gun sayisi girerese, " Geçerli Gun Sayisi Giriniz"
		// switch kullanrak yaziniz
		/*switch(harf) {
		case 'A':
			System.out.println("Ilk Harf");
			break;
		*/
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen Gun Numarsini Giriniz : ");
		int day = scan.nextInt();
		
		switch  (day) {
		case 1 :
			System.out.println("Pazartesi");
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
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
		default :
		System.out.println("Gecerli Bir Gun Sayisi Giriniz");
		
		scan.close();
			
		}
		
		
		
	}

}
