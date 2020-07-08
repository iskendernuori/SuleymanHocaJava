package day09switchoperator;

public class Switch01Tekrar {

	public static void main(String[] args) {
				// A harfini bulunca "Ilk Harf", B harfini bulunca "Ikinci Harf", 
				// C harfini bulunca "Ucuncu Harf"
				// D harfini bulunca "Dorduncu Harf" 
				//yazdiran bir program yazdirin
		
		char harf = 'F';
		
		switch (harf) {
			case 'A':
				System.out.println("Ilk Harf");
			break;
			case 'B':
				System.out.println("Ikinci Harf");
			break;
			case 'C':
				System.out.println("Ucunuc Harf");
			break;
			case 'D':
				System.out.println("Dorduncu Harf");
			break;
		default :
			System.out.println("Yanlıs Harf Girdiniz... lutfen tekrar deneyiniz :");
		}
		
		
	}

}
