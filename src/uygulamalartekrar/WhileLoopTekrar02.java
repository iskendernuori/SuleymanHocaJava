package uygulamalartekrar;

import java.util.Scanner;

public class WhileLoopTekrar02 {

	public static void main(String[] args) {
		 // Kullanıcıdan başlangıç ve bitiş değerlerini alın ve 
		 //başlangıç değerinden veya sonrasından başlayıp bitiş değerinde 
		 //veya öncesinde biten tüm çift tamsayıları while loop kullanarak ekrana yazdırınız.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Baslangic degerini giriniz :");
		
		int start = scan.nextInt();
		
System.out.println("Bitis degerini giriniz :");
		
		int finish = scan.nextInt();
		
		
		while(start<finish) {
			if(start %2==0) {
				
				System.out.println(start + " ");
			}
			start= start +2;
		}
		scan.close();
		
	}

}
