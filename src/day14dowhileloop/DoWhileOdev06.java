package day14dowhileloop;

import java.util.Scanner;

public class DoWhileOdev06 {

	public static void main(String[] args) {
		//Aşağıdaki soruları do-while loop kullanarak çözünüz.
		//Kullanıcıdan bir String alın ve 
		//bu String’in icinde “a” harfi varsa ekrana “a harfi var” yazdırın.  “a” harfi yoksa tekrar bir String girmesini isteyin.

		
		
		Scanner scan = new Scanner(System.in);
		String isim = "";
		do {
			System.out.println("Lutfen bir kelime veya cumle giriniz.");
			isim = scan.nextLine();
			
			if(isim.contains("a")) {
				System.out.println("a harfi var.");
			}else {
			 System.out.println("Tekrar giris yapin");
			}
					
		}while(!isim.contains("a"));
		scan.close();

		}
	}



