package day14dowhileloop;

import java.util.Scanner;

public class DoWhileOdev04 {

	public static void main(String[] args) {
		//Kullanıcıya iki sayı girmesini söyleyin. 
		//Bu sayılar eşit ise ekrana “Kare oluşturdunuz” yazdırın. Eşit değilse tekrar iki sayı girmesini söyleyin

		Scanner scan=new Scanner(System.in);
		
		
		
		
		int num1;
		int num2;
		
		do{
			
			System.out.println("Birinci sayiyi giriniz");
			num1=scan.nextInt();
			System.out.println("İkinci sayiyi giriniz");
			num2=scan.nextInt();
			if(num1==num2){
				System.out.print("Kare oluşturdunuz");			
			}
			else{
				System.out.println("Tekrar iki sayi giriniz");
			}
		}while(!(num1==num2));
scan.close();
	}
		 
		
		
		
		
		
	}


