package day32abstraction;

public class TekKisilikOda extends Otel {

	public static void main(String[] args) {
		TekKisilikOda musteri1 = new TekKisilikOda();  // tek ksilk oda objesi açılır. resepsiyon 
													 // butonu tıkladığında
		musteri1.kahvalti();  // kahvalti fix idi. o da gelir
		System.out.println("Tv ucreti :" +musteri1.tv(5));
		System.out.println("Wifi ucreti :" +musteri1.wifi(1));
	}

	@Override
	public void kahvalti() {
		System.out.println("Kahvaltiniz sandvictir");
		
	}
	
	public int tv(int saat) {
		return saat*2;
	}

}
