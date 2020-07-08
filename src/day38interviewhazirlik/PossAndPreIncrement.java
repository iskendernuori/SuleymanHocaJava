package day38interviewhazirlik;

public class PossAndPreIncrement {

	public static void main(String[] args) {
		int a= 12;
		//a=a++; burada çıktı 12 olur. sebep :  a ya atama yapmasi. sonra a yi bir attırir fakat 
		// yazdirmaz
		
		// Post increment
		a ++;
		System.out.println(a);
		
		int b =22;
		// Post increment
		b++;
		System.out.println(b);
		
		int c=32;
		// Pree ıncrement
		c= ++c;
		System.out.println(c);
		
		
	}

}
