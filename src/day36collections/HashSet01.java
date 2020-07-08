package day36collections;

import java.util.HashSet;

public class HashSet01 {

	public static void main(String[] args) {
		// HashSet 1) Tekrarli eleman kullanımina(Duplication) izin vermez.
		//		   2) Key-Value yapısını kullanir. Key'le Value'ler HashSet için uniqu dir.
		//			Normalde; Key ler herzaman unique dir. Value lar kullanılan class a 
		//			bagli olarak unique olabili veya olmayabilir. Kullanilan class HashSet ise
		//			Value lar a unique olur ama ArrayList ise unique olma zorunlulugu yoktur.
		//			Digital bir sözlük oluştururken Arraylist oluşturmak lazim. Çünkü bir kelime
		//			bir kaç anlamı olabilir  [Dil=Kalp, Yurek=Kalp, Gonul=Kalp, Yuz=Sayi] 
		//			burada hashSet kullanırsak kalp i 1 den fazla kullanmayız. Bu yüzden 
		
		HashSet<String> hSet = new HashSet<>();
		hSet.add("Apple");// add methodu collection larda var. parent dir yani
		hSet.add("Mango");
		hSet.add("Grape");
		hSet.add("Orange");
		hSet.add("Fig");
		hSet.add("Apple");

		System.out.println(hSet);//[Apple, Fig, Grape, Mango, Orange]
		System.out.println(hSet.hashCode());
		
		
		
		
		
	}

}
