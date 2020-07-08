package day06ifstatemente;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {
		//kullancıdıan bir dikdörtgenin en v boyunu alın
		//en boy eşitsee bu bir karedir
		//en ve boy farklı ise bu bir dikdörtgenir yazdırın
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen en giriniz:");
		double en = scan.nextDouble();
		
		System.out.println("Lutfen boy giriniz:");
		double boy = scan.nextDouble();
		
	if(en==boy) {
			System.out.println("Bu bir Kare");
		}
		if(en!=boy) {
			System.out.println("Bu bir dikdortgen");
	
	}
	

	//else= başka ==> diğer ihtimallerin tamamı
	//dondurma yerim else ==> dondurma dışında herşey yerim
	// en ile boy ya eşittir ya da değildir. burada else kullanırlır
	// else kullunıırsa condition u birkez çalıştırır. bu da hız katar
	//kodun kısa olması
		//bizim mantığımızı yormuyor.
		
	if(en==boy) {
		System.out.println("Bu bir karedir");
	}else {
		System.out.println("Bu bir dikdortgendir");
		scan.close();
		
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
