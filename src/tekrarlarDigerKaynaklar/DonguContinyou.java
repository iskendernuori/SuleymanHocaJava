package tekrarlarDigerKaynaklar;

public class DonguContinyou {

	public static void main(String[] args) {
		
		
		for(int i=0; i<10;i++) {
			if(i==7 || i==5) {
				continue;  // buradaki koşulu sağlayan deger veya değerlerin pas gecilmesini sağlar.
			}
			System.out.println(i + " ");
		}
	

	}

}
