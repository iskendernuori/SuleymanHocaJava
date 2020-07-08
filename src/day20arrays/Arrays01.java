package day20arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

	public static void main(String[] args) {
		
		//Kullanıcıdan kaç elemanlı bir array girmesini  isteyin.
		//Bu array’in tum elemanlarını ekrana yazdırın.
		//Bu arayın ilk elemanını son eleman yapın ve tum elemanlarını ekrana yazdırın.
		  //    Mesela; array {1, 2, 3} ise ekrana {2, 3, 1} seklin
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Kac elemanli bir  integer array olusturmak istiryorsunuz");
		
		int length = scan.nextInt();
		
		int arr[]= new int [length]; // uzunluk kullancıdan gelecek. bu da length in icinde
		
		System.out.println("Array Elemanlarini Giriniz : ");
		
		for(int i=0; i<length; i++) {
			arr[i]= scan.nextInt();
			
		}
		// Arrays.toString() methoduna parametre olarak array in ismini yazarsak
		// o array in tum elemanlarini göruruz.
		
		System.out.print(Arrays.toString(arr));
		
		int arrSon[]= new int[length];
		
		for(int i = 1; i<length ; i++) {
			arrSon[i-1]= arr[i];
			
		}
		arrSon[length-1]= arr[0];
		System.out.println();
		System.out.println(Arrays.toString(arrSon)); // return left denir. sona doğru gec
		
		
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
