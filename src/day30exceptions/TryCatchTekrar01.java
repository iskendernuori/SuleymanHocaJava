package day30exceptions;

public class TryCatchTekrar01 {

	public static void main(String[] args) {
		int num1 =12;
		int num2=0;
		
		try {
			System.out.println(num1/num2);
		}catch(ArithmeticException e) {
			System.out.println("Sifir ile bolme yapilamaz");
		}finally {
			System.out.println("Aferin sana ");
		}

	}
// public final  class Animal{
	
}
//public class Dog expends Animal{ //  final kullanılmış. class kısırlaştırılmış
	
}
}
