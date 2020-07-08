package day09switchoperator;

import java.util.Scanner;

public class SwitchOdev05 {

	public static void main(String[] args) {
		
		//Kullanıcıdan A, B, C, D harflerinden birini alın eğer harf C ise ekrana “Doğru cevap” yazdırın. 
		//A, B, D den biri ise ekrana “Yanlış cevap” yazdırın.
		//Bu harflerin dışındaki harfler için “Geçersiz cevap şıkkı” yazdırın.
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Bir Harf Giriniz :");
		char harf = scan.next().charAt(0);
		
		
		if(harf=='C') {
			harf=1;
		}else if(harf=='A' || harf== 'B'  || harf=='D') {
			harf =2;
		}
		
		switch(harf) {
		case 1:
			System.out.println("Dogru Cevap");
			break;
		case 2:
			System.out.println("Yanlis Cevap");
			break;
		default:
			System.out.println("Gecersiz Cevap Sıkki");
			
			scan.close();
		}
		
		
		
		
	}

}
