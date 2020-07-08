package day26encapsulation;

public class Cat extends Mammel{
	
	public boolean clean = true;
	
	
	public static void main(String[] args) {
	Cat cat = new Cat();
	
	System.out.println("Yasi : "+cat.age);
	System.out.println("ismi : " +cat.name);
	cat.move();
	System.out.println(cat.clean);
	System.out.println("Dogum yapabilir mi? :" + cat.dogum);
	cat.eat();
	cat.feed();
	cat.meow();
	cat.move();
	

	}
	
	public void meow() {
		System.out.println("Kediler miyavlar");
	}

}
