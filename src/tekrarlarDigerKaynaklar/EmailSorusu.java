package tekrarlarDigerKaynaklar;

import java.util.Scanner;

public class EmailSorusu {

	public static void main(String[] args) {
		//Klavyeden okunacak bir e-mail adresindeki kullanıcı adını ve 
		//sunucu adını ekrana yazdıran bilgisayar programını Java dilinde yazınız.
		//e-mail adresi örneği: turkaslan@gmail.com
		//ekrana:
		//kullaniciadi: turkaslan
		//sunucu: gmail yazacak.

		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen ePosta adresinizi Giriniz :");
		String email = scan.nextLine();
		email.charAt('@');
		System.out.println("Kullaniciadi: " +(email.substring(0,(email.charAt('@')))));
		
		
		
		
	}

}
