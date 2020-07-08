package day16overloading;

public class ConstructorTekrar01 {

	
	
	int price = 20000;
	int year = 2020;
	String  make= "Honda";
	String type = "Civic";
			
	public static void main(String[] args) {
		Constructor01 hondaAraba = new Constructor01();
		System.out.println("Price :"+hondaAraba.price); 
		
		System.out.println("Year :"+hondaAraba.year);
		System.out.println("Make :"+ hondaAraba.make);	
		System.out.println("Type :" + hondaAraba.type);
		
		

	}

}
