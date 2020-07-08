package day04operators;

import java.util.Scanner;

public class InterviewSorusu01 {

	public static void main(String[] args) {
		
		// Iki tane variable'in değerlerini yer değiştiriniz
		//sayi1=12, sayi2=30 ==> sayi1=30, sayi2=12  buna bu işleme swap denir.
		
		Scanner scan = new Scanner(System.in);
		
		//System.out.println("Yerlerini değiştirmek için iki sayi giriniz:");
		
		//double sayi1 = scan.nextDouble();
		//double sayi2 = scan.nextDouble();
		
		
		
		// 1. Yol 
		
	//	System.out.println("Yer degistirmeden once:");
	//	System.out.println(sayi1); //12.0
	//	System.out.println(sayi2);//30.0
		
	//	double gecici = 0.0;// veriable oluştururken data type sadece 1 kere yazılır.
	//	gecici = sayi1;
	//	sayi1 = sayi2;
	//	sayi2 = gecici;
		
	//	System.out.println("Yer degistirdikten sonra:");
	//	System.out.println(sayi1); //30.0
	//	System.out.println(sayi2);//12.0
		
		// açtığımız gecici veriable i kytular değiştikten sonra son sayi orada kalırç. yazzdırıılıp bakılabilir
	//	
	//	System.out.println(gecici);//12.0
		
		// 2. Yol
		
//System.out.println("Yer degistirmek iki sayi daha giriniz");
//        
//        double sayi3 = scan.nextDouble(); 
//        double sayi4 = scan.nextDouble();
//        
//        sayi3 = sayi3 + sayi4;
//        sayi4 = sayi3 - sayi4;
//        sayi3 = sayi3 - sayi4;
//        System.out.println("Yer degistirdikten sonra:");
//        System.out.println(sayi3);//30.0
//        System.out.println(sayi4);//12.0

		
		
	double sayi1 = 13;
	double sayi2=1.5;
	
	// bu iki variable swapp uygulayalım
	
//	1. Yol
		
//	double gecici = sayi1;
//	System.out.println(gecici);
//	
//	sayi1 = sayi2;
//	
//	System.out.println(sayi1); // burada sayi2 ye sayi1 in degerini atadık. 13 olan deger hem sayı2 de hemde gecici variable da.
//	
//	sayi2= gecici;
//	
//	System.out.println(sayi1);
//	System.out.println(sayi2);
//	
		
		
	 sayi1 = sayi1 + sayi2;	
	 System.out.println(sayi1);
	 
	 sayi2 = sayi1-sayi2;
	 System.out.println(sayi2); // sayi2 nin degeri 13 oldu.
	 
	 System.out.println(sayi1);// sayi1 in degeri 14,5 . burada sayi 1 bulmak için sayi1-sayi2 dememiz gerekiyor.
	 
	 sayi1 = sayi1-sayi2;
	 System.out.println(sayi1); // sayi1 in şimdiiki degeri 1,5 oldu
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
        scan.close();	
		
		
		
	}

}
