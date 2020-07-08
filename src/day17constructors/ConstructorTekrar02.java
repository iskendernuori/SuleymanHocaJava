package day17constructors;

public class ConstructorTekrar02 {

	public static void main(String[] args) {
		
		
		ConstructorTekrar01 obj1 = new ConstructorTekrar01();
		obj1.buyume(33);
		ConstructorTekrar01.buyume(45);
		obj1.isiDegistirme("Babanin oğlu Kemal"); // static yaptığımızdan, neden static olan bir variable 
												//veya methodu obje ile cağırıyorsun. Class ismi ile cağır
		System.out.println(obj1.isim);  // isim variable olduğundan syso içine aldık
		System.out.println(obj1.yas);
		
		System.out.println(ConstructorTekrar03.ad);  
		System.out.println(ConstructorTekrar03.kilo);
		ConstructorTekrar03.artirma(45);
		ConstructorTekrar03.degistirme("Merhaba Naci");
	}

}
