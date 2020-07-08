package day02wrapperclasses;

import java.util.Scanner;

public class Scanner09 {

	public static void main(String[] args) {
		
		//Mil’i kilometreye çeviren bir program yazınız.
		//(double kullanınız) Not 1: km = mile x 1.6
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen mil rakamini giriniz:");
		
		double mil = scan.nextDouble();
		
		System.out.println(mil * 1.6);
 		
		//Lutfen mil rakamini giriniz:
		//23
		//36.800000000000004

		
		scan.close();

	}

}
