package day27constructorcagirma;



public class Mammal extends Animal{

	public boolean dogum = true;
	
	
	
	public static void main(String[] args) {
		
		//Mammal mammal= new Mammal();
	    Mammal mammal01= new Mammal(15);
	}
	
	


	
	
	public void feed() {
		System.out.println("Cocuklarini besler");
	}
	
	
	
	
	 Mammal(){
		 this(11);// Parant daki parametresiz constructor u cagir
		 		 // Super() keyword unu kullanmasanızda olur. Bazilari kullanir sasirmayalim
		 		 // suprer() kullanılacaksa mutlaka ilk satırda olmalı.
		 		 // super () ve this () ayni constructor in içinde aynı anda olamaz.
		 		 // 
		 		
		System.out.println("Mammal parametresiz constructor");
		
	
	}
	 Mammal(int age) {
			super();
			System.out.println("Mammal parametreli constructor");


	}
}
















