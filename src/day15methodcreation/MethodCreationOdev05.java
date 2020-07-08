package day15methodcreation;

import java.util.Scanner;

public class MethodCreationOdev05 {

	public static void main(String[] args) {
		//Kullanıcıya bir String girmesini söyleyin ve bu String’i yukarıdan aşağıya doğru yazdıran Program yazınız.
		//Ornegin; CAN ==> C
		//		           A 
		//		           N
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz :");
		String word = scan.nextLine();
		int i= 0;
		int length = word.length()-1;
		write(word,i,length);
		scan.close();
	}
	public static void write(String word,int i,int length) {
		
		while(i<=length) {
			System.out.println(word.charAt(i) );
			i++;
		}
		
		
	}
	
	
	
}
