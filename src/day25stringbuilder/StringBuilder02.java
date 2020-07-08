package day25stringbuilder;

public class StringBuilder02 {

	public static void main(String[] args) {
		
		//substring() methdou atamaa yapmadan String i degiştirmez
		
		
		StringBuilder str1 = new StringBuilder("animals");
		
		System.out.println(str1.substring(3));
		
		// str1= str1.substring(3); hata verir. Cunkü substring()  methodu String Clsaa indan gelir.
		// ve bir String tipleri uyusmasdığından dolayi atamayi kabul etmez.
		// Java data tipleri uyusmadiğndan doalyi atamayi kabul etmez.
		
		
		// bu hatadan kurtulmak için 2 yol var .
//1. yol
		
		String str2 = str1.substring(3);
		System.out.println(str2);
		
		
//2. yol
		// sr1.substring(3); ifadesi direkt System.out.println() içine yazin.
		
		System.out.println(str1.substring(3));// mumkün mertebe parantez içini sade kullanmak gerekiyor. bu yol cok tercih edilmz
		

		
		
		str1.subSequence(1, 4);// bunun çıktısı "nim" olur. substring(1,4) ilki 1 dahil, ikincisi dahil degil. yani 4. index dahil degil
		
//indexOF(); 
		
		System.out.println(str1.indexOf("m"));// m nin indexini verdi
		
//length(); String class ından gelir ve parantezli kullanılır. string uzunluğunu veriri
		
		System.out.println(str1.length());
		
// charAt() ;
		System.out.println(str1.charAt(5)); // indexi 5 olan karakteri yazar.
		

		
// insert(); methodu	istenen index e istenen character i  eklemeye yarar. 
// insert(); methodu append() gibi direkt değiştirir.
		
		
		str1.insert(0, "X"); 
		System.out.println(str1);
		
// delete ()	 istenen index teki caracterleri siler
		
		System.out.println(str1.delete(0, 1));
		System.out.println(str1);
//deleteCharAt();  istenen indexteki characteri siler.
		
		str1.deleteCharAt(6);
		System.out.println(str1);
		
		
		
// reverse() methodu String i tersten yazdirir.
		
		str1.reverse();
		System.out.println(str1); // lamina
		
// toString() methodu StringBuilder i String e cevirmek için kullnılır
		
		str1.toString();
		System.out.println(str1); // str1 artık StringBuilder degil String dir.
		
		// StringBuilder Java 5. verisiyonunda olusturuldu.StringBuffer lar
		// StringBuilder in eski versiyonudur. StringBuilder lar daha hızlı çalışır. 
		// Bu yuzden StringBuilder kullanmayi tercih edin.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
