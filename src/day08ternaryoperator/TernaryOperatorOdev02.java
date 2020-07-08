package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperatorOdev02 {

	public static void main(String[] args) {
		//Kullanıcıdan iki tamsayı girmesini isteyin, ekrana her zaman büyük olanını yazdırın
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Lutfen Ilk Tam Sayiyi Giriniz :");
		int num1 = scan.nextInt();
		System.out.println("Lutfen Ikinci Tam Sayiyi Giriniz :");
		int num2 = scan.nextInt();
		
		int result = (num1<=num2) ? num2 : 0 ;
		System.out.println("result : " + result);
		
		
		scan.close();
	}

}
