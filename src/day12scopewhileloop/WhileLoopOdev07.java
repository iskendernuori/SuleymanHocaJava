package day12scopewhileloop;

import java.util.Scanner;

public class WhileLoopOdev07 {

	public static void main(String[] args) {
		 //Kullanıcıdan bir rakam alın ve bu rakam icin çarpım tablosunu ekrana yazdırın. Kullanıcının hata yapmadığını farz edin.
		 //Ornegin kullanıcı 3 girerse;
		 //3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
		 //While loop kullanarak 3 den 13 e kadar tum tek tamsayıları ekrana yazdırınız.
/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Bir Rakam Giriniz :");
		int num =scan.nextInt();
		
		if(num==0 || num<10 ) {
			}else {
			System.out.println("Lutfen Rakam Giriniz :");
		}
		int i = 1;
		while(i<10) {
		System.out.println(i);
			}
			i++;
			//System.out.print(num +"X" + i +" = " + (num*i));	
		
		*/
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir rakam giriniz:");
		int num=scan.nextInt();
		int i=1;
		
		while (i<=10) {
		     
		     System.out.println(num+" x "+i+" = "+(num*i));
		     i=i+1;
		}

		scan.close();
	}
}

