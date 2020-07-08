package day09switchoperator;

import java.util.Scanner;

public class SwitchOdev04 {

	public static void main(String[] args) {
		/*Kullanıcıdan ay ismi alın eğer ay ismi 31 çeken aylardan biri ise ekrana “Bu ay 31 gündür” yazdırın. 
		 Eğer ay ismi 30 çeken aylardan biri ise ekrana “Bu ay 30 gündür” yazdırın.
		Eğer ay ismi 28 veya 29 çeken aylardan biri ise ekrana “Bu ay Şubat ayıdır” yazdırın.
		Bu isimlerin dışındaki isimler için “Geçersiz ay ismi” yazdırın.
*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen Bir Ay Ismi Giriniz :");
		String month = scan.next();
		//String month =scan.next().toLowerCase();
		/*
		if(month == "ocak" || month =="mart" || month == "mayis" || month== "temmuz" || month== "agustos" || month == "ekim" || month== "aralik") {
			month = 1;
		}else if(month =="nisan" || month == "haziran" || month== "eylul" || month== "kasim" ) {
			month = 2;
		}
		*/
		switch(month) {
		case "ocak":
			System.out.println("Bu ay 31 Gundur");
			break;
		case "subat":
			
			System.out.println("Bu ay 28 vey 29 Gundur");
			break;
		case "mart":
			System.out.println("Bu ay 31 Gundur");
			break;
		case "nisan":
			System.out.println("Bu ay 30 Gundur");
			break;
		case "mayis":
			System.out.println("Bu ay 31 Gundur");
			break;
		case "haziran":
			System.out.println("Bu ay 30 Gundur");
			break;
		case "temmuz":
			System.out.println("Bu ay 31 Gundur");
			break;
		case "agustos":
			System.out.println("Bu ay 31 Gundur");
			break;
		case "eylul":
			System.out.println("Bu ay 30 Gundur");
			break;
		case "ekim":
			System.out.println("Bu ay 31 Gundur");
			break;
		case "kasim":
			System.out.println("Bu ay 30 Gundur");
			break;
		case "aralik":
			System.out.println("Bu ay 31 Gundur");
			break;
		default:
			System.out.println("Yanlış Ay Girdiniz...");
			
			
			
			
			
			
			
			
			
			
			
			
			
			scan.close();
			
			
			
			
			
			
			
			
			
			
			
		}
	}

}
