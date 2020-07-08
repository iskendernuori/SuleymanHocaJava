package day02wrapperclasses;

import java.util.Scanner;

public class Scanner05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Lutfen dairenin yari capini giriniz:" );
		
		double  yariCap = scan.nextDouble();
				
		System.out.println(3.14159 * yariCap * yariCap);
		System.out.println(2* 3.14159 * yariCap);
		
		
		scan.close();
	}

}