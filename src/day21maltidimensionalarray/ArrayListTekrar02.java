package day21maltidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTekrar02 {

	public static void main(String[] args) {
		
		List<Integer> list01 = new ArrayList<>(); 
		
		System.out.println(list01.isEmpty());
		
		// bu liste bir eleman ekliyoruzu
		
		list01.add(4);
		System.out.println(list01.isEmpty()); // false
		
		list01.add(123);
		list01.add(124);
		list01.add(145);
		list01.add(124);
		
		System.out.println(list01);
		list01.remove(0);
		System.out.println(list01);
		list01.remove(list01.size()-1);
		list01.clear();
		System.out.println(list01.isEmpty());
		
		
		
	}

}
