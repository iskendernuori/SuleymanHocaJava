package day15methodcreation;

import java.util.Scanner;

public class MethodCreationOdev03 {

	public static void main(String[] args) {
//		Kullanıcıya sayı girmesini söyleyin. 
//		Kullanıcının girdiği sayının rakamları toplamını ekrana yazdıran bir program yazın.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen sayiyi giriniz :");
		int num = scan.nextInt();
		int sonuc= 0;
		
		toplam(num,sonuc);
		scan.close();
			}
	
	public static void toplam(int num,int sonuc) {
		
		
	while(num>0) {
		
		sonuc= sonuc+(num%10);
		num =num/10;
		
	}
	System.out.println("Girilen Sayinin Rakamlari Toplamı =" + sonuc);
	
	}

}
