package day17constructors;

public class ConstructorTekrar05 {

	public static void main(String[] args) {
		
		ConstructorTekrar04 obj1 = new ConstructorTekrar04();
		
		System.out.println(obj1.num1);
		
		System.out.println(obj1.num2); // num2 static olduğundan obj kullanarak cağırmamı java istemiyor
		
		System.out.println(ConstructorTekrar04.num2);
		
		
		

	}

}
