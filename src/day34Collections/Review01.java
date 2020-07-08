package day34Collections;

import java.util.Arrays;
import java.util.Scanner;

public class Review01 {

	public static void main(String[] args) {
		// Kullanicidan adini ve soyadini aliniz
		// 1)Ad ve soyadini console’a yazdirin
		// 2)Sadece adini console’a yazdirin
		// 3)Ad ve soyadinin ilk harflerini console’a yazdirin
		// 4)Ad ve soyadini console’a tersten yazdirin
		// 5)Ad ve soyadinda kullanilan tum karakterleri alfabetik sirada 
		//  console’a yazdirin.

Scanner sc = new Scanner(System.in);
System.out.println("Adinizi giriniz :");
String ad = sc.nextLine();

System.out.println("Soyadiniz giriniz : ");
String syad=sc.nextLine();
System.out.println(ad + syad);

System.out.println(ad);
System.out.println(ad.charAt(0) + " " + syad.charAt(0));



for (int i =ad.length()-1; i >=0; i--) {
	System.out.print(ad.charAt(i));
	
}
System.out.print(" ");
for (int i =syad.length()-1; i >=0; i--) {
	System.out.print(syad.charAt(i));
	// 4)Ad ve soyadini console'a tersten yazdirin
//    StringBuilder strB = new StringBuilder(ilkAd + " " + soyAd);
//    System.out.println("Tam isim tersten yazildi: " + strB.reverse());
	
}
System.out.println();
String tamAd= ad +syad;


String harfArr[]= tamAd.split("");
Arrays.sort(harfArr);
System.out.println(Arrays.toString(harfArr));






sc.close();


}

	}


