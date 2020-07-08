package day35collections;

import java.util.LinkedList;

public class LinkList01 {

	public static void main(String[] args) {
		// Linked list de head haric her eleman için bir data bir de pointer var
		// head de sadece pointer var.
		// HEr
		
		LinkedList<String> linkList = new LinkedList<>();
	       linkList.add("Mark");
	       linkList.add("Amanda");
	       linkList.add("Con");
	       linkList.add("Ann");
	       linkList.add("Pamela");
	       System.out.println(linkList);
	       
	       linkList.remove(2); // remove() methodu indexe gore eleman siler
	       System.out.println(linkList);
	       
	       linkList.removeFirst();
	       System.out.println(linkList); // mark silindi
	       
	       linkList.removeLast();
	       System.out.println(linkList); // amanda, ann
	       
	       linkList.add(1, "Ali");
	       System.out.println(linkList);
	       
	       linkList.addFirst("Kemal");
	       System.out.println(linkList);
	       linkList.addFirst("Kemal");
	       System.out.println(linkList);
	       linkList.set(1, "Ajanda");
	       System.out.println(linkList);
	       
	       
	       
	       LinkedList<String> linkList2 = new LinkedList<>();
	       
	       linkList2.add("X");
	       linkList2.add("Y");
	       
	       linkList2.addAll(linkList);
	       System.out.println(linkList2);
	       
	       linkList.addAll(3, linkList2);
	       System.out.println(linkList); // 3. indexten itibaen eklenir.
	       
	       linkList2.clear(); // listin elemanlarini siler
	       System.out.println(linkList2);
	       
		
		

	}

}
