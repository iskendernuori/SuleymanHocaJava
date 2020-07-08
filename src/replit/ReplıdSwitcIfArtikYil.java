package replit;

import java.util.Scanner;

public class ReplıdSwitcIfArtikYil {

	public static void main(String[] args) {

		// 1 ile 12 arasında girilen sayıdan ve yıldan yılın hangi ayı olduğunun ve
		// o yıl bu ayın kaç gün olduğunu hesaplayan Java kodunu yazınız.

		
		Scanner input = new Scanner(System.in);
		System.out.println("Ay numarasini giriniz :");
		int month = input.nextInt();
		System.out.println("Yili giriniz : ");
		int year = input.nextInt();

		String monthName = " ";
		int monthDay = 0;

		switch (month) {
		case (1):
			monthName = "Ocak ayi";
			monthDay = 31;
			break;
		case (2):
			monthName = "Subat ayi";
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				monthDay = 29;
			} else {
				monthDay = 28;
			}
			break;
			
		case (3):
			monthName = "Mart ayi";
			monthDay = 31;
			break;
		case (4):
			monthName = "Nisan ayi";
			monthDay = 30;
			break;
		case (5):
			monthName = "Mayis ayi";
			monthDay = 31;
			break;
		case (6):
			monthName = "Haziran ayi";
			monthDay = 30;
			break;
		case (7):
			monthName = "Temmuz ayi";
			monthDay = 31;
			break;
		case (8):
			monthName = "Agustos ayi";
			monthDay = 31;
			break;
		case (9):
			monthName = "Eylul ayi";
			monthDay = 30;
			break;
		case (10):
			monthName = "Ekim ayi";
			monthDay = 31;
			break;
		case (11):
			monthName = "Kasim ayi";
			monthDay = 31;
			break;
		case (12):
			monthName = "Aralik ayi";
			monthDay = 31;
			break;

		}
		System.out.println( year + " yili " + monthName +" " + monthDay + " gun" );
   input.close();
	}
	
}
