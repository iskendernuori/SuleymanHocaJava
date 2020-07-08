package day15methodcreation;

import java.util.Scanner;

public class MethodCreation02 {

	public static void main(String[] args) {
		// Saati saniye ye ceviren , mil i kilometre ye , kg mi grama 
		// Ceviren bir method yaziniz
		// bu programı main method un dışında oluşturup main method un icinden cagırınız
		Scanner scan= new Scanner(System.in);
		System.out.println("Birimi giriniz :");
		String birim =scan.nextLine();
		System.out.println("Miktari giriniz :");
		double miktar = scan.nextDouble();
		donusturucu(birim,miktar);	
		scan.close();
	}
		public static void donusturucu(String birim, double miktar) {
			
			switch(birim) {
			
			case "saat":
				System.out.println(miktar*60*60);
				break;
			case "mil" :
				System.out.println(miktar*1.6);
				break;
			case "kilogram":
				System.out.println(miktar*100);
				break;
			default:
				System.out.println("saat, mil ve kilogram dısında bir deger girmeyiniz ");
				
			
			}
			
		
		
		
		
		
		

	}

}
