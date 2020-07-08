package day36collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

	public static void main(String[] args) {
		// Queue : Queue ya eklenen elemanlar en sona eklenir, list lerde olduğu gibi
		// Queue da silinen elemanlar en bastan silinir.
		// [1,2,3] ==> Bu Queue dan eleman silmeye basladığımızda once 1 silinir
		// FIFO ==> First In First Out (ilk gelen ilk çıkar)
		
		
		
		// PriorityQueue elemanlari natural order a gore siralar.
		Queue<String> q = new PriorityQueue<>();
		q.add("B");
		q.add("A");
		q.add("C");
		System.out.println(q );
		
		Queue<String> qll	= new LinkedList<>();
		qll.add("B");
		qll.add("A");
		qll.add("C");
		System.out.println(qll );
		
		System.out.println("Silinen eleman" + q.remove()); // A goruruz ekranda ==> remove( ) sildiği elemani return eder
														  // Herzaman ilk girinlen elemani siler
		System.out.println("Kalan queue " + q);
		
		System.out.println(q.remove("C")); // true yazar. Cunkü javaya hangi elemanı silmesi gerketiğini soyledik.
										// remove methodu boş queue yi silmez, exception verir.
		System.out.println(qll.element()); // ilk elemani gormek için kullanilir. ilk eleman Qeueu larda onemli 
		
		System.out.println(qll.poll()); // ilk elemani sildi ve return etti
		System.out.println(qll);
		System.out.println(qll.poll());
		System.out.println(qll); // C
		System.out.println(qll.poll());
		System.out.println(qll);//[]   
		System.out.println("Poll ile bos Queue yil sildiğinde " + qll.poll()); // Null aliriz.
		 
		
	}

}
