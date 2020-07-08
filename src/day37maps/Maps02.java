package day37maps;

import java.util.Hashtable;

public class Maps02 {

	public static void main(String[] args) {
		/*HashTable : HashMap ile hemen hemen aynidir
		 * 			1) HashTable konsola yazdirildiğnda hashMap gibi rastgele
		 * 				sıralamada yazdirilir
		 * 			Farklari: 
		 * 			1) Key ve value larda null amusaade etmez
		 * 			2) HashTable thread safe dir.
		 * 			3) HashTable daha yavastir
		 */

		Hashtable<String,String> hTable = new Hashtable<>();
		
		hTable.put("Dil", "Kalp");
		hTable.put("Gonul", "Kalp");
		hTable.put("Dil", "Tad alma organi");
		//hTable.put(null,"Agizlik"); RTE verir.
		
		//hTable.put("Kannat", null); RTE e vriri. 
		// Ayni key degerini tekrar kullanirsaniz son value kabul eder
		System.out.println(hTable); //{Dil=Tad alma organi, Gonul=Kalp}
		// hashMap teki methodların tamamı HashTable da da kullanilir
		
	}

}
