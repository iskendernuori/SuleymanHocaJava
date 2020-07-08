package day20arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
	// Bir int array in elemanlarini kucuten buyuge dogru diziniz.
		
		int arr[] = {2,11,0,23,7};
		
		System.out.println("Sıralamadan Once" + Arrays.toString(arr));

		//Arrays.sort() methoduna parametre olarak araay in ismi yazılırsa, 
		// O array in elemanlari kucukten buyuge (Ascending order, natural order) sıralanmış oluyur
		
		Arrays.sort(arr);// bir kere yapıldıktan sonra artık duzenli yazacak.
		System.out.println("Sıralamadan Sonra " +Arrays.toString(arr));//[0, 2, 7, 11, 23]
		
		
		//Soru : char lardan olusan bir array olusturunuz ve ascending order yapınız.
		
		
		char arr1[] = {'A','B','C','Z','F','Y','a'};
		System.out.println("Sıralamadan Once :" +Arrays.toString(arr1));
		Arrays.sort(arr1);
		
		System.out.println("Sıralamdan Sonra :" +Arrays.toString(arr1));
		
		// Soru: Strinlerlerden oluslan bir array olusturn
		
		String arr2[] = {"Ali", "Veli", "Ramazan", "Bayram"};
		System.out.println("Sıralamadan Once :" +Arrays.toString(arr2));
		
		Arrays.sort(arr2);
		System.out.println("Sıralamdan Sonra :" +Arrays.toString(arr2));
		
		// Soru: boolean bir array olusturun ascending order yapın.
		
		//boolean arrBll[] = {true, false, true};
		//System.out.println("Sıralamadan Once :" +Arrays.toString(arrBll));
		//
		//Arrays.sort   ARRAYS DE BOOLEAN LAR İÇİN SORT KULLANILMAZ... 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		

	}

}
