package uygulamalartekrar;

import java.util.Scanner;

public class Uygulama02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int baslangic;
		int bitis;
		
		System.out.println("Hangi sayidan baslamak istiyorsunuz :");
		baslangic = scan.nextInt();
		
		System.out.println("Bitis degeri :");
		bitis = scan.nextInt();
		
		for(int i = baslangic; i<bitis; i++) {
			if(i%3==0 || i%4==0) {
				System.out.print(i + " ");
			}
			
		}
		
		
		
		
		scan.close();
		
		
		

	}

}
