package day06ifstatemente;

public class IfStatement04 {

	public static void main(String[] args) {
		
		//bir tane String variable olusturun  ve gün ismini küçük harflerle değer atayın.
		// Eger olusturduğunuz değer hafta ici günlerinin biri ise 
		//"Hafta içi " yazdırın
		// hafta içi günlerinden biri işse 
		// "hafta sonu" yazdırin
		
		// Eger atadığınız 
		
	  String gun = "persembe";
	  
	  if(gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") || gun.equals("persembe") || gun.equals("cuma")) {
		  
		  
		  System.out.println("Hafta içi");
	
	  }
			  
	if(gun.contentEquals("cumartesi") || gun.equals("pazar")) {
		System.out.println("Hafta Sonu");
		
		
	}

	}

}
