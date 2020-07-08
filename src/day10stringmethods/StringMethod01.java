package day10stringmethods;

public class StringMethod01 {

	public static void main(String[] args) {
		// indexof() method u String içindeki characterin yerini belirlemek icin kullanilir
		// index sayimi 0 dan başladiği için bir geriden başlar
		// Space java için bir karakter dir
		
// indexOf() 1. yolu
		String str1 = "Javva World";
			System.out.println(str1.indexOf('v')); // ekrana 2 yazdri. cünkü 0 dan başlar
			System.out.println(str1.indexOf('W')); // ekrana 5 yazdirir. space bir karakterdir
			System.out.println(str1.indexOf('w')); // String de yok. bulamayinca java -1 yazar
			System.out.println(str1.indexOf('a')); // ilk kullanıldğı yeri yazar. soldan sağa calısır
			
// indexOf() 2. yolu		
		//indexOf() methodu diger vresiyonu
			System.out.println(str1.indexOf('a',2 ));  // Stringdeki 2. a karakterinin indexni bulun
													   // Ekrana 4 yazacak
			System.out.println(str1.indexOf('a',4 ));  // Ekrana 1 yazacak
			System.out.println(str1.indexOf('a',1 ));  // Ekranan 1 yazacak
			System.out.println(str1.indexOf('a',5 ));  // Ekrana -1 yazar String de a olmasina ragmen, benim aramaya başla dediğim yerde a yok
			
	 // "Almanya" Strig indeki ikinci 'a' characterinin indexini bulalım
			String str2 = "Alamanya";
			System.out.println(str2.indexOf('a')); //Bu birinci 'a' nin indexi ==> 2
	        int idx = str2.indexOf('a');
	        System.out.println(str2.indexOf('a' , idx+1));
	        
	 // indexOf() 3. yolu
	        
	        String str3 = "Missisipi";
	        str3.indexOf("is");// "is" ilk "is" strignini bulur ve ilk harfin indexini return eder
	        System.out.println(str3.indexOf("is"));// i harfinin indexini alir
	        
	        
	// indexOf() 4. yolu
	       
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	}

}
