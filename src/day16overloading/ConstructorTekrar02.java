package day16overloading;

public class ConstructorTekrar02 {

	public static void main(String[] args) {
	
		
		Constructor01 hondaAraba01 = new Constructor01();
		System.out.println("Zamli Fiyat :"+ (hondaAraba01.price + 1000));
		
		System.out.println("Year :" + (hondaAraba01.year-1));
		
		System.out.println("Make :" +hondaAraba01.make.replace("Honda", "Toyota"));
		
		System.out.println("Type :" + hondaAraba01.type.replace("Civic", "Camry"));
		
		

	}

}
