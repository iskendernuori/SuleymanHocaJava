package day21maltidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTekrar01 {

	public static void main(String[] args) {
	
		
		List<String> list01 = new ArrayList<>();
		System.out.println(list01);
		
		list01.add("ali");
		list01.add("veli");
		System.out.println(list01);
		list01.add("can");
		System.out.println(list01);
		
		//list01.add(1, "ramazan");
		//System.out.println(list01);
		
		// han, ali, kemal, veli, can, ayse
		
		list01.add(0, "Han");
		list01.add(2, "kemal");
		list01.add("ayşe");
		
		System.out.println(list01);
		
		System.out.println(list01.size());
		
		
		
		
		
		
		
		
		
	}

}
