package day22arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		
		// toArray()  
		
		List<String> list = new ArrayList<>();
		
		list.add("Ali");
		list.add("Can");
		System.out.println(list);
		
//1. Yontem : 
		// toArrau() methodu nun içinde parametre olarak new String[] kullnırız
	    String arr[] = list.toArray(new String[0]);
	    System.out.println(Arrays.deepToString(arr));
	    
	    
//2. Yontem :
	    // Olusturduğumuz array in data typine object olarak secin.
	    // Object Class Java da butun class ların parent i dir. Yani Object ortak atadır.
	    // Object Class Java da parent i olmayan tek class dir.
	    // String Object Class in child i olduğundan, data type olarak olarka bazı durumlarda
	    // String yerine Object kullanırlırz
	    
	    Object[] arr1= list.toArray();
	    System.out.println(Arrays.deepToString(arr1));
	    
//asList(); methdou arraylaei liste cevirmek içindir.
	    // asList() methodu parametre olarak array in ismini kabul eder.
	    
	    String arr2[] = {"Ali", "Canan", "Aliye"};
	    
	    List<String> list1 = Arrays.asList(arr2);
	    System.out.println(list1);
	    
	    // Array den list e cevirme yaptığınızda, elde ettiğiniz list uzunluk olarak esnek degildir. 
	    //Yani array in kotu ozelliğni devam ettiri. Array den olusturduğunuz liste ekleme ve cıkarma yapamazsınız.
	   
	    //list1.add("Emine"); // add() yapamazsınız
	    //System.out.println(list1);
	    
	    //list1.remove("Aliye");// remove()  methodu da kullanılamaz. Run Time Error veri    "UnsupportedOperationException"
	    
	    list1.set(0, "Kemal");
	    System.out.println(list1); // set() methodu calışıyor gormuş olduk. 
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
