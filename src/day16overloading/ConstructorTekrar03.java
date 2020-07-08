package day16overloading;

public class ConstructorTekrar03 {

	String isim = "Ali Can";
	int yas = 33;
	int kilo = 85;
	String meslek = "Automation Tester";
	
	boolean emekli = false;
	
	ConstructorTekrar03(){
		this.isim=isim;
		this.yas = yas;
		this.kilo=kilo;
		this.emekli=emekli;
		
		
	}
	ConstructorTekrar03(String isim, int yas, boolean emekli){
		this.isim=isim; // kullanıldığı için isim kahverengi gozukur. 
		this.yas = yas;
		//this.kilo=kilo;   kullanılmdığndan silinebilir. onemli değil
		this.emekli=emekli;
		
		
	}	
	ConstructorTekrar03(String isim){
		this.isim=isim;
		this.yas = yas;
		this.kilo=kilo;
		this.emekli=emekli;
	}

	public static void main(String[] args) {
		
	
		ConstructorTekrar03 insan01 = new ConstructorTekrar03();
		System.out.println(insan01.isim);
		
		ConstructorTekrar03 insan02 = new ConstructorTekrar03("Ayhan Yildiz", 56,true);
		System.out.println(insan02.isim);
		System.out.println(insan02.emekli);
		System.out.println(insan02.meslek);
		ConstructorTekrar03 insan03 = new ConstructorTekrar03("Ayşe Yildiz");
		System.out.println(insan03.isim);
		System.out.println(insan03.kilo);
		
	}

}
