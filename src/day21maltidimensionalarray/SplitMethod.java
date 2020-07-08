package day21maltidimensionalarray;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		
		String str = "Ali Can okula basladi nasıl oldu? Iyi oldu ama zor.";
		
		
		// Split methodu kullandığınızda mutlaka bir Array olusturmak zorundasiniz.
		
		String  kelime [] = str.split(" ");
		
		System.out.println(Arrays.toString(kelime));
		System.out.println("Kelime sayisi : " + kelime.length);
		
		
		String str2 ="Kahramanmaraslilar iyi mi?";
		
		String harf []= str2.split("");
		System.out.println(Arrays.toString(harf));
		System.out.println("Harf sayisi :" + harf.length);
		
		String cardHide = "Kahramanlimaras";  //1234123456785678
        String arr[] = cardHide.split(" ");
        System.out.println(Arrays.toString(arr));

	}

}
