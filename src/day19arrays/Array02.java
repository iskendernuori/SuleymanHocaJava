package day19arrays;

public class Array02 {

	public static void main(String[] args) {
		// 4 elemanlı Char bir ARRAy olusşturun bu array e elemanlar yerleştirin. tum elemanlari for dongusu kullanarak yazidirin.
		
		char arr[]= new char[4];
		arr[0] = 'A';
		arr[1] = 'L';
		arr[2] = 'A';
		arr[3] = 'Y';
		
		for(int i= 0; i<4; i++) {
			System.out.println(arr[i] + " ");
		}
		
		System.out.println(arr[3]);
		
		// Array in length ini bulmak için "ArrayIsmi.length" yazmak yeterlidir
		// Stringlerde de length methodu kullanılabilir ama stringlerdeki length parantezlidir. 
		// Stringler de==> length()  var Array lerde== length oluyor
		System.out.println(arr.length);
		
		// Array deki son elemanı yazdirmak için length kullanızı
		System.out.println(arr[arr.length-1]);
		
		
		
		
		
		
		
	}

}
