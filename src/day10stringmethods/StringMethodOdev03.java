package day10stringmethods;

import java.util.Scanner;

public class StringMethodOdev03 {

	public static void main(String[] args) {
		//Kullanıcıdan ilk ve soy ismini alın ilk ve soy isminin ilk harflerini büyük harf olarak ekrana yazdırın.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Isminizi Giriniz :");
		String name = scan.next();
		System.out.println("Lutfen Soyisminizi Giriniz :");
		String sname= scan.next();
		
		System.out.println(name.substring(0, 1).toUpperCase() + name.substring(1) + " " + sname.substring(0, 1).toUpperCase() + sname.substring(1) );
		
		
		
		
		scan.close();
	}

}
