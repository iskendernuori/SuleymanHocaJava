package day14dowhileloop;

import java.util.Scanner;

public class OdevSorusu01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir kelime veya cumle giriniz");
		String str = scan.nextLine();

		char ilk = str.charAt(0);
		char son = str.charAt(str.length()-1);
		System.out.println(son + str.substring(1,str.length()-1) + ilk);
		
		
		
		scan.close();
		
	}

				
		
	
		
		
}	
	

