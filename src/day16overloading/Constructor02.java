package day16overloading;

public class Constructor02 {

	public static void main(String[] args) {
		
		
		// 1)Baska bir class tan urettiğimiz object urettiğimiz class da  kullanabiliririz.
		// 2)Object in ozelliklerini degistirebiliriz, fakat bu degisim sadece o object ile
		//   sınırlı kalir. Yeni uretilecek olan object ler bu degisimlerden etkilenmez.
		// 3)Eger uretilecek her object in degişime ugramis olamasini istiyrsaniz class daki ozellikleri degistirmelisizniz. 
		
		Constructor01 hondaAraba01 = new Constructor01();// niye yeni obje ismi verdik. cunku her obje farkli olmalı. burada 
														 // diger clss daki Constructor u kullandik. 
														
		System.out.println("Zamli Fiyat = " + (hondaAraba01.price+1000));
		System.out.println("Year : " + (hondaAraba01.year-1));
		System.out.println("Make : "+ hondaAraba01.make.replace("Honda", "Toyota"));
		System.out.println("Type : " + hondaAraba01.type.replace("Civic", "Camry"));
		
		
		Constructor01 hondaAraba02 = new Constructor01();
		System.out.println("Zamli Fiyat: " + (hondaAraba02.price));

		
		
	}

}
