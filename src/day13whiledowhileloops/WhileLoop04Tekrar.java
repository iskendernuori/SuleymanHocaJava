package day13whiledowhileloops;

import java.util.Scanner;

public class WhileLoop04Tekrar {

	public static void main(String[] args) {
		// Kullanicinin girdiği sayi için çarpım tablosunu ekrana yazdirin.
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz :");
		int num = scan.nextInt();
		
		System.out.println("For Loop il cozüm ");
		
		for(int i= 1; i<11; i++ ) {
			System.out.println(num + "X" + i + "=" + (num*i));
			
		}
		
		System.out.println("While Loop ile cozumu");
		int num1 =1;
		while(num1<11) {
		System.out.println(num + "x" + num1 + "=" + (num*num1));
		num1++;

		}
		scan.close();
	}			
		
	}

