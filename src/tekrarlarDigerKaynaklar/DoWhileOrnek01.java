package tekrarlarDigerKaynaklar;

import java.util.Scanner;

public class DoWhileOrnek01 {

	public static void main(String[] args) {
		// kullanicıdan bir tam sayi aliniz
		// 1 den bu sayiya kadar olan sayilari yazdrin
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen bir tam sayi giriniz :");
		int num = scan.nextInt();
		
		
		int sayi = 1;
		
		do {
			
			System.out.print(sayi + " ");
			sayi++;
		}while(num>=sayi);
		
		
		
		scan.close();
		
		
		
	}

}
