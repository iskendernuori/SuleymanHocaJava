package day12scopewhileloop;

import java.util.Scanner;

public class WhileLoopOdev04 {

	public static void main(String[] args) {
		//Kullanıcıdan başlangıç ve bitiş değerlerini alın ve 
		//başlangıç değerinden başlayıp bitiş değerinde biten tüm tamsayıların toplamını ekrana yazdırın.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen baslangic tamsayisini giriniz :");
		int start =scan.nextInt();
		System.out.println("Lutfen son tamsayiyi giriniz :");
		int finish =scan.nextInt();
		
		int sum = 0;
		while(start<finish) {
		sum = sum+start;
		start= start+1;
		
			}
		System.out.print(" sonuc :" + sum);
		scan.close();
		}
	}


