package tekrarlarDigerKaynaklar;

import java.util.Scanner;

public class IfAndFor {

	public static void main(String[] args) {
	// 100 den 0 a kadar olan sayilari ekrana yazdirin
		
		for(int i= 99; i>0; i--) {
			System.out.print(i + " ");
		}

		
System.out.println();		
	// 0 ile 100 arasindaki 3 ve 7 ye ayni anda bölune bilen sayiları ekrana yazdiriniz:
		Scanner scan = new Scanner(System.in);
		
		for(int i= 0; i<100; i++) {
			if(i%3==0 && i%7==0) {
				System.out.println(""+i);
			}
			


					
}



	
		
	}

}
