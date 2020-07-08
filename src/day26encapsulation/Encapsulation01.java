package day26encapsulation;

public class Encapsulation01 {
	
	private String kimlikNo= "42307148878";
	
	private int krediKartNo= 12345678;
	
	private boolean soguk = true;
	

	public static void main(String[] args) {
		
		//Encapsulation data saklama (data-hiding)  yontemidir.
		// Encapsulation iki stepte yapıliır:
		
		
		//   !) Data yi (variable, method) private yapmalısınız.
		//	 2) public olan getter() ve setter() methodlar uretmeliyim.
		
		// getter() data yi okumamıza yarar, getter() methodu data da degisiklik yapamaz.
		// setter() datayi degistirmemize yarar.
		
//		Encapsulation: Dışarından ya da yanlış kullanım sonucu kodu ve veriyi koruyan bir mekanizmadır. 
//		Bir diğer şekliyle iş metot tarafından yapılır fakat metotun içeriği gösterilmez.
		
		
		
		
		
	}
	// getter() uretmek için :
	//   1) Access modifier public olamalı 
	//	 2) Return type variable in return type i ile aynı olmalı.
	//   3) Method ismi "get + variable ismi" şeklinde olmalıdır.
	
	
	public String getKimlikNo() {   // getter method oluşturuyorsanız MUHAKKAK PUBLİC OLMALI. 
		return kimlikNo;
		
		
	}
	
	public  int getKrediKartNo() {
		return krediKartNo;
	}

	
	// return type boolean ise method ismi "is" ile başlar. "get" kullanılmaz.
	public boolean issoguk() {
		return soguk;
		
	}
	
	//setter() uretmek için :
	//	1) Accesss modifier public olmalı
	//	2) Return type void olmali
	//	3) Method ismi " set+ variable ismi" seklinde olmalı
	//	4) Parametre kullanılmalıdır (%99)
	//	5) setter() methodlarin ismi boolean lar için  de "set" ile başlar
	
	
	
	public void setKimlikNo(String kimlikNo) {
		this.kimlikNo = kimlikNo;
		
	}
	
	public void setKrediKartNO(int krediKartNO) {
		this.krediKartNo= krediKartNo;
	}
	
	public void setSoguk(boolean soguk) {
		this.soguk=soguk;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
