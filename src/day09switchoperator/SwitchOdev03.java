package day09switchoperator;

import java.util.Scanner;

public class SwitchOdev03 {

	public static void main(String[] args) {
		//Kullanıcıdan bir tamsayı alın eğer tamsayı 9 ise ekrana “Bir basamaklı en büyük sayı” yazdırın. 99 ise ekrana “İki basamaklı en büyük sayı” yazdırın.
		//999 ise ekrana “Üç basamaklı en büyük sayı” yazdırın.
		//Bu sayıların dışındaki sayılar için “Yorum yok” yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen Bir Tamsayi Giriniz :");
		int num = scan.nextInt();
		
		switch(num) {
		case 9:
			System.out.println("Bir Basamakli En Buyuk Sayi");
			break;
		case 99:
			System.out.println("Ikı Basamakli En Buyuk Sayi");
			break;
		default:
			System.out.println("Yorum Yok");
			
			scan.close();
		}
		
		
	}

}
