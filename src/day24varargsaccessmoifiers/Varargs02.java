package day24varargsaccessmoifiers;

public class Varargs02 {

	public static void main(String[] args) {
	// Varargs in yanlış kullnımları
	
	// Kural 1: Varargs her zaman son parametre olmalidir
	// Cunkü ilk parametre yaparsanzı girdiğiniz her deger
		//varags in içine duşer, siz asla ikinci parametreye deger veremezsiniz
		
		valueChar("Character: ",'a');
		valueChar("Character: ",'a','b');
		product(5,6,7,8,9);
	}
	
	public static void valueChar(String s, char... c) {
		for(char w: c)	{
			System.out.print(s);
			System.out.println(w);
			}
		}
	
	// Kural 2: Parametre olarak 1 den fazla varargs kullanamazsınız.
	// Cunku varargs en sonda olmalıdır. En sonda olmak tek olmayı gerektirir. 
	
	
	public static void product( int x, int... y) {// bu kullanım hata verir
		int product = 1;
		
		for(int w : y) {
			product= product*w;
		}
		System.out.println(x);
		System.out.println(product);
	}
	
	
	
	
}
