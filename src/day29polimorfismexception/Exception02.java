package day29polimorfismexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Exception02 {

	// Checked Exception lari (Compile Time Exceptioan)  handle etmek için 2 yol var;
	// Birincisi "throws" keyword unu kullanmak. Bunu kullanırsanız console da teknik mesajlar 
	// gorursunuz. Bu yüzden cok tercih edilmez.
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
			FileInputStream file= new FileInputStream("C: ogrenci.txt");  //"C:/ogrenci.txt"
		
		
	}
	

		
		
		
	}
// ikincisi ; try-catch block kullanmaktir. Bunu kullanirsaniz console da teknik mesajlar yerine 
// kendi yazdiğiniz mesajlari gorebilirsiniz. Bu yüzden try-catch kulllanmak tercih edilir.
class ExceptionTryCatch{
	public static void main(String [] args) {
		
		try {
			FileInputStream file= new FileInputStream("C:/ogrenci.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Dosya'nin path'i yanlis veya dosya silinmis olabilir");
		}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
