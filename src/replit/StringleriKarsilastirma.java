package replit;

import java.util.Scanner;

public class StringleriKarsilastirma {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("iki string giriniz");
		
		String str1 =scan.nextLine();
		String str2 =scan.nextLine();
		
		System.out.println(str1.contains(str2));
		
		scan.close();
	}

}
