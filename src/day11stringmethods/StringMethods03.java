package day11stringmethods;

public class StringMethods03 {

	public static void main(String[] args) {
		
// concat() method.
		
		// concatenation yapmanin iki Stringi birlestirmednin diger yontemidir.
		
		String str1 = " Ali";
		String str2 = " Veli";
		
		System.out.println(str1 + str2);
		System.out.println(str1.concat(str2));
		System.out.println(str1.concat(str2.concat(str1)));
		System.out.println(str1.concat("===>").concat(str2).concat(str1));
	
// replace() methodu 
		//bir characterinin butun görünumlerinin yerine baska character yazmaya yarar.
		// ornek ata ==> ana
		
		
		String str3 = "ata";
		System.out.println(str3.replace("t", "n"));
		System.out.println(str3.replace("a", "u"));
		System.out.println(str3.replace("a", "o"));
		System.out.println(str3.replace("x", "y"));// x olmadıgı için y yi koyamazz. ayni kalir.
		System.out.println(str3.replace("t", " ")); // t nin yerine bosluk atadik . BU YONTEMDE BİR HARFİ SİLMEK İÇİN KULLANİRİZ.
		System.out.println(str3.replace("", "y")); // her bosluga bir y characteri atar.
		System.out.println(str3.replace("", "/"));//herbir harfi ayirmak için kullanilir
		
		String str4 = "sorma*nehaldeyim*sorma*bana*bunu";
		System.out.println(str4.replace("*", ""));
//replace() 2.versiyon;
		
		System.out.println(str3.replace("at", "Mustaf"));
		System.out.println(str3.replace("at", "y"));
		

		
//replaceFirst(); 
		// Degistirmek istediğimiz characterin sadece ilk gorunumunu degistiri.
		
		String str5 = "karakartal";
		System.out.println(str5.replaceFirst("k", "K"));// Karakartal
		System.out.println(str5.replaceFirst("a", "e")); // kerakartal
		System.out.println(str5.replaceFirst("ka", "A"));// Arakartal
		System.out.println(str5.replaceFirst("kar", ""));//akartal
		
		System.out.println(str5.replaceFirst("kara", "A"));
		System.out.println(str5.replaceFirst("karakartal", "Sarikanarya"));// Sarikanarya yazar
		
		// Soru : 
		String text = " Ali okula gitti. Ali otobuse bindi. Ali eve geldi. Ali yemek yedi. Ali uyudu.";
				System.out.println(text.replace("Ali", "Veli"));
		
// replaceAll() ve replace () methodlari ayni şeyi yapar. 
				// replaceAll çift tirnakla calişr. Tek tirnak kullanilmaz. 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
