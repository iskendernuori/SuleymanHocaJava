package day32abstraction;

public class KralDairesi extends Otel {

	public static void main(String[] args) {
	KralDairesi musteri3 = new KralDairesi();
	musteri3.kahvalti();
	System.out.println("international tv ucreti :" +musteri3.tv("international", 12));
	System.out.println("Wifi ucretiniz :" +musteri3.wifi(10));

	}

	@Override
	public void kahvalti() {
	System.out.println("Kahvaltiniz teras kat Kral Restaurant'dadir");
		
	}
	
	public int tv(String international, int saat) {
		if(international.equals("international")) {
			return saat*5;
		}else {
			return 0;
		}
	}
			
		
	}


