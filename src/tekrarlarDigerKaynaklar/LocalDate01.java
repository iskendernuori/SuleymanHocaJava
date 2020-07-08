package tekrarlarDigerKaynaklar;

import java.time.LocalDate;
import java.time.ZoneId;

public class LocalDate01 {

	public static void main(String[] args) {
	 
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
	    LocalDate bizimTarih = LocalDate.of(1983,8, 01);
System.out.println(bizimTarih);

		LocalDate bugunIstanbul = LocalDate.now(ZoneId.of("Europe/Istanbul"));

		System.out.println(bugunIstanbul);
		
		
		
		LocalDate yilinXgunu = LocalDate.ofYearDay(2017, 180);
		System.out.println(yilinXgunu);
	}

}
