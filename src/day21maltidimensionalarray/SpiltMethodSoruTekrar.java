package day21maltidimensionalarray;

import java.util.Arrays;

public class SpiltMethodSoruTekrar {

	public static void main(String[] args) {
		
		String str = "Seni seviyorum zalim huriş";
		
		str = str.replace(" ","");
		
		String krk[]= str.split("");
		System.out.println(Arrays.toString(krk));
		System.out.println(krk.length);
		 // boşluk sayiri kelime sayisindan 1 eksiktir.
	 
		String kelime[] = str.split(" ");
		int boslukSayisi= kelime.length-1;
		
		System.out.println(boslukSayisi);  // boşluklari sildik çunkü str ye atama yaptık
	}

}
