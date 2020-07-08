package day07nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alın 
		// Bu sayi pozitif ise 9 dan buyuk mu diye kontrol edin, 9 dan buyukse ekrana
		//"Sayi" yazdırın.
		// 9 dan kucuk eşit ve 0 dan buyuk esit ise ekrana "Rakam" yazdırın
		// Sayi negatif ise ekrana"Sayi" yazdırın
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen Bir Tam Sayi Giriniz");
        int num = scan.nextInt();
        
        if(num>=0) {  // Outer if
        	if(num>9) {// iner if
        		System.out.println("Sayi");
        		
        		}else if(num<=9 && num>=0 ) {
        			
        			System.out.println("Rakam");
        		 }	
        	    }else if(num<0) {
        		  System.out.println("Sayi");
        		  
        	  }scan.close();
         // Scanner class ini kullandıktan sonra main method un içinde
        			  // Scanner class ini kapatın  scan.close()  böyle yazın
        }
	}

