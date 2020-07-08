package day17constructors;

public class ConstructorTekrar01 {
	int yas=33;
	String isim = "Ali Can";

	public static void main(String[] args) {
		buyume(33);
		isiDegistirme("Ayse Han");
  
	}

	public static void buyume(int yas) {
		yas++;
		System.out.println(yas);
	}
	
	public static void isiDegistirme(String isim) {
	System.out.println(isim);	
	}
	
}
