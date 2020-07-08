package day23date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTekrar01 {

	public static void main(String[] args) {
		// Bugunun tarihini ekrana yazdıralım
		System.out.println(LocalDate.now());
		System.out.println(LocalDateTime.now());
		System.out.println(LocalTime.now());
		LocalDate date = LocalDate.now();
		System.out.println(date.plusDays(2));
		System.out.println(date.minusDays(3));
		
		System.out.println(date.minusMonths(5));
		
		LocalTime time = LocalTime.now();
		System.out.println(time.plusHours(2));
		
		LocalTime time1 = LocalTime.now();
		
		System.out.println(time1);
		LocalDate date1 = LocalDate.now();
		DateTimeFormatter frmt = DateTimeFormatter.ofPattern("dd/MM/yy"); // MM buyuk yazilmali
		System.out.println(frmt.format(date1));
		LocalTime time2 = LocalTime.now();
		DateTimeFormatter frmt1 = DateTimeFormatter.ofPattern("HH:mm");
		System.out.println(frmt1.format(time2));
		
	}

}
