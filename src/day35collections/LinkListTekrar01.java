package day35collections;

import java.util.LinkedList;

public class LinkListTekrar01 {

	public static void main(String[] args) {
		// link list objesi oluşsturunuz
		
		LinkedList<String> linkList= new LinkedList<>(); // en başa List de yazilabilir. list parent dir
		
		linkList.add("Mark");
		linkList.add("Amanda");
		linkList.add("Chon");
		linkList.add("Ann");
		linkList.add("Pamela");
		System.out.println(linkList);
		
		linkList.remove(2);//[Mark, Amanda, Ann, Pamela]
		linkList.removeFirst();
		linkList.removeLast(); // son elemanı siler
		
		linkList.add(1, "Ali"); // indexe 1 e aliyi ekler
		System.out.println(linkList);
		linkList.addFirst("Kemal");
		linkList.addLast("Zeynep");
		
		linkList.set(1, "Ajanda");
		System.out.println(linkList);//[Kemal, Ajanda, Ali, Ann, Zeynep]
		
		LinkedList<String> linkList2 = new LinkedList<>();
		linkList2.add("X");
		linkList2.add("Y");
		
		linkList2.addAll(linkList);
		System.out.println(linkList2);
		
		linkList.addAll(3, linkList2);
		System.out.println(linkList);
		
		System.out.println(linkList2.contains("Ramazan"));// false
		System.out.println(linkList.contains("Kemal")); // true
		
		linkList2.clear();
		System.out.println(linkList2);
		
		
		
		 
		
		
		
	}

}
