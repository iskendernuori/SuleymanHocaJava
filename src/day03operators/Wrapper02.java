package day03operators;

import java.util.Scanner;

public class Wrapper02 {

	public static void main(String[] args) {
	
			// kullanıcıdan ilk ismini alın ekrana yazdırın
		    // Kullancıdan soyismini alın ekrana ilk isminn altına yazdırın
		
		Scanner scan = new Scanner(System.in);
		
	    System.out.println("Lutfen ilk isminizi giriniz ");
	    
	    String ilkIsim = scan.nextLine();
		
	    System.out.println("Lutfen soyisminizi giriniz: ");
	    String soyIsim = scan.nextLine();
	    
	    System.out.println(ilkIsim);
	    System.out.println(soyIsim);
		
	    
	    scan.close();
	}

}
