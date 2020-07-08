package replit;

import java.util.Scanner;

public class SiradakiKarakteriYazdirma {

	public static void main(String[] args) {
		
//		Scanner sc= new Scanner(System.in);
//		String str =sc.nextLine();
//		int indx = sc.nextInt();
//		
//		
//		System.out.println(indx + "." + " pozisyondaki karakter : " + str.charAt(indx));
//		
//		
		
		Scanner scan=new Scanner(System.in);
	    
		   String str = scan.nextLine();
		   
		   System.out.println(str +" "+ str.length() + " karkterlidir.");
		  scan.close();

	}

}
