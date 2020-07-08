package day12scopewhileloop;

import java.util.Scanner;

public class WhileLoopOdev02 {

	public static void main(String[] args) {
	//	Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
	//	biten tüm tamsayıları while loop kullanarak ekrana yazdırınız.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen baslangic tamsayisini giriniz :");
		int start =scan.nextInt();
		System.out.println("Lutfen son tamsayiyi giriniz :");
		int finish =scan.nextInt();
	    
		
		while(start<finish) {
			if(finish>start)
				System.out.print(start+ " ");
			{
				
			
			}
			start++;
		
		
		
		scan.close();
		
		
		
	//	
		
		
		
		
		
		
		
		}	
		
		
	
	}
}
