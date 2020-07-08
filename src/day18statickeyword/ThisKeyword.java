package day18statickeyword;

public class ThisKeyword {

	int x = 12;
	static int y= 13;
	
	ThisKeyword(int x){
		// this kullandığım zaman, icinde bulundugum class taki 
		// instance veya static variable lara ulaşmak istiyorum demektir
		
		this();		// this() içinde bulunduğunuz class daki parametresiz constructor u çagırmak için kullanilir.
					// this() kullanılacaksa mutlaka ilk satıra yazılmalıdir. Aksi taktirde Compaile Time Error verir.
					// Consturctor lar arasinda seyahat etmeye yarar. 
					//This instance variable lar arasina gecmye yarar.
		this.x = x;   // this ten hemn sonrki x instance dir. eşitliğin diger tarafındaki x parametre olan deger dir.
					  //  eger constructor içindeki x e bir deger verirsek artık instance daki x in degeri yeni deger olur.
					  // dikkat edrsek renkler farkli. this ten onceki x instance x i temsil ediyor. bir constructor da x yeni deger 
					  //verdiğimizden atam yaptığımızdan yani. son deger instance x in degerini de değistirdi
		System.out.println("Parametreli Constructor ");
		}
	
	ThisKeyword() {
		System.out.println("Parametresiz Constructor");
	
	}
	ThisKeyword(String str){
			System.out.println("String Parametreli Constructor"); // this("Ali) yazarsak o zaman bu nu yazdırı. boş olursa diğerini
	}
		
	public static void main(String[] args) {
	ThisKeyword obj1 = new ThisKeyword(15);
	System.out.println(obj1.x);

	}

}
