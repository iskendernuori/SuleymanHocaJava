  package day29polimorfismexception;

public class Polymorphism01 {

	public static void main(String[] args) {
		// polimorphism ==>  coklu yapı
		// Overloading ve Overrriding ile bir method polymorphism haline getirilir.
		// Java da polymorp yapmak için ya Overloading (Parametreyi değiştirme)
		//veya Overrriding( body i değiştirirek) yaparak 
		// Polymorphism i Overloading ile yaparsanız "Compile Time Polymorphism" denir.
		// 				 diger adi	"Static Polymorphism" denir. 
		// Polymorphism i overriding ile yaparsanız "Run Time Polymorphism" denir.
		//				 dier adi "Dinamic Polymorphism" dir.
		
		
	}
	public void eat() {
		System.out.println("Ye!");
	}
	// Overloading ile polymorphism yaptık
	public void eat(String name) {
		System.out.println(name + "Ye!");
	}
class Yeni extends Polymorphism01{
	// Overriding ile polymorphism
		public void eat() {
			System.out.println("Lutfen Ye!");
		
}
		
	}
	
	
}
