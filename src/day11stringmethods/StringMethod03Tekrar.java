package day11stringmethods;

public class StringMethod03Tekrar {

	public static void main(String[] args) {
		// cancat() method.
		
				// concatenation yapmanin iki Stringi birlestirmednin diger yontemidir.
		
		String str1 = "Seni ";
		String str2 = "Seviyorum";
		
		System.out.println(str1.concat(str2));
		System.out.println(str2.concat(str1));
		System.out.println(str1.concat(str2).concat(str1).concat(str1));
		
// replace() methodu 
				//bir characterinin butun görünumlerinin yerine baska character yazmaya yarar.
				// ornek ata ==> ana
		
		
		String str3= "YasaSen";
		System.out.println(str3.replace('a', 'e')); // a larin yerine e yazdi.
		
		System.out.println(str3.replaceAll("sa", "me"));
		
		String str4 = "Konu*acilirsa*senden*nolacak*peki***";
		System.out.println(str4.replace('*', ' '));
//replaceFirst
		String str5 = "Kara Kartal";
		System.out.println(str5.replaceFirst("K", "P"));// replaceFirt te "" kullanilmali tek '' olmaz
		
		
		
	}

}
