package day14dowhileloop;

import java.util.Scanner;

public class DoWhileOdev05 {

	public static void main(String[] args) {
		
	//	ullanıcıya bir String girmesini söyleyin ve 
		//bu String’in ilk harfi ile son harfi aynı ise ekrana  “Simetrik” yazdırın. 
		//Aynı değilse tekrar bir String girmesini isteyin.

		Scanner scan = new Scanner(System.in);
		String simetrik ="";
		
		do {
			System.out.println("Lutfen bir kelime veya cumle giriniz");
			simetrik=scan.nextLine();
			if(simetrik.charAt(0)==simetrik.charAt(simetrik.length()-1)) {
				System.out.println("Simetrik");
			}else {
				System.out.println("Tekrar giris yapin ");
			}
		}while(!(simetrik.charAt(0)==simetrik.charAt(simetrik.length()-1)));

		
		
		
		
		
		/*		
	Scanner scan = new Scanner(System.in);
	String word;
	word =scan.nextLine();
			
	System.out.println(word.length()-1);
	
	
	
	
/*	
	do {
	
	System.out.println("Bir kelime giriniz :");
	word =scan.nextLine();
	if(word.charAt(0) == word.length()-1) {
		System.out.println("Simetrik Kelime");
	}else {
		System.out.println("Tekrar Giriniz :");
	}
		
		
	}while(word.charAt(0)!= word.length()-1);
	System.out.println("Simetrik Degil ");
	/*
		System.out.println("Bir kelime giriniz :");
		String word =scan.nextLine();
		
		
		
		
		
	*/
		scan.close();
			
	}			
	}
