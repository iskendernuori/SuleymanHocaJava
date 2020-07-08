package java_Review;

public class Day02RandomSorusu {

	public static void main(String[] args) {
		//0 ile 1000 arasında random bir sayı oluşturarak 
		//bu sayının rakamları toplamını veren java algoritma kodunu yazınız ?	
		//random sayi= 185  toplamları = 14
		
	
        int randomSayi =	(int)(Math.random()*1000);  // 0 ile 1000 arasi degerler
		//int ramdomSayi =	(int)(Math.random()*10)+10; // 10 ile 20 arasindaki degerleri
		
		//Random random = new Random();
		// int randomSayi = random.nextInt(1000);
	
		System.out.println(randomSayi);
	    
		int birler = randomSayi%10; // birler basamağı
		
		randomSayi = randomSayi/10;
		
		int onlar = randomSayi%10;
		
		int yuzler = randomSayi/10; // yuzler basamagi
				
				System.out.println("Toplamlari = " + (birler+onlar+yuzler));
		
		
		
	}

}
