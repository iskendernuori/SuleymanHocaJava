package day09switchoperator;

import java.util.Scanner;

public class SwitchBaskaOrnekler01 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int sayi = scan.nextInt();
		
		switch (sayi) {
		
		case 1:
			System.out.println("Bir");
			break;
		case 2:
			System.out.println("Iki");
			break;
		case 3:
			System.out.println("Uc");
			break;
		case 4:
			System.out.println("Dort");
			break;
		default:
			System.out.println("Gecersiz Sayi");
			
			scan.close();
		}

	}

}
