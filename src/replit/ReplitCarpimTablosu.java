package replit;

import java.util.Scanner;

public class ReplitCarpimTablosu {

	public static void main(String[] args) {
		//Belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayiyi giriniz :");
		
		
		int num1= scan.nextInt();
		int product = 1; 
		for(int i=2; i<=10; i++) {
			for(int j=1; j<=10; j++)
			product = num1*i;
			
			System.out.println(num1 +" X "+ i +  " = " + product);
			
		}
       scan.close();  
	}

}
