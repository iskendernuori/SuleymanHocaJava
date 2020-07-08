package day38interviewhazirlik;

public class PassbyValue {

	public static void main(String[] args) {
		// Bir method a variable yollandiğında java o variablin kopyasini olusturur ve methoda kopyayi yollar 
		// bu yüzden methodun orginal degeri mehtod calistiktan sonra da ayni kalir buna Pass by Value denir
		
		//Pass by Refernece'da ise reference'in kopyasi olusturulur ve methoda yollanir
				//fakat reference'in kopyasi da kendisi gibi ayni object'i gosterdigi icin orjinal
				//deger degisir.akat reference in kopyasi da kendisi 
		
		
		//
		
		int x = 12; 
		
		System.out.println(increment(x));
		System.out.println(x);
		

	}
public static int increment(int a) {
	a= a+1;
	
	return a;
}
}
