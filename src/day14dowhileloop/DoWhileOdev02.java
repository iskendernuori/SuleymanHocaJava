package day14dowhileloop;

import java.util.Scanner;

public class DoWhileOdev02 {

	public static void main(String[] args) {
	
		//Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve 
		//başlangıç değerinden başlayıp bitiş değerinde  biten 4 ve 6 ile bölünebilen tüm tamsayıları ekrana yazdırınız.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen Başlangıç Degerini Giriniz");
		int start = scan.nextInt();
		System.out.println("Lutfen Bitiş Degerini Giriniz");
		int finish = scan.nextInt();
		
		
		int in = 12;
		
		do {
			if( in%12==0) {
				System.out.print(in + " ");
				
				}
			in++;
		}while(finish>in);
		
		scan.close();
		
	}
}
