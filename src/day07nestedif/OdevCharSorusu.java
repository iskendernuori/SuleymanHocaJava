package day07nestedif;

import java.util.Scanner;

public class OdevCharSorusu {

	public static void main(String[] args) {
		// Kullanıcıdan bir character alın eğer character bir harf ise ekrana “Harf” yazdırın. 
				// Diğer durumlarda ekrana “Harf değil” yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir Character Girin");
		
		char harf = scan.next().charAt(0); // kullanıcidan char almak için next().charAt(0) /0 ilk karakterdir. bundan 0 dan başka yazamayiz. char lar tek karakter olur
		if((harf<=122 && harf>=97)|| (harf<=90 && harf>=65)) {
			System.out.println("Bu bir harftir");
			
			//97-122   bh: 65-90
			
		}else {
			System.out.println("Bu bir harf Degildir");
			scan.close();
			
		}

	}

}
