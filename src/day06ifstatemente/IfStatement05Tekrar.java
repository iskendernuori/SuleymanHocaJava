package day06ifstatemente;

import java.util.Scanner;

public class IfStatement05Tekrar {

	public static void main(String[] args) {
		//kullancıdıan bir dikdörtgenin en v boyunu alın
				//en boy eşitsee bu bir karedir
				//en ve boy farklı ise bu bir dikdörtgenir yazdırın
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Dikdortgenin En Uzunlugunu Giriniz");
		
		double en = scan.nextDouble();
		System.out.println("Lutfen Dikdortgenin Boy Uzunlugunu Giriniz");
		double boy = scan.nextDouble();
		
		if(en==boy) {
			System.out.println("Bu Bir Karedir");
		}else { // burada if(en!=boy) da yazılabilirdir. 
			System.out.println("Bu Bir Dikdortgendir");
			scan.close();
		}
	}

}
