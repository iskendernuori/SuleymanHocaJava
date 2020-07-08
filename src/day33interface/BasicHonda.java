package day33interface;

public class BasicHonda extends Araba  implements IcAraba, DısAraba{

	public static void main(String[] args) {
		BasicHonda basicHonda = new BasicHonda();
		basicHonda.diesel();
		basicHonda.direksiyon();
		basicHonda.kapi();
		basicHonda.klima();
		basicHonda.koltuk();
		basicHonda.move();
		

	}

	@Override
	public void move() {
		System.out.println("Safari için tasarlanmıs Honda");
		
	}

	@Override
	public void kapi() {
		System.out.println("Yalniz anahtar ile acilan kapilar");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("Terletmeyen direksiyon");
		
	}

	@Override
	public void koltuk() {
		System.out.println("Sogutma fonksiyonlu koltuklar");
		
	}

	@Override
	public void klima() {
		System.out.println("Toza karsi duyarli klima");
		
	}

}
