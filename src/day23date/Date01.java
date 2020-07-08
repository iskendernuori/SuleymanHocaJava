package day23date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date01 {

	public static void main(String[] args) {
	// Bugunun tarihini ekrana yazdıralım
		
		
		System.out.println(LocalDate.now());
		
		// Bugunun zamanını saat,dakika, saniye ve salise olarak ekrana yazdırır
		System.out.println(LocalTime.now());
		
		// Bu gunun tarih ve saatini ekrana yazdırmak için kullanılır.
		System.out.println(LocalDateTime.now());// 2020-05-20T18:02:02.235 buradaki T  tarih ve zmanı ayırmak için kullanılır.
		
		
		
		

	}

}
