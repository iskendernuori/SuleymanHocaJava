package day01veriable;

public class Veriable01 {
	public static void main(String[] args) {
		
		int maas = 3000;
		
		char harf = 'S'; // char lere değer verirken '' içerisine yazmanız gerekiyor. tek değer vermeniz gerekior
		
		System.out.println(maas); // bunu yaparsak ekranda değerini görürüz. 3000 yani
		System.out.println(harf);
		
		int sayi = 123;
		System.out.println(sayi);
		
		boolean isOld = true; // boolean lar için sadece true veya false değerei kullanılır
		System.out.println(isOld);// sonuç ekranında true görmem gerekiyor
		
		boolean isNew = false; 
		System.out.println(isNew);
		
		byte derinlik = -123;// küçük değerler için byte kullanmak daha mantıklı. çünkü memory az kullanmak kolaylık sağlar
		System.out.println(derinlik);
		
		short sirnakNufus = 28000;
		System.out.println(sirnakNufus);
		
		
		
		long hucreSayisi = 3534253429999999000l;// intiger sayısı sınırını aşan sayılar kullanırsak sayının sonuna "l" konr. byük L de olabilir
		
		System.out.println(hucreSayisi);
		
		
		double pi = 3.147383930923492343; // java bütün ondalıklı kesirleri 
		                                  // otomatic olarka doble kabul eder 
		                                  // eğer pi değeri yazılmazsa 0 olarak kbaul edre
		System.out.println(pi);
		
		float para = 5.25f; // Eğer bir ondalık kesri float yapmak isterseniz sonuna "f" koylursa float olarak java algılar
		System.out.println(para);
		
		
		String ogrenciIsmi = "Ali Can";
		System.out.println(ogrenciIsmi);
		
		
		
		
		
	}

}
