package day09switchoperator;

import java.util.Scanner;

public class SwitchBaskaOrneklerAtm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int bakiye = 1000;
		int islem;
		
		System.out.println("1: Bakiye Görüntüle ");
		System.out.println("2: Para Yatırma ");
		System.out.println("3: Para Cekme");
		System.out.println("4: Sistemden Cıkma ");
		
		islem = scan.nextInt();
		
		switch (islem) {
		case 1:
			System.out.println("Bakiyeni: " + bakiye + "tl dir" );
			break;
		case 2:
			System.out.println("Ne kadar yatiracaksiniz");
			int miktar = scan.nextInt();
					bakiye += miktar ;
					System.out.println("Bakiyeniz: " + bakiye + " tl dir");
					break;
		case 3:
			System.out.println("Ne kadar cekeceksiniz");
		miktar = scan.nextInt();
					bakiye -= miktar ;
					System.out.println("Bakiyeniz: " + bakiye + " tl dir");
					break;
		case 4:
			System.out.println("Sistemden Cikiliyor");
					break;
		default:
			System.out.println("Gecersiz İslem");
			
			scan.close();
		}
	} 

}
