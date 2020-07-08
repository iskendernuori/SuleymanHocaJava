package day21maltidimensionalarray;

import java.util.Arrays;

public class SpiltMethodTekrar {

	public static void main(String[] args) {
	
		String str = "Ali baba ve kırk haramiler yediler doymadilar";
		
		String kelime[]= str.split(" ");
		
		System.out.println(Arrays.toString(kelime));
		System.out.println("Kelime Sayisi : " + kelime.length);
		
		String har[]= str.split("");
		System.out.println("harf sayisi :" + har.length);

	}

}
