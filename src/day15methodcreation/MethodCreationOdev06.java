package day15methodcreation;

import java.util.Scanner;

public class MethodCreationOdev06 {

	public static void main(String[] args) {
		//do_while kullanarak bir oyun tasarlayın
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen Bir Esma'ul-Husna giriniz  :");
		String esma= scan.nextLine();
		esmaUlHusna(esma);
		scan.close();
		}
	public static void esmaUlHusna(String esma) {
		
		do {
			if(!(esma=="Ferd"|| esma=="Hakem" || esma=="Adl" || esma== "Kuddus") ){
				System.out.println("Tekrar Giriniz");
			}else {
				
			}
	
		}while(esma=="Ferd"|| esma=="Hakem" || esma=="Adl" || esma== "Kuddus");
		System.out.println("******** Tebrikler Ism-i Azam'i Bildiniz *******");
		
		
		
	}

}
