package day18statickeyword;

public class Static01 {

	// int en = 12;Static bloga koymak için int lerin onune static yazıyoruz.
	//int alan= en*boy;
	// Neden kullanırız : buyuk ve dagınık kodları formulleri static in içine atarak kolaylık olusturuz.
	
	static int en=12;
	static int boy=10;
	static int alan= en*boy;
	static double pi = 8; // bu degeri versek bile çıktı 3,14 olur. cunku ilk static bloc calışır
	
	// Eger bir variable in degerini olustururken hesap yapmamız gerekirse
	// "Static block" olusturmak iyidir. Yani "int alan = en*boy" demek yerine 
	// "Static bloc" olusturup bu işlemleri static blogun içine yazmak daha iyidir.
	// "Static bloc" variable lara dager atamak için de kullanilabilir.
	// "Static bloc" class in içinde butun method larin(main mathod dahil) ve constuctor larin dışında oluşturulmasi gerekiyor. 
	
	// "Static Bloc" class olusturuldugu zaman olusturulur.
	// Static Bloc tum methodlardan (main method dahil)ve constructorlardan once calıstırılır.
	// Birden fazla static bloc varsa hangisi once calışır : USTTEKİ ONCE CALIŞIR.
	
	static {
		
		pi = 3.14; // Static bloc daha once calısmazsa, pi nin degerini bulamaz. bundan static bloc ilk once calışır. 
				   //pi nin once calısmasini istedik. bumdan alan formulunden once kullandık

		}
	static {
		alan = en*boy;   // NEDEN BOYLE YAPTIK. FORMULE MUDAHALEYİ ONLEMİŞ OLUYORUZ.
	}
	
	public static void main(String[] args) {
		System.out.println(pi);
	}
	
	// Static class olusturulabilir ama alt class(inner class) lar static class olabilir. Ana class in corly brids inin içinde olmsi.
	// Ust class(outer class) lar static olamazlar.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
