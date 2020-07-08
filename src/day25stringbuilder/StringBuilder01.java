package day25stringbuilder;

public class StringBuilder01 {

	public static void main(String[] args) {
		
		
		// StringBuilder class i String uretmeeye ve uretilen Stringler leri
		// manipule etmeye yarar.
		
		
		// Strign class i kullanrak String uretirseniz yaptığınız değişiklikler 
		// ilk urettiğimiz String i etkilemz ama illa ki ilk urettiğim String degissin 
		// isterseniz atama yapmak zorundasiniz===> str= str.substring(1);
		// Strign class i kullanrak String ler atamasız degiştirilemediği için 
		// String class ına "immutable" denir.
		// Soru: String klas immutable mıdr değil midir?
		// İmmutable dır. yapılan degişiklikler atama olmadan ilk uretttiğimiz stringe yansımaz.
		
		
		
		
		String str= "Ali";
		str.substring(1); // ==> value su "li" olan object oluşturulur str hala "Ali" dir.
						  // str hala "Ali" dir.
		str=str.substring(1);  // bu işlem le str ye yeni string tanımladık. artık return edersek "li" alırız. Atama yapmazsak Ali almaya devam ederiz
		
		System.out.println(str);
		
		// StringBuilder Class ını kullanrak String uretirseniz yaptığınız değişiklikler ilk urettiğiniz String i etkiler.
		// Atama yapmaya gerek yoktur.
		
		
		
		// StringBuilder  Class i degisimi yansıttığı içn ona "mutable" denir.
		
//1. Yol		
		StringBuilder strBld = new StringBuilder("Ali");		
		
		strBld.append("Can"); // append() methodu String e yeni bir String eklemek 
							  // için kullanılır. Concatenation yapar.
		
		System.out.println(strBld);
		
		
		// Hangi Durumda Kullanılır.
		
		
//2. yol
		
		StringBuilder strBld2= new StringBuilder(); // bos bir string uretir ==> ""
		strBld2.append("Ali Can"); // Boş String e "Ali Can" ekledim.
		
// 3. yol
		
		StringBuilder strBld3= new StringBuilder(5); // uzunluğu 5 karakter olan bir strring urettim. 5 boşluk var şuan
		
		strBld3.append("Ali"); // burada 3 indexini doldurduk. geri kalan 2 index boş kalbilir
		
		strBld3.append("Kahraman"); // kalan 2 indexe ka yazar geri kalan kaarakterleri girmek için stringi uzatır. 5 indx uztr
		
		
		// Oluşturduğunuz strigin uzunluğunu belirledikten sonra, az veya çok eleman ekleyebilirsiniz.
		// StringBuilder problem çıkarmaz.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
