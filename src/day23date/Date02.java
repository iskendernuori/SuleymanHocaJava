package day23date;

import java.time.LocalDate;

public class Date02 {

	public static void main(String[] args) {

	
// Date Manipulation (Date uzerinde degısıklık ypamak)
		
		
		LocalDate date = LocalDate.now(); // obje oluşturduk
		System.out.println(date);
		System.out.println(date.plusDays(3));
		System.out.println(date.plusDays(13)); // gun 30 dan fazla olunca ay ve yıl değişir.
		
		System.out.println(date.plusDays(-1)); //==> bu çok kullnılmaz bunun için farkli method var.
		
		
	    System.out.println(date.plusMonths(2));// ===> 2 yıl ekledik
	    
	    System.out.println(date.plusYears(2));// 2 yıl eklendi
	    
	    System.out.println(date.plusWeeks(2));// 2 hafta ekledik
	    
	    
	    System.out.println(date.minusDays(3)) ; // 3 gun geriye gittik
	    System.out.println(date.minusWeeks(2));// 2 hafta geriye gittk
	    
	    System.out.println(date.minusMonths(5)); // 5 ay geriye gittk
	    System.out.println(date.minusYears(5)); // 5 yıl geriye gittik
	    
	    
	    

	}

	
	
}
