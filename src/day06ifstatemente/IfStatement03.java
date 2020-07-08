package day06ifstatemente;

public class IfStatement03 {

	public static void main(String[] args) {
		//bir Char variable olusturun ve büyük harf değer atayın
		//eger atanan deger haftanın gunlerinden herhangi birinin ilk harfi ise o günleri yazdırın
		//eger atanan deger haftanın gunlerinden herhangi birinin ilk harfi degil ise
		//ekrna böyle bir gün yok yazdırın
		
		
		char gun = 'K';

		if(gun== 'P') {
			System.out.println("Pazar" + " Pazartesi" + " Persembe");
			
		}
		if(gun=='S') {
			
			System.out.println("Sali");
		}
		
		if(gun=='C') {
			System.out.println("Carsamba" + " Cuma" + " Cumartesi");
		
		}
		// "P" olmamak VEYA "C" olmamak VEYA "S" olamamak ===> işlemi için || kullanılır
		// True||True = True <--> True||False = True False||False= False
		
		
		// "P" olmamak VE "C" olamamk VE "Sé olmamak ===> VE işlemi için && kullanılır
		// VE işleminden True sonucu alabilimek çin tum condition ları tru olmalıdır.
		// True&True = True <-->  True&&False =  False <--> False&& False = False
		
		if(gun!='P'|| gun!='C' || gun!='S' ) {
			
			System.out.println("Boyle bir gun yok");
		}
		if(gun!='P' && gun!='C' && gun!='S') {

		}
	}

}
