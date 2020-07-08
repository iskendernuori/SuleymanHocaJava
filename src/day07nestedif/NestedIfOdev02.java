package day07nestedif;

import java.util.Scanner;

public class NestedIfOdev02 {

	public static void main(String[] args) {
		//Kullanıcıdan bir harf girmesini isteyin.
		//Girdiği küçük harf ise harfin “a” olup olmadığını kontrol edin. Harf “a” ise ekrana “Ilk küçük harf” yazdırın. “a” değil ise ekrana “Ilk küçük harf değil” yazdırın.
		//Girdiği büyük harf ise harfin “Z” olup olmadığını kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdırın. “Z” değil ise ekrana “Son büyük harf değil” yazdırın.

		Scanner sc = new Scanner(System.in);
		System.out.println("Lutfen Bir Harf Giriniz: ");
		
		char harf = sc.next().charAt(0);
		if(harf== 'a') {
			System.out.println("Ilk küçük harf");
			}else if(harf != 'a') {
				System.out.println("Ilk küçük harf degil");
				
	
  		if(harf == 'Z') {
			System.out.println("Son buyuk harf");
		}else if(harf!='Z') {
			System.out.println("Son buyuk harf degil");
		}
		
		
		
		sc.close();
		
			}
	
	}
}
