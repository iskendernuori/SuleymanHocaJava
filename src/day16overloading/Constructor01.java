package day16overloading;

public class Constructor01 {

	int price = 20000;
	int year  = 2020;
	String make = "Honda";
	String type = "Civic";
	

	public static void main(String[] args) {
		// Constructor main in icine yazilmaz
		// Class olusturdugumuzda Java Classla beraber bid constructor olusturur.
		// biz onu herhangi bir kod yazmadan direkt kullanabilirz. Bu constructor a "Default Constructor" denir.
		// Default Constructor larda paramaetre olmaz.
		// Default Costructor class olusturuldugu anda Java tarafından olusturulur.
		// Biz kendimiz bir Constructor olusturdugumuzda, Java Default constructor u imha eder.
		Constructor01 hondaAraba = new Constructor01(); // Bir obje uretildi.(Scanner scan = new Scanner(System.in)) bu bir constructor dur.
		
		
		System.out.println("Price : " +hondaAraba.price);
		System.out.println("Year : " + hondaAraba.year);
		System.out.println("Make : "+ hondaAraba.make);
		System.out.println("Type : "+ hondaAraba.type);
	}
	

}
