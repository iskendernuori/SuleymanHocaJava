package day09switchoperator;

import java.util.Scanner;

public class Switch03tekrar {

	public static void main(String[] args) {
				// Kullanıcı ay ismini girsin 
				//program kacinci ay olduğunu ekrana yazsin
				// buyuk kucuk harf hepsi icin calıssın
				// yanlıs ay girerse "Gcerli Ay giriniz" desin
				
				
				Scanner scan= new Scanner(System.in);
				System.out.println("Ay ismini Giriniz : ");
				String month = scan.next();
				month = month.toLowerCase();
			
			switch (month) {
			
			case "ocak":
				System.out.println("1.Ay");
				break;
			case "subat":
				System.out.println("2.Ay");
				break;
			case "mart":
				System.out.println("3.Ay");
				break;
			case "nisan":
				System.out.println("4.Ay");
				break;
			case "mayis":
				System.out.println("5.Ay");
				break;
			case "haziran":
				System.out.println("6.Ay");
				break;
			case "temmuz":
				System.out.println("7.Ay");
				break;
			case "agustos":
				System.out.println("8.Ay");
				break;
			case "eylul":
				System.out.println("9.Ay");
				break;
			case "ekim":
				System.out.println("10.Ay");
				break;
			case "kasim":
				System.out.println("11.Ay");
				break;
			case "aralik":
				System.out.println("12.Ay");
				break;
			default:
				System.out.println("Yanlıs Ay Ismi Girdiniz..");
				
				scan.close();
			}
			
			
	}

}
