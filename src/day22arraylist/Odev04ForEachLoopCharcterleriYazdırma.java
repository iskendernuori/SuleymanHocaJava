package day22arraylist;


public class Odev04ForEachLoopCharcterleriYazdırma {

	public static void main(String[] args) {
		
//		Bir String oluşturunuz, bu String’deki character’leri yukarıdan aşağıya for-each loop kullanarak yazdırınız.
//		İpucu: split()

		String str = "Sana sana sordum soylemedin nolacak diye";
		
		String harf []= str.split("");
		
		for(String w:harf) {
			System.out.println(w);
		}
		
		
		
	}

}
