package day36collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
		//TreeSet : 1) HashSet ile hemen hemen aynidir. Duplication a musaade etmez
		//	key-value yapısını kullanır
       //			2) Farki :TreeSet elemanlarini natural order a gore dizer.
		//			   		  HashSet ise rast gele dizer.
		//			3) TreeSet biraz yavaştır. Bundan cok kullnılmaz.
		//			4) Nutural order a sahip bir Set lazim olduğunda HashSet oluşturulur elemanlar 
		//			eklenir sonra bu HashSet TreSet e donusturulur boylelikle
		//			   hız sorunu halledilir
		//			Direkt treeSet oluşturulmaz. 
		//
		
		TreeSet<String> tSet = new TreeSet<>();
		tSet.add("ABC");
		tSet.add("String");
		tSet.add("Test");
		tSet.add("Pen");
		tSet.add("Ink");
		tSet.add("Jack");
		System.out.println(tSet);//[ABC, Ink, Jack, Pen, String, Test]
		
		HashSet<String> hSet1 = new HashSet<>();
		hSet1.add("ABC");
		hSet1.add("String");
		hSet1.add("Test");
		hSet1.add("Pen");
		hSet1.add("Ink");
		hSet1.add("Jack");
		System.out.println(hSet1);
				
		TreeSet<String> tSet1 = new TreeSet<>(hSet1);
		System.out.println(tSet1);
		
		tSet1.first();
		
	}

}
