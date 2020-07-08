package day10stringmethods;

public class StringMethod04Tekrar {

	public static void main(String[] args) {
		//contains string içindeki bir karakterin varliğni arastırır. varsa True yoksa false
		
		String str1 = "Mavimavimasmavikanarya";
				System.out.println(str1.contains("z"));
				System.out.println(str1.contains("m"));
				
				System.out.println(str1.contains("mavimas"));// buyuk harf yazarsak false verir. CaseSensitive dir
				
				
		// trim bir stringin baş ve sonundaki bosluklari siler
				
				String str2= "    Ali Kaptan    ";
				System.out.println("Trim Kullanmadan Once : " +str2);
				
				System.out.println("Trim Kullandiktan Sonra :" + str2.trim());  // sadece baş ve sondaki boşluklari siler
																				// password larda kullanilir.
			
		// isEmpty ()  Stringin içinde character olup olmadiğina bakar
				
				String str3 = "iskender";
				System.out.println(str3.isEmpty()); // false vermesi gerekiyor. cunkü string dolu
				
				String str4 = " ";
				System.out.println(str4.isEmpty()); //space java da bir chracter dir
				
				String str5 = "";
				System.out.println(str5.isEmpty()); // cünkü hiç character yok.
													// true cıkarsa lenght 0 dir
						
				
				
		
		
	}

}
