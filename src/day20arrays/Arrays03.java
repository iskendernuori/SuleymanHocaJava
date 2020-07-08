package day20arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
	
		// iki array olusturup bu array lerin birbirien eşit olup olmadığını kontrol ediniz ,
		
		// NOT : İKİ ARRAY İN EŞİT OLABİLMESİ 
		//			1) ELEMANLARI AYNI OLMALI
		//			2) EŞİT ELEMANLARIN INDEX LERİDE EŞİT OLMALI
		// {1,2,3} ve {1,2,3} eşittir  ama {1,2,3} ile {1,3,2} eşit degildir
		
		
		int arr1[]= {1,2,3};
		int arr2[]= {1,2,3};
		
		System.out.println(arr1== arr2); // false verdi. cunku REFERANS lar farklı.  arr1!= arr2 .... == adresleri de kontrol eder.
									     // eder. Iki array farkli iki object oldugundan adresleri farklidir.
		
		System.out.println(Arrays.equals(arr1, arr2)); // true veriri cunku 
													   // Arrays.equals() methodu sadece degerleri ve index leri kontrol eder. adrese bakmaz.
		
		
	}

}
