package day07nestedif;

import java.util.Scanner;

public class NestedIfOdev01 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		
		 System.out.println("Lutfen Cinsiyetinizi Giriniz (Kadin/Erkek) ");
		 String cinsiyet = scan.nextLine();
		 if(cinsiyet == "erkek") {
			 }else {
				 System.out.println("Yanlıs Girdiniz");
			 }
			 
		 System.out.println("Lutfen Yasınizi Giriniz: ");
			int yas = scan.nextInt();
			if(yas< 18) {
				System.out.println("Erkek Cocuk");
			}else {
				System.out.println("Adam");
			
				}
			/*if(cinsiyet== "kadin") {
				System.out.println("Lutfen Yasınizi Giriniz: ");
				int kadin = scan.nextInt();
				if(yas<18) {
					System.out.println("Kiz Cocuk");
				}else {
					System.out.println("Kadin");
				*/
			
			scan.close();
			}
				
	
			
	}

				
		 

	


