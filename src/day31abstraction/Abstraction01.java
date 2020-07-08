package day31abstraction;

public abstract class Abstraction01 {

	public static void main(String[] args) {
	// abstract classlardan obje uretemez.
		// constructors yoktur.
		//Abstract class lar concreete ve abstract methodlar içerebilir
		//Abstract class larin hem concreate hemde abstract olan child lari olabilir
		
		//Abstract class in child i concreate is  abstract class daki abstract methodlari mutlakak override
		// etmek zorundasınız
		
		// bunun fayadasi: Child class larda mecburen olmasi gereken methodlari bu şekilde berlemiş oluruz.
		//Abstract class in child i abstract ise bunu override etmek zorunda değilz.
		//

	}
	public  void concreteMethod() {
		System.out.println("Ben concrete'im");
	}
	public abstract void abstractMethod();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
