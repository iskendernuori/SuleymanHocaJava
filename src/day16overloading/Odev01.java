package day16overloading;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Bir sayi giriniz :");
			int num=scan.nextInt();
			rakamToplami(num);
			scan.close();
		}
		public static void rakamToplami(int num) {
			int sum = 0;
			while(num!=0) {
				sum = sum+num%10;
				num = num/10;
				
			}
			System.out.println("Rakamlarin toplami :" + sum);

	}

}
