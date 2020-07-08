package day11stringmethods;

public class StringMethod01Tekrar {

	public static void main(String[] args) {
		// startWith() 
				//bu method bir stringin istenen harfle başlayıp başlamadigini kontrol eder.
				// Istenen harfle baslamiorsa true, istenen harfle baslamiyorsa false return eder.

		String str1 = "Yeni bir dunya";
		System.out.println(str1.startsWith("Y"));// True verir. 
		System.out.println(str1.startsWith("Z"));
		System.out.println(str1.startsWith("y"));// java casesensitive dir. y il Y farkli karakterlerdir
		
		System.out.println(str1.startsWith("n",2)); // indeksi 2 olan karakter n mi diye sorduk
		System.out.println(str1.startsWith(" ",4));// boşluk olan bolumün indexi 4 le mi başlıyor onu sorduk
		
		
		// endsWith () 
				// method bir String in istenen harfle bitip bitmediğini kontrol eder.
		
		System.out.println(str1.endsWith("a"));
		System.out.println(str1.endsWith("dunya"));
		System.out.println(str1.endsWith(" "));
		System.out.println(str1.endsWith(""));
		
		
		
		
		
		

	}

}
