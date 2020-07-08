package day13whiledowhileloops;

import java.util.Scanner;

public class ForWhileOdev03 {

	public static void main(String[] args) {
		//Kullanıcıdan bir sayı alın ve bu sayının bölenlerini ekrana yazdırınız. 
		//Ornegin; 12'nin bölenleri 1, 2, 3, 4, 6, 12 dir.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi Giriniz :");
		
		int num = scan.nextInt();
		for(int i=1 ; i<=num/2; i++) {
			if(num%i==0) {
			
				System.out.println(i +" = " + "bir bolendir");
				
			}
			
		}
		System.out.println();
		System.out.println("While Loop ile cozumü :");
		
		int in = 1;
		while(in<num/2)
			if(num%in==0) {
				System.out.println(in +" = " + "bir bolendir");
			}
		in++;
		
		
		
		
		
		
		
		scan.close();

	}

}
