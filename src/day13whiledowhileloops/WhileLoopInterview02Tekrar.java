package day13whiledowhileloops;

import java.util.Scanner;

public class WhileLoopInterview02Tekrar {

	public static void main(String[] args) {
		// Kullanicidan bir String alin ve bu String'i ekrana tersten yazdirin
		//While Loop kullanin
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir cumle veya kelime giriniz: ");
		String str = scan.nextLine();
		
		int length = str.length()-1;
		while(length>0) {
			System.out.print(str.charAt(length));
			length --;	
		}
	
		
		
		scan.close();
		
	}

}
