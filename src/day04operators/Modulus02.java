package day04operators;

import java.util.Scanner;

public class Modulus02 {

	public static void main(String[] args) {
		// kullancının girdiği 4 basamaklı sayının ilk ve son rakamınının toplamını veren program yazınız
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen dort basamakli bir sayi giriniz:");
		
		int s = scan.nextInt(); //bir tam sayınin birler basamağındaki sayıyı bulmak için 10 a böleriz
		
		int sonRakam = s % 10;
		int ilkRakam = s / 1000;//4 basamaklı olduğu için 1000 böldük
		
		System.out.println(sonRakam + ilkRakam);
		
		scan.close();
	}

}
