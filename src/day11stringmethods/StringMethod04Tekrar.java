package day11stringmethods;

public class StringMethod04Tekrar {

	public static void main(String[] args) {
		// valueOf() method
				// valueOf() hem integer wrapper classini içinde hemde String in içinde var.
				// integer wrapper clasinin içinde olan valueOf()  metodu String i intiger e cevirir. 
				// Stringin içinde valueOf() methodu integer i Stringe çeviri.
				// Rakamlarla olusuturulan Stringleri sayiya donusturu.
				// Boylece rakamlarla olusturulan Stringler le matematiksel islemler yapabilmemiz saglar.
		
		String maasMan = "2000";
		String maasWm = "1900";
		
		System.out.println(Integer.valueOf(maasMan) + Integer.valueOf(maasWm));
		
		int masMan = 2000;
		int masWom = 1900;
		
		System.out.println(String.valueOf(masMan)+ String.valueOf(masWom));
		
		
	}

}
