package day06ifstatemente;

import java.util.Scanner;

public class IfStatementTekrar {

	public static void main(String[] args) {
		// bir int variable olusturun ona bir değer atayın
		// eger değer pozitif ise ekerana pozitif yazdırın
		// eger atadıhınız deger negatif is e ekrana negatif yazdırın
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen Bir Tam Sayi Giriniz:");
		int sayi = scan.nextInt();
		
		if(sayi>0) {
			System.out.println("Sayi Pozitif");
		}
		if(sayi<0) {
			System.out.println("Sayi Negatif");
		}
		
		if(sayi==0) {
			System.out.println("Sayi Notr");
			
			scan.close();
		}
		
	}

}
