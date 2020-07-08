package tekrarlarDigerKaynaklar;

public class ArrayGelismisForLoop {

	public static void main(String[] args) {
		
		int[] sayilar = {1,4,6,2,5,777,54,55};
		
		int toplam = 0;
//		
//		for(int i=0; i<sayilar.length ; i++) {
//			System.out.println(sayilar[i]);
//		}
		for(int i: sayilar) {
			
			System.out.println(i);  // kısa yolu. 
			toplam +=i;
		}
System.out.println("Toplam :" + toplam);

	}

}
