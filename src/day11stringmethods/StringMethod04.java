package day11stringmethods;

public class StringMethod04 {

	public static void main(String[] args) {
	
		
// valueOf() method
		// valueOf() hem integer wrapper classini içinde hemde String in içinde var.
		// integer wrapper clasinin içinde olan valueOf()  metodu String i intiger e cevirir. 
		// Stringin içinde valueOf() methodu integer i Stringe çeviri.
		// Rakamlarla olusuturulan Stringleri sayiya donusturu.
		// Boylece rakamlarla olusturulan Stringler le matematiksel islemler yapabilmemiz saglar.
		
	String moneyHe = "1900";
	String moneyShe= "2000"; 
	
		// bu ailenin toplam gelirini bulunuz.
	System.out.println(Integer.valueOf(moneyHe)+Integer.valueOf(moneyShe));
	
	int maasHe = 1900;
	int maasShe= 2000;
	System.out.println(maasHe + maasShe);//3900
	System.out.println(String.valueOf(maasHe) + String.valueOf(maasShe) );;
	
	
	
	
	
		
		
		
		
	}

}
