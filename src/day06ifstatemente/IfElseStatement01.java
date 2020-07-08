package day06ifstatemente;

import java.util.Scanner;

public class IfElseStatement01 {

	public static void main(String[] args) {
		
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Password'u Giriniz:" );
		
		String password = scan.next();
		//string lerin eşitliğini kontrol ederken 
		// asla '==' symbolu kullanmayalım. Onun yerine
		// "equals()" kullanın
		
		
		// "==" String in degerini ve adresini kontrol eder
		//"equals() ise sadece degerleri kontrol eder.
		
		if(password.equals("Java2020")) {
			
			System.out.println("Password Dogru");
		}else {
			System.out.println("Password Yanlıs");
			scan.close();
			
		}
		
		
 
	}

}
