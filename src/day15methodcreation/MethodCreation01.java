package day15methodcreation;

public class MethodCreation01 {

	public static void main(String[] args) {
		
		System.out.println(toplam(3,5));// 3 ve 5 e argument denir. 2 parametrli bir main method olusturduğumuzda toplam in icine deger yazmamız gerekiyor.
		System.out.println(carpma(13,5));//15
		
	}

	
	// Bir methodu main methodun içinden cagirmak için mutlaka static kelimesini kullanmalısıznı
	// Method parantezinin içinde olusturulan variable lara "parametre" denir.
	// Method u cagırırken method parantezinin icine yazilan degerlere de "argument" denir.
	// Parametrenin data type ile argument in data type 1 e 1 eslesmeli.
	public static int toplam(int num1,int num2) {// bu kısma yazilan verable lara "Parametre" denir. toplama methodu 2 parametreli
		return num1+num2;
	}	
	
	public static int carpma(int num1, int num2) {
		return num1*num2;
		
		
	}
	
	
}
