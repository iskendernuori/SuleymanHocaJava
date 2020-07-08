package day37Collections;

import java.util.Deque;
import java.util.LinkedList;

public class Dequeu {

	public static void main(String[] args) {
		// Dequeu: Double Ended Queue (iki uclu queu)
		// ==> Queue larda ekleme sondan yapilir, silme bastan yapılır
		// Dequeu kullanirsanız eklemeyi hem basa hem de sona yapabilirsiniz,
		// ayni sekilde slimeyi de hem bastan hem de sondan yapabilirsiniz
		// Deque da FIFO var bunu yaninda LIFO (Last In First Out) da var.
		// Deque resizable dir .Yani kapasitesi değiştirilebilir
		// Queue lara eleman olarka null eklenebilir ama Deque lara null eleman olarak eklenemez

		Deque<String> dq = new LinkedList<String>();
		dq.add("Eleman Son1");
		dq.addFirst("Eleman Bas1");
		System.out.println(dq);//[Eleman Bas1, Eleman Son1]
		dq.addLast("Son2");
		dq.push("Bas2"); // başa eklemek için kullanilir
		dq.offer("Son3");
		dq.offerFirst("Bas3");
		dq.offerLast("Son4");
		System.out.println(dq);
		
		// pop() methodu Deque lerde bastaki elemani siler ve bastaki elemani retrun eder.
		System.out.println(dq.pop());
		
		System.out.println(dq.removeLast());
		System.out.println(dq);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
