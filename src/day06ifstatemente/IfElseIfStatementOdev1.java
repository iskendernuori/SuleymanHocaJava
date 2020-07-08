package day06ifstatemente;

import java.util.Scanner;

public class IfElseIfStatementOdev1 {

	public static void main(String[] args) {
		//Kullancıdan bir tamsyı alın eger tamsyı 10 dan kucuk ve 0 dan buyuk eşit ise ekrana 
		//"Rakam" yazdırın. Diger durumlarda ekrana "Sayı" yazdırın.
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Bir Tam Sayı Yazınız");
		int num =scan.nextInt();
		
		if(num<10 && + num>=0) {
			System.out.println("Rakam");
		}else {
			System.out.println("Sayi");
			scan.close();
		}
		
		

	}

}
