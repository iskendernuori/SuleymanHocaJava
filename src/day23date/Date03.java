package day23date;

import java.time.LocalTime;

public class Date03 {

	public static void main(String[] args) {
		
LocalTime time = LocalTime.now();

System.out.println(time);//18:29:33.797
System.out.println(time.plusSeconds(50)); // 50 sn ileri
System.out.println(time.plusMinutes(30));// 30 dk ileri 18:58:47.170
System.out.println(time.plusHours(3));// 21:28:11.017
	
System.out.println(time);
System.out.println(time.minusSeconds(40));// 40 sn gerin // 18:30:55.879
System.out.println(time.minusMinutes(15));	// dk geri   18:16:35.879
System.out.println(time.minusHours(3)); //  3 saat geri 15:32:29.355

LocalTime time1 = LocalTime.now();
System.out.println(time1);























	}

}
