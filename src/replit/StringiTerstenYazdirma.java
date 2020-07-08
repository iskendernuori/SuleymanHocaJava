package replit;

import java.util.Scanner;

public class StringiTerstenYazdirma {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String sentence=scan.next();
		
		for(int i=sentence.length()-1; i>=0; i--) {
			System.out.print(sentence.charAt(i));
		}
		
		scan.close();
		
		
	}

}
