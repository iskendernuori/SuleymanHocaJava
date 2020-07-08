package java_Review;

import java.util.Scanner;

public class Day01 {

	public static void main(String[] args) {
		
		
		System.out.println("Hello World");
		
	/* aşağıdaki pascal ücgeni ni ekrana yazdıran program yazınız
	            
	            1
	         1     1
	       1    2     1
	     1    3    3    1
	    1  4    6     4   1
	    
	   
	
	/*
		/*System.out.println(" Paskal ucgenini yazdırma");
		System.out.println("      1");
		System.out.println("    1   1");
		System.out.println("   1  2  1");
		System.out.println("  1 3   3  1");
		System.out.println(" 1 4  6   4 1");
		
		
		*/
		
		//System.out.println("Elma şekli");
		/* Aşağıdaki şekli ekrana yazdıran bir program yazınız
	     A
	    B B
	   C   C
	  D     D
	 E       E
	F         F
	 E       E
	  D     D
	   C   C
	    B B
	     A
		
		*/
	/*	
		System.out.println("      A");
		System.out.println("     B B");
		System.out.println("    C   C");
		System.out.println("   D     D");
		System.out.println("  E       E");
		System.out.println(" F         F");
		System.out.println("  E       E");
		System.out.println("   D     D");
		System.out.println("    C   C");
		System.out.println("     B B");
		System.out.println("      A");
		
		
		// Sağlığın için evde kal 
		
		System.out.println("Saglıgın icin \"Evde Kal\" cumlesini ekranda yazdırınız");
		
		
		// Would you like 'coffe or 'tea'? cümlesini ekrana yazdırınız
		
		System.out.println("Would you like 'coffe' or 'tea'?" ); //Would you like 'coffe' or 'tea'?
		
		
		
		
		// double 10.231 i int'e çevirip çıktısını alıyoruz
		
		double sayi = 10.231;
		int sayi1  = (int) sayi;
		
		System.out.println(sayi1);  // 10
		
		*/
		
		/*
		int a=11; 
		int b= 5;
		double pi= 3.14;
		
		System.out.println("a * b = "+a*b);
		System.out.println("a * pi = "+a*pi);
		System.out.println("b / a = "+b/a);
		System.out.println("a * b / pi = "+a*b/pi);
		System.out.println("a + b + pi = "+a+b+pi);
		System.out.println("a + b= "+a+b);
		System.out.println("a - b = "+(a-b));
		System.out.println("-pi /a = "+(a+b)/pi);
		System.out.println((a+b) / pi );
		System.out.println((b / pi) * a);
		
		
		  55
          34.54
          0
		17.515923566878982
		19.14
		16
		6
		-0.28545454545454546
		5.095541401273885
		17.51592356687898
		 */
		
		
		
		/* 
		 hi 21
		 hi Harun
		 5TechProEd203
		 TechProEd305
		 7TechProEd05
		 */
		
		/*
		System.out.println("hi 21");
		System.out.println("hi Harun");
		System.out.println("5TechProEd203");
		System.out.println("TechProEd305");
		System.out.println(" 7TechProEd05");
		
		System.out.println("hi"+" "+"21");
		System.out.println("hi" + " "+"Harun");
		System.out.println("5" + " "+ "TechProEd"+" " + "203");
		System.out.println("TechProEd"+" " + "305");
		System.out.println("7" +" "+ "TechProEd" +" "+ "305");
		
		System.out.println("hi " +21);
		System.out.println("hi " + "Harun");
		System.out.println("5" + "TechProEd" + "203");
		//System.out.println(2+0+3 + "TechProEd" + 2+0+3 ); tırnaktan öncesini toplama, sonrasını string kabul eder
		
		
		
		System.out.println("TechProEd" + "305");
		System.out.println("7" + "TechProEd" + "05");
		
		
		 5TechProEd203
		TechProEd305
		7TechProEd05

		 */
		
		/*hi 21
		hi Harun
		5TechProEd203
		TechProEd305
 		7TechProEd05
		 */
		
		
		/*. -5 + 8 * 6
		b. (55+9) % 9
		c. 20 + -3*5 / 8
		d. 5 + 15 / 3 * 2 - 8 % 3
		
		
		
		int a = -5;
		int b = 8;
		int c = 6 ;
		System.out.println(a + b * c);
		
		int d = 55;
		int e = 9;
		int f = 9;
		
		System.out.println((d+e)% f);
		
		
		int sayi1 = 20;
		int sayi2 = -3;
		int sayi3 = 5;
		int sayi4 = 8;
		System.out.println(sayi1+ sayi2*sayi3 / sayi4);
		
		System.out.println(5 + 15 / 3 * 2 - 8 % 3);
		
	
		
		
			System.out.println(Math.pow(2, 3)); // sayinin üssünü alır
			
			System.out.println(Math.sqrt(144));// karakök ünü alır
			
			System.out.println(Math.round(3.9999));  // , sonrasina tamamlar
			
		
		
		
		
		// cevre = 2(boy+en) 
		// alan = en * boy
		
		double en = 5.6;
		double boy= 8.5; 
		
		double cevre = 2*(boy+en);
		double alan = boy*en;
		
		System.out.println("cevre ="+cevre);
		System.out.println("Alan= "+alan);
		
		
		
		
		
		System.out.println("cevre = " + (2* (en + boy)));
		System.out.println("alan = "+ en * boy  );
		
		//cevre = 28.2
		//alan = 47.599999999999994
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen Dikkdortgenin En  uzunluğunu giriniz:");
		
		
		int en = scan.nextInt();
		
		System.out.println("Lutfen Dikkdortgenin Boy  uzunluğunu giriniz:");
		int boy = scan.nextInt();
		
		int cevre = 2*(boy+en);
		int alan = boy*en;
		
		System.out.println("cevre ="+cevre);
		System.out.println("Alan= "+alan);
		
		
		
	*/	
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen İlk sayiyi giriniz:");
		int s1 = scan.nextInt();
		
		System.out.println("Lutfen ikinci sayiyi giriniz:");
		int s2 = scan.nextInt();
		
		System.out.println("Lutfen ucuncu sayıyı giriniz");
		int s3 = scan.nextInt();
		
		System.out.println(s1+s2+s3);
		/*
		 *Lutfen İlk sayiyi giriniz:
10
Lutfen ikinci sayiyi giriniz:
20
Lutfen ucuncu sayıyı giriniz
30
60

		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
	}

}
