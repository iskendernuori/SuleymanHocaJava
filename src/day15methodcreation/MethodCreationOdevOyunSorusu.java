package day15methodcreation;

import java.util.Scanner;

public class MethodCreationOdevOyunSorusu {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("*****----   TAHMİN OYUNUNA HOSGELDİNİZ  ----******");
		System.out.println("Lutfen bir Tahminde bulun");
		
		int num = scan.nextInt();
	//	tahmin(num);
		
	//public static void tahmin(int num) {
		
		do {
			if(num%3==0) {
				System.out.println("******--- Tebrikler Kazandin ---*****");
			}
			
			
		}while(num<101);
		num++;
		
		scan.close();
	}
	}


