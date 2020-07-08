package day02wrapperclasses;

import java.util.Scanner;

public class Scanner07 {

	public static void main(String[] args) {
		
		
		// Yarıçapı kullanıcıdan alınan bir dairenin çevresini ve alanını hesaplayan bir program yazınız. (float kullanınız)
		//Not 1: pi sayısı: 3.14159
		//Not 2: Alan: 3.14159 x radius x radius
		//Not 3: Cevre: 2 x 3.14159 x radius
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen Radyan Degerini Giriniz: ");
		
		float radyan = scan.nextFloat();
		
		System.out.println(3.14159 * radyan * radyan );
		
		System.out.println(2 * 3.14159 * radyan);
		
		//Lutfen Radyan Degerini Giriniz: 
		//2,12
		// alan : 14.11956057160792
		// cevre: 13.320340880947112
		
		scan.close();
	}

}
