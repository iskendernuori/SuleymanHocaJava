package day04operators;

import java.util.Scanner;

public class Modulus01 {

	public static void main(String[] args) {
		
		// 12835 sayisinin 23 e bolumunden kalanı bulan prgram yazınız?

		Scanner scan = new Scanner(System.in);
		
		int sayi1 = 12835;
		int sayi2 = 23;
   //System.out.println(12835%23);// Hard coding: Code dirkt sayı olması
   
		System.out.println(sayi1 % sayi2);
		// bu şekilde kod yazmak daha güvenli bir yöntemdir.
		// company lerde bu yontem daha tercih edilir. Çünkü değşkenler olabilri yeni yazılım olabilir değişmesi kolay olsun diye
		// gerek yok çünkü her veriable memoryde bir yer işgal eder. 
		// veriable oluşturup çalışmak gerekiyor
		
		
		scan.close();
	}

}
