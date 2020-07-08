package day29polimorfismexception;

public class Exception01 {

	public static void main(String[] args) {
		// Exception: problemli istisnai bir durum
				// hadding exception: kendimin çözebildiği problemler
				// throwing exception: kendi başıma (yardımsız) çözemeyeceğim problemler
		
		// Temelde Kaç tur exception var;
		// Temelde iki tur exception var.
		
		// 1) Compile Time Exception( Checked) 
		// 2) Run Time Exception 
		
		// Compile Time Exception a ornek ;
		//  Tabii ki ; 1) FileNotFoundException ==> Dosya bulunamadi
		//			   2) IOException(InputOutput Exception) Input veya Output yapilirken olusan problemlerde
		//					ortaya çıkar
		
		// NOT: FileNotException, IOException in child idir.
		// NOT: Compile Time Exeption lar mutlaka Handle edilmelidir.(Halledilmelidir)
		// Checked Exception lar 2 turlü handle edilebilir. 
		//			1) Method isminden sonra "throws" keyword kullanilir
		//			2) try-catch block kullanılir. try-catch block kullanmak daha iyidir;
		//				cünkü reabable dir.
		
		
		
		//****************Checked exceptionlar nasıl handle edilir?**********
				// iki türlü yapıyoruz:
				// 1*) throws yazmak: javaya: "problem varsa yardım iste demektir."
				// 2-)try-catch blocks. try: dene, catch= yakala demketir.
				// 3-) dene- hata cıkarsa -yakala-yapamazsan-bana mesaj at. readable dır.
				//aradaki fark: try catch önce dener. olmazsa mesaj atar.
				//ama throw da hazır mesajları ekrana atar problem hakkında.
				//try da ayrıntı ve hatanın yerini özetleyen bir mesaj yazabilirz. bu yüzden readable dir.

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
