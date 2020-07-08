package tekrarlarDigerKaynaklar;

public class Indexler {

	public static void main(String[] args) {
		String str1 = "Planning and Requirimen Analysis";
		
		//int  sk = str1.lastIndexOf(" ");
		int  sk = str1.indexOf(" ");
		System.out.println(str1.substring(sk));   // substring burada ilk boşluktan sonrki kısmı yazdirmak için kullandik
		
		
	}

}
