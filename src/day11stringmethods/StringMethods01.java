package day11stringmethods;

public class StringMethods01 {

	public static void main(String[] args) {

		
// startWith() 
		//bu method bir stringin istenen harfle başlayıp başlamadigini kontrol eder.
		// Istenen harfle baslamiorsa true, istenen harfle baslamiyorsa false return eder.

// startWith() 1. versiyon.
		
		
		String str1 = "Ali Can";
		System.out.println(str1.startsWith("A")); // true
		System.out.println(str1.startsWith("C")); // false
		System.out.println(str1.startsWith("a")); // false  Java casesenstive dir. a ayri bir character dir.
		
		
// startWith() 2. versiyon.
		
		System.out.println(str1.startsWith("a",3));// false indexi 3 character a ile mi başlıyor ona bakar 
		System.out.println(str1.startsWith("a",5));// indexi 5 olan character a ile mi başlıyor.
		System.out.println(str1.startsWith("Can",4)); //true
		System.out.println(str1.startsWith("")); //true
		
		
		
		
// endsWith () 
		// method bir String in istenen harfle bitip bitmediğini kontrol eder.
		
		String str2 = "Ayse Canan";
		System.out.println(str2.endsWith("a"));
		System.out.println(str2.endsWith("n"));
		System.out.println(str2.endsWith("x"));
		System.out.println(str2.endsWith("Canan"));
		System.out.println(str2.endsWith("canan"));
		System.out.println(str2.endsWith(" "));
		System.out.println(str2.endsWith(""));// son harfi hicbir şeymi var diye sorduk true verir
		
		String str3 = "Ali ";
		System.out.println(str3.endsWith(" "));// true
		System.out.println(str3.endsWith(""));// true  space den sonra hiçbir şey mi var diye soruyorz. o da true diyor.
		System.out.println(str1.startsWith("")); // başında hicbirşey var mı diye sorduk. true dedi
		
				
		
		



	}

}
