package day24varargsaccessmoifiers;

public class Varargs01 {

	public static void main(String[] args) {
		
		
		// Varargs: Variable Arguments 
		// Bir method olusturduğumuzda argument olarak istediğimiz kadar
		// argument girebilmemizi saglar.
		countNum(5);
		countNum(5,7,9);
		countNum(5,7,9,11,23,45,66);
		
		sumNums(2,3);
		sumNums(5,6);
		sumNums(4.5,67,3293424,9990033);
		
		printName("Ali", "Kahraman");
		printName("Ali","Can", "Kahraman");
		
	}

	public static void countNum(int... a) {
		System.out.println(a.length);
		
	}
	
	public static void sumNums(double... b) {
		double sum=0;
		for(double w: b) {
			sum= sum+w;
		}
		System.out.println(sum);
	}
	
	public static void printName(String... n) {
		
		for(String w: n) {
		
			System.out.print(w + " ");	
		}
		
		
		
	}
	
	
	
}
