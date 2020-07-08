package day13whiledowhileloops;

import java.util.Scanner;

public class StringMethodOdev03 {

	public static void main(String[] args) {
		//Kullanıcıdan bir String alın ve bu String’in icinde “a” harfi varsa “a” harfinin ilk görünümünün indexini ekrana yazdırın. 
		//“a” harfi yoksa ekrana “a harfi yok” yazdırın.
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir kelime veya cumle giriniz :");
		String word = scan.nextLine();
	
		
		if(word.contains("a")) {
			System.out.println(word.indexOf('a'));		
		}else {
			System.out.println("a harfi yok");
		}
		
	scan.close();
	
		
	
		
	
		
		
		
	}

}
