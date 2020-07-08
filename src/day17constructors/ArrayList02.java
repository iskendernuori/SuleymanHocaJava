package day17constructors;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		
		
		
		
		
		// List ler data tip olarak Primitive leri kabul etmez.
		// Primitive lerde data type ini non primitive yapmak için wrapper class lari kullanabilir.
		
		
		
		List<Integer> list01    = new ArrayList<Integer>();  
		
		// Bu list in içinde eleman olup olmadiğini kontrol edin. Bunun için isEmpty() methodu kullanılır. Boş mu?
		// Bos ise true , dolu ise false return eder. 
		
		System.out.println(list01.isEmpty()); // boş olduğundan true aldık
		list01.add(123);
		System.out.println(list01.isEmpty()); // doldurduktan sonra false almış olduk. 
		
		
		// List den eleman silmek. remove() methodu kullanılır. Remove uzaklaştırmak demek
		list01.add(123);
		list01.add(124);
		list01.add(125);
		list01.add(126);
		list01.add(126);
		
		System.out.println(list01);
		
		list01.remove(3);// 
		System.out.println(list01);// 126 dan iki tane vardı birini sildi.
		// 123 silelim
		list01.remove(0);
		list01.remove(2);
		System.out.println(list01);
		
		
		// list teki son elemaı slileim
		
		
		
		list01.remove(list01.size()-1);
		System.out.println(list01);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
