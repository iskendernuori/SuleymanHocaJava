package day06ifstatemente;

import java.util.Scanner;

public class IfElseStatementOdevler {

	public static void main(String[] args) {
		
	/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir Sayi Giriniz:");
		
		int num1 = scan.nextInt();
	    num1= num1 % 3;
	    System.out.println(num1 % 3);
	    
	    
		if(num1==0) {
			System.out.println("3'ün katı");
		}else if(num1>0) {
			System.out.println("3'ün katı değil");
			
		}
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir Harf Giriniz:");
		
		String harf = scan.nextLine();
		
		
		if(harf.equals("a") || harf.equals("e") || harf.equals("i") || harf.equals("o")  || harf.equals("u") ){
	    System.out.println("Sesli Harf");
	    
		}
		
		if(harf.equals("b") || harf.equals("c") || harf.equals("d") || harf.equals("f") ) {
			System.out.println("Sessiz Harf");
			
			
		}
		*/
		
		
		Scanner scan = new Scanner(System.in);
			System.out.println("Lutfen bir Gun Giriniz:");
			
			String gun = scan.nextLine();
			
			if(gun.equals("cuma")) //{ equalsIgnoreCase() kullanılır. büyük küçük farketmez.
				System.out.println("Muslumanlar için Kutsal Gun");
			
			if(gun.equals("cumartesi")) {
				System.out.println("Yahudiler için Kutsal Gun");
				
			}
			if(gun.equals("pazar")) {
				System.out.println("Hristiyanlar için Kutsal Gun");
				
			}else {
				System.out.println("Kutsal Gun Degil");
			}
			
			
		/*else if(gun.equalsIgnoreCase("Cumartesi")) {
            
            System.out.println("Yahudiler icin kutsal gun");
            
        }else if(gun.equalsIgnoreCase("Pazar")) {
            
            System.out.println("Hristiyanlar icin kutsal gun");

*/		
		
			scan.close();
		
	}
	
}
