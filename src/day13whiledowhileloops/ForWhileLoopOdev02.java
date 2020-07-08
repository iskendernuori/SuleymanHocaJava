package day13whiledowhileloops;

import java.util.Scanner;

public class ForWhileLoopOdev02 {

	public static void main(String[] args) {
		//Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
		//biten 3 ve 5 ile bölünebilen tüm tamsayıları ekrana yazdırınız.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Baslangıc Degeri Giriniz : ");
		int start = scan.nextInt();
		
		System.out.println("Lutfen Son Degeri Giriniz : ");
		int finish = scan.nextInt();
		System.out.println("For Loop ile cozumu");
		for(int i=start; i<=finish; i++) {
			if(i%15==0) {
				System.out.print(i +" ");
			}
		}
		System.out.println();
		System.out.println("While Loop ile cozumu :");
		
		int num = start;
		while(num<=finish) {
			if(num%15==0) {
				System.out.print(num + " ");
			}
			num++;
			scan.close();
		}
		
	}

}
