package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview03 {

	public static void main(String[] args) {
		// kullanicidan bir sayi alin
		// bu sayinin tersini ekrana yazdirin.
		// bu sayinin tersinin 2 fazlasini ekrana yazdirin.
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("Bir sayi giriniz :");
		String num = scan.nextLine();
		
		String ters = "";
		
		for(int i=num.length()-1; i>=0; i--) {
			//System.out.print(num.charAt(i)); // string halinde yazdirmak için kullailir. 
			
			ters= ters+ num.charAt(i) + "";// char i stringe çevirmek için sonuna +"" ekleyebilirsiniz.
			
		}
		
		//System.out.print(ters);
		int tersInt = Integer.valueOf(ters); // stringi int a cevirim yeni bir conteynar olusturduk.
		tersInt = tersInt+2;
		
		System.out.println(tersInt);
		scan.close();
	}

}