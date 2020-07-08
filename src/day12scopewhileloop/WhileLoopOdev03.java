package day12scopewhileloop;

import java.util.Scanner;

public class WhileLoopOdev03 {

	public static void main(String[] args) {
		 // Kullanıcıdan başlangıç ve bitiş değerlerini alın ve 
		 //başlangıç değerinden veya sonrasından başlayıp bitiş değerinde 
		 //veya öncesinde biten tüm çift tamsayıları while loop kullanarak ekrana yazdırınız.

		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen baslangic tamsayisini giriniz :");
		int start =scan.nextInt();
		System.out.println("Lutfen son tamsayiyi giriniz :");
		int finish =scan.nextInt();
		
		while(start<finish) {
			if(start%2==0) {
				System.out.print(start + "-");
			}
			start=start+2;
		}
		
		scan.close();
	}

}
