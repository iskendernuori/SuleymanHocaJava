package day09switchoperator;

public class Switch01 {

	public static void main(String[] args) {
		// A harfini bulunca "Ilk Harf", B harfini bulunca "Ikinci Harf", 
		// C harfini bulunca "Ucuncu Harf"
		// D harfini bulunca "Dorduncu Harf" 
		//yazdiran bir program yazdirin
		
		char harf = 'E';
		// ifelse if ile 1. yol
		/*
		if(harf == 'A') {
			System.out.println("Ilk Harf");
		}else if(harf == 'B') {
			System.out.println("Ikinci Harf");
		}else if(harf == 'C') {
			System.out.println("Ucuncu Harf");
		}else if(harf=='D') {
			System.out.println("Dorduncu Harf");
		}else {
			System.out.println("Bilmiyorum");
			
		}
		*/
		
		// 2. yol ===> Switch()
		
		switch(harf) {
		case 'A':
			System.out.println("Ilk Harf");
			break;
		case 'B' :
			System.out.println("Ikinci Harf");
			break;
		case 'C':
			System.out.println("Ucuncu Harf");
			break;
		case 'D' :
			System.out.println("Dorduncu Harf");
			break;
		default :
			System.out.println("Bilmiyorum");
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}

}
