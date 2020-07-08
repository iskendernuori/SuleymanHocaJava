package day22arraylist;

public class Odev01ForEachLoopProduct {

	public static void main(String[] args) {
		// Bir integer array oluşturunuz ve bu array’deki tum sayıların çarpımını For-each loop kullanarak bulunuz. 
		//Sonucu ekrana yazdırınız.
		
		int arr[] = {3,5,6,9};
		int product = 1;
		for(int w : arr) {
			product = product*w;
		}
		System.out.println(product);
		
	}

}
