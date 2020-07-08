package day36collections;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSet01 {

	public static void main(String[] args) {
		//LinkedHashSet : 1) Duplication a izin vermez, key-value yapisi var
		//				  2) Elemanlari programcinin girdiği siraya göre dizer.
		
		LinkedHashSet<String> lhSet1 = new LinkedHashSet<>();
		lhSet1.add("Z");
		lhSet1.add("A");
		lhSet1.add("D");
		lhSet1.add("B");
		System.out.println(lhSet1);
		
		LinkedHashSet<Integer> lhSet2 = new LinkedHashSet<>();
		lhSet2.add(3);
		lhSet2.add(1);
		lhSet2.add(5);
		lhSet2.add(0);
		System.out.println(lhSet2);
		TreeSet<Integer> tSet = new TreeSet(lhSet2);  // linkedSet oluşturup treeSet e donuşturduk
		System.out.println(tSet);
	}

}
