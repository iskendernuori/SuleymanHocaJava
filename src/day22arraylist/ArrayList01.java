package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		// equals() methodu iki listin birbirine eşit olup olmadığını kontrol eder.
		// List ler esit ise "true" degilse "false" return eder.
		// Aynı index te aynı elemanaın olup olmadığını kontrol eder. sırlama onemli.
		// equals() methodu objelerin referanslarına bakmaz.		
		
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		System.out.println(list1.equals(list2));
		
		list1.add("A");
		list1.add("B");
		System.out.println(list1.equals(list2)); // false
		
		list1.add("B");
		list2.add("A");
		System.out.println(list1.equals(list2));// true
		
	
	}

}
