package javatekrar;

import java.util.Scanner;

public class Day01 {

	public static void main(String[] args) {
		
		//Ekrana Adinizi ve Soyadinizi yazdiriniz
		
		
		System.out.println("Iskender Genc");
		
		String ilkIsim= "Iskender";
		String soyadi= "Mahir";
		String bosluk= " ";
		
		System.out.println(ilkIsim + bosluk+ soyadi);
		
	    
		
		// // Asagidakilerde ne tur yanlisliklar vardir? Ekrana dogru hallerini yazdiriniz.
//      int nm =11A;
//      String str = Merhaba;
//      char ch = "T";
//      boolean bl = "Dogru";
//      long ln = 1324.67;
//      double dl = 62;
//      float fl = 5.2;
      // Asagidakilerde ne tur yanlisliklar vardir? Ekrana dogru hallerini yazdiriniz.
//      int nm =11;
//      System.out.println(nm);
//      String str = "Merhaba";
//      System.out.println(str);
//      char ch = 'T';
//      System.out.println(ch);
//      boolean bl = true;
//      System.out.println(bl);
//      long ln = 132467;
//      System.out.println(ln);
//      double dl = 62.0;
//      System.out.println(dl);
//      float fl = 5.2f;
//      System.out.println(fl);
//		int unlem = '!';
//		System.out.println( '!' + "Ascii kod degeri:" + unlem);
//		int yuzde = '%';
//		System.out.println('%' + "Ascii kod degeri:"+ yuzde);
//		int star = '*';
//		System.out.println('*' + "Ascii kod degeri:"+ star);
//		int dolar = '$';
//		System.out.println('$' + "Ascii kod degeri:"+ dolar);
//		int bocek = '@';
//		System.out.println('@' + "Ascii kod degeri:" +bocek);
//		int ve = '&';
//		System.out.println('&'+ "Ascii kod degeri:" + ve);
//		
//		System.out.println(Integer.MAX_VALUE);//2147483647
//		System.out.println(Integer.MIN_VALUE);	//-2147483648
//		
//		System.out.println(Long.MAX_VALUE);//9223372036854775807
//		System.out.println(Long.MIN_VALUE);//-9223372036854775808
//		
//		int maxValue= Integer.MAX_VALUE;// bu yontem daha dinamiktir. maxValue degeri yerine başka deger atanabilir
//		int minValue= Integer.MIN_VALUE;
//	
//		System.out.println(maxValue);
		
		//Kullanicidan iki farkli kelime yazsin - (String) olarak
		//Program  bu kelimeleri beraberce ekrana yazdirsin ve sonuna unlem isareti eklesin.
		/* NOT ; ---> String'leri kullanicidan almak icin ya next() veya nextLine()
//		kullaniriz. next() tek kelimelik String'ler icin kullanilir.
//		Space gorunce String'i almayi birakir.
//		nextLine() girilen tum String'i almak icin kullanilir.*/
//		
//		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Birinci kelimeyi giriniz :");
//		String str1 = scan.next();
//		System.out.println("Ikinci kelimeyi giriniz :");
//		String str2 = scan.next();
//		
//		System.out.println("Yeni cumleniz; " +str1 + " " + str2 + " " + "!");
		
		
		// kullanici dan 2 sayi aliniz
		//girilen sayilarin karelerini ekrana yazdirsin
		// girilen sayilarin ayri ayri 5 ile carpımı.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Birinci sayiyi giriniz :");
		int num1 = scan.nextInt();
		System.out.println("Ikinci sayiyi  giriniz :");
		int num2 = scan.nextInt();		
		
		int ilkKare = num1*num1;
		System.out.println("İlk Kare :" + ilkKare);
		
		int ikinciKare = num2*num2;
		System.out.println("Ikinci Sayinin Karesi : " + ikinciKare );
		
		//System.out.println("Sayilarin Karesi :" + num1*num1 + " " + num2*num2);
		System.out.print("Sayilarin 5 çarpımı : "  +"ilk5Carpımı = "+ num1*5 + " " + "ikici5Carpımı = " +num2*5);
		
		
		
		scan.close();
		
	}

}
