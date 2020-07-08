package day06ifstatemente;

public class IfStatement02 {

	public static void main(String[] args) {
		// bir int variable olusturun 
		// deger atayın
		//eger cift sayi ise "Cift yazdırın"
		//eger tek sayi ise "Ekrana "tek" yazıdın
		
		
		int num = 0; // 12, 15, -18 , -19 yazılabilir  -23324
		//double num = 12.489999 da olur. virgüllü sayılar içinde geçerli
				
		if(num % 2==0) {
					System.out.println("Cift");
				}
		if(num % 2!=0) { // >0 yazılır fakat sadece positif sayılar için olur. negatif çalışmaz
			
			System.out.println("Tek");
		}
	}

}
