package day14dowhileloop;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
	// kullacidan syai alin sayii 10 dan kucuk ise ekrana kazandiniz yazdirin:
		//Sayi 10 veya 10 dan buyukse ekrana "Bir sayi giriniz" yazdirin.
		
		Scanner scan= new Scanner(System.in);
		int num; // deger versek olur, vermesende java ona 0 atayacak
		
		
		do {
			System.out.println("Bir Sayi Giriniz :");
			num= scan.nextInt();
		
		}while(num>=10);
		System.out.println("Kazandiniz");
		
		
		
		
		
		
		scan.close();
	}

}
