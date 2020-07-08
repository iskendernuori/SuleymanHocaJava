package day09switchoperator;

import java.util.Scanner;

public class SwitchOdev02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Kullanıcıdan bir harf alın eğer harf 
		//“a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdırın.
		//“b, c, d, f” den biri ise ekrana “Sessiz harf” yazdırın.
		//Bu harflerin dışında bir character için “Geçersiz character” yazdırın.
		
			
		System.out.println("Lutfen Bir Harf Girin : ");
		char harf = scan.next().charAt(0);
		
		
		if(harf== 'a' || harf == 'e' || harf == 'i' || harf== 'o' || harf=='u') {
		 harf =1;
		}else if(harf== 'b' || harf == 'c' || harf == 'd' || harf== 'f') {
			harf = 2;
		}
			 
		switch(harf) {
		case 1 :
			System.out.println("Sesli Harf");
			break;
		case 2:
			System.out.println("Sessiz Harf");
			break;
		default:
			System.out.println("Gecersiz Character Girdinz ");
			
			scan.close();
		}
		
	}

}
