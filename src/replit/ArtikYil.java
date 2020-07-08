package replit;

import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	      
	     int year = in.nextInt();
	     
	     ArtikYil(year);
	    
	     in.close();
	}
	
	public static void ArtikYil(int year) {
		
		
		String result =(year%100==0 && year%400==0)? "true" : year%100!=0 && year%4==0 ? "true" : "false" ;
		
		 System.out.println(result);
		
		
		
	}
	
	
	
	

}
//if(year%100==0 && year%400==0) {
//System.out.println("true");
//
//}else if(year%4==0) {
//System.out.println("true");
//}else {
//System.out.println("false");
//}
//
//System.out.println(result);
//