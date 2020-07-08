package day17constructors;

public class Constructors02 {
// buyume methodu bu class ta degil. Constructors01 classinda bu yuzden Java kullanmama musaade etmiyor.
	// Eger siz baska class taki methodu kullanmak istiyorsaniz, 
	// o classtan bir obje olusturup, o obje sayesinde istediğiniz methodu kullanabilirsiniz.
	// methodun icinden clsss olusturlmasi gerekiyor.
	
	
	public static void main(String[] args) {
	
		Constructors01 obj1 = new Constructors01();
		
		
		// buyume methodu statik oldugndan java obje kullanarak buyume methodunu cagırmamızı istemez ve kodu sari renkle cizer.
		obj1.buyume(33);
		Constructors01.buyume(45); // 46 
		obj1.isimDegistir("Kemal Can");
		// buyume methodu statik oldugndan java obje kullanarak buyume methodunu cagırmamızı istemez ve kodu sari renkle cizer.
		Constructors01.isimDegistir("Merhaba Naci");
		System.out.println(obj1.isim);
		System.out.println(obj1.yas);
		
		// Bir variable veya method static olarak olusturumussa, o variable veya methods 
		//object olusturmadan sadece class ismini kullanarak ulasabilirsiniz
		System.out.println(Constructors03.ad); // 
		System.out.println(Constructors03.kilo);
		Constructors03.artirma(45);// 46
		Constructors03.degistirme("Merhaba Naci");
		
		
	}

}
