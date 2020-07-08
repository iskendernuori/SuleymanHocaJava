package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview02 {

	public static void main(String[] args) {
		// Kullanicidan bir String alin ve bu String'i ekrana tersten yazdirin
				//While Loop kullanin
				
				Scanner scan = new Scanner(System.in);
				System.out.println("Bir cumle veya kelime giriniz");
				String str = scan.nextLine();

				int length = str.length()-1; // length index sayisini veriri. -1 yaparsak son indexi verir.
				
				while(length>=0) { // son indexten geriye yazdiriacak. nereye kadar 0 a eşit olana kadar
					System.out.print(str.charAt(length));
					length--;
				}
				scan.close();
			}
		

	}


