package day06ifstatemente;



public class IfStatement03Tekrar {

	public static void main(String[] args) {
		//bir Char variable olusturun ve büyük harf değer atayın
				//eger atanan deger haftanın gunlerinden herhangi birinin ilk harfi ise o günleri yazdırın
				//eger atanan deger haftanın gunlerinden herhangi birinin ilk harfi degil ise
				//ekrna böyle bir gün yok yazdırın
		
		
		char gun = 'C';
		if(gun== 'P') {
			System.out.println("Pazartesi " + "Persembe" + " Pazar");
			
		}
		if(gun== 'S') {
			System.out.println("Sali");
		}
		if(gun== 'C') {
			System.out.println("Carsamba " + "Cuma " + "Cumartesi");
		}else {
			System.out.println("Boyle Bir Gun Yok Maalesef");
		}
	} 

}
