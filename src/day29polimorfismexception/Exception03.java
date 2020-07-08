package day29polimorfismexception;

public class Exception03 {

	public static void main(String[] args) {
	
		// Bolme islemi yapan bir program yazalım.
		
		int num1=6;
		int num2=0;
		try {
			System.out.println(num1/num2);//Exception in thread "main" java.lang.ArithmeticException: / by zero
		}catch(ArithmeticException e){
			System.out.println("Sifir ile bolme yapilmaz");
		}
		//ArithmeticException Run Time Exception dir. Matematik kurallarina uygun olmayan bir işlem yapıldığında
		// bu exception alinir.
		// try dan sonra birden fazla catch kullanilabilir ama ustteki catch alttaki catch in child i olmalidir.
		// Dizilim specific ten genele doğru dizmelisiniz.
	}

}
