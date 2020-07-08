package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class Odev02ForEachLoopSayınınKaresiToplamı {

	public static void main(String[] args) {
		//Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin toplamını 
		//For-each loop kullanarak bulunuz. Sonucu ekrana yazdırınız.

	
		List<Integer> list = new ArrayList<>();
		
		list.add(4);
		list.add(3);
		list.add(5);
		
		System.out.println(list);
		
		int sum= 0;
		
		for(int w : list) {
			sum= sum+ w*w;
			
		}
		
		System.out.println(sum);
		
		
	}

}
