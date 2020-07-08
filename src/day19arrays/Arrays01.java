package day19arrays;

public class Arrays01 {

	public static void main(String[] args) {
	// Integer Array oluşturualım
	
	int arr1[]= new int [5];
	System.out.println(arr1); // arry in adresini verir
	System.out.println(arr1[0]);// 0. index ini verir
	System.out.println(arr1[3]);// 3. indexi verir.
	
	
	arr1[0]= 12; // indexi 0 olana 12 ata demek.
	System.out.println(arr1[0]);
	
	arr1[4]= 22;
	System.out.println(arr1[4]);
	
	arr1[1]= 10;
	System.out.println(arr1[1]);
	
	arr1[2]= 15;
	System.out.println(arr1[4]);
	
	arr1[3]= 9;
	System.out.println(arr1[1]);
	
	//Array deki elemanlari ekrana yazdirmak icin for dongüsü kullanınız.
	
	for(int i = 0; i <5 ;i++) {
		System.out.print(arr1[i] + " " ); // bunu nicin kullandık. HER DEGERE AYRI BİR ÇIKTI KOMUTU YAZMAMAK İÇİN 
		
		// ARRAY da olmayan indexe bir deger atamasi yapılırsa RUN TİME ERROR alırsınız
		// ARRAY de olmayan indexi kullanmaya calışırsak "ArrayIndexOutOfBoundsException" hatasi alırız.
		
	//arr1[5]= 23;
	//System.out.println(arr1[5]);
		
		
	}
	}

}
