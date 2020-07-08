package day26encapsulation;

public class  Dog extends Mammel {

	public boolean sadik = true;
	
	
	
	public static void main(String[] args) {
	
		Dog dog = new Dog();
		System.out.println("Animal Class dan geldi "+dog.age);
		System.out.println(" Animal Class dan geldi "+ dog.name);
	    dog.eat();
	    dog.move();// animal class tan geliyor. 
	    
	    System.out.println("dogum yapabilir mi? :" +dog.dogum); // Mammal Class tan geldi
	    dog.feed();
	    System.out.println("Sadik mi? :"+ dog.sadik); // dog class tan geldi.
	
	}
	
	
	public void bark() {
		System.out.println("Kopek havlar");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}