package day33interface;

public class LuxHonda extends Araba implements IcAraba, DısAraba{

	public static void main(String[] args) {
		LuxHonda luxHonda = new LuxHonda();
		luxHonda.benzin();
		luxHonda.direksiyon();
		luxHonda.kapi();
		luxHonda.klima();
		luxHonda.koltuk();
		luxHonda.move();
		System.out.println("Ic araba interface inden price :"+IcAraba.price);
		System.out.println("Dıs araba interface inden price :"+DısAraba.price);
		System.out.println(old);
		luxHonda.doseme();
		IcAraba.isitma();
	}

	@Override
	public void move() {
		System.out.println("3 saniyede 100km lik hiza ulasır");
		
	}

	@Override
	public void kapi() {
		System.out.println("Parmak izi ayarli kapi");
		
	}

	@Override
	public void direksiyon() {
	
		System.out.println("Gercek deri dreksiyon");
	}

	@Override
	public void koltuk() {
		System.out.println("Isıtmali deri koltuk");
		
	}

	@Override
	public void klima() {
		System.out.println("Digital Klima");
		
	}

}
