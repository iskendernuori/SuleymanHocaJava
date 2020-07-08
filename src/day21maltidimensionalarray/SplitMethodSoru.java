package day21maltidimensionalarray;

public class SplitMethodSoru {

	public static void main(String[] args) {
		// Verilen bir cumledeki bosluklar haric karakter sayısını bulunuz. 
		// 
		
		
		
		String cumle = "Verilen bir cumledeki bosluklar haric karakter sayısını bulunuz.";
		
		
		
		cumle = cumle.replace(" ", ""); // Artık butun boslukları sildik. 
		
		String harf[]= cumle.split("");
		System.out.println(harf.length);
		
		
		// 2. yol
		// herzaman bosluk sayısı kelime sayısından 1 eksiktir. 
		// bosluk sayisi = kelime sayisi -1 
		
		String cumle2 = "Verilen bir cumledeki bosluklar haric karakter sayısını bulunuz.";
		String kelime[] = cumle2.split(" ");
		int boslukSayisi = kelime.length-1;
		System.out.println(boslukSayisi);
		
		String character[] = cumle2.split("");
		System.out.println(character.length-boslukSayisi);
		
		
	}

}
