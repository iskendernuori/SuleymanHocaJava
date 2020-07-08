package day10stringmethods;

import java.util.Scanner;

public class StringMethodOdev01 {

	public static void main(String[] args) {
		 //Kullanıcıdan kredi kartı numarasını alın ve bu numaranın üçüncü, dördüncü ve sonuncu
		// rakamlarını ekrana yazdırın.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen Kart Numarasini Giriniz :");
		String kart = scan.nextLine();
		
		
		System.out.println(kart.charAt(2));
		System.out.println(kart.charAt(3));
		
		int length = kart.length();
		System.out.println(kart.charAt(length -1));
		

		scan.close();
	}

	
			
			
			
}
