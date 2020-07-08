package day23date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Day04 {

	public static void main(String[] args) {
	
// Date formatini degiştirme
		
		LocalDate date = LocalDate.now();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");  // neden buyuk "M", java da "m" dakikayı gösterior
		
		System.out.println(dtf.format(date));
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yy");
		System.out.println(dtf1.format(date));
		
	
		System.out.println(dtf1.format(date.plusMonths(7)));
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/M/dd");
		System.out.println(dtf2.format(date));// 20/5/20
		
// Time Formatini degistirme.
		
		LocalTime time = LocalTime.now();
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("HH:mm");// 
		System.out.println(time);
		
		
		// başka ulkenin local zamanını almak için??  Buna bakalım arastıralım.
		
		//System.out.println(LocalTime.now(ZoneId.of("Europe/Berlin")));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
