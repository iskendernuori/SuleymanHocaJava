package day10stringmethods;

public class StringMethod02 {

	public static void main(String[] args) {
		// lastIndexOf() methodu aradiğinizda character in String içincdki son gorunumunun indexini return eder.
		
// lastIndexOf() 1. versiyon
		
		String str1 = "Sivrihisar";
		str1.lastIndexOf('i');
		System.out.println(str1.lastIndexOf('i'));// ekrana en son i harfinin indexini verir. Yani 6 yi verir
		
		str1.lastIndexOf('r');
		System.out.println(str1.lastIndexOf('r'));
		
// lastIndexOf() 2. versiyon
		System.out.println(str1.lastIndexOf('i',5)); // ilk 7 character in içinde 'i' harfinin son gorunumunun indexini
													// return eder. yani sivrih içindeki son i ye bakar
		
//lastIndexOf() 3. versiyon
		String str2 = "rivrihisari";
		System.out.println(str2.lastIndexOf("ri"));// string in içindeki "ri" nin son gorunumunu bulacak.
												   // son 'ri' deki 'r' harfinin indexi olan 9 u return edecek
		
		
		
		
		
		
		
	}

}
