package day10stringmethods;

public class StringMethod04 {

	public static void main(String[] args) {
// contains() methodu bir stringin icinde bir characterin olup olmadigini kontrol eder.
		// Eger o char String icinde varsa true yoksa false return eder. 
		
		
		String str1 = "karakartal";
		System.out.println(str1.contains("m")); // contains() methodunun içine herzaman String koyun
		System.out.println(str1.contains("kar")); // karakartal in icinde kar var cunku


		
// trim () bir stringin baş ve sonundaki bosluklari siler.
		// ortadki boslugu silmez yani " Ali Can " da ===> "Ali Can"  kalir. ortaya dokunmaz
		// nerde kullanilir...  en guzel kullnim Password kullanmada olur. yanliş kulliminin onune gecilir.
		String str2 = " Ali Can       ";
		System.out.println("Trim () kullanmadan once :" +str2);
		System.out.println("Trim () kullandiktan sonra :" +str2.trim());
		
		
// isEmpty() ===> methodu bir Stringin icinde character olup olmadigina bakar
		// character yoksa True varsa False return eder.
		
		
		String str3 = "Ali";
		System.out.println(str3.isEmpty());// false verir, cunku sitringin icinde character var.
		String str4 = " "; // length 1 dir
		System.out.println(str4.isEmpty()); // false verir cunku space Java icin bir charakter dir.
		String str5 = "";// length 0 dir.
		System.out.println(str5.isEmpty()); // 
// Note : isEmpty() true cıkarsa length :0  cıkar , false cıkarsa length()	: 1 cıkar.	
		
		
		
		
	}

}
