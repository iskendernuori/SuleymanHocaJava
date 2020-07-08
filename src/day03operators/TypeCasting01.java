package day03operators;

public class TypeCasting01 {

	public static void main(String[] args) {
		//Auto  Widenning Casting
		
		byte by1 = 101;
		int sayi1 = by1;
		
	    System.out.println(sayi1);
		
	    // kücük data tipini büyük data tpine çevirmek için 
	    // ekstra bir kod yazmaya gerek yok.Jva bunu otomatik yapar
	    // Auto Widening
	    
	    int sayi2 = 53;
	    byte by2 = (byte)sayi2; // büyük data tipini küçük data tipine değişiklik
	      						// java yapmaz biz yapmalıyz. dönüşüm olacak data tipini () içinde yazmalıyz
	    
	    System.out.println(by2);
		
	    double sayi3 = 23.5;
	    int by3 = (int)sayi3;
	    
	    System.out.println(by3);
	    
	     						// kullancıı ondalıklı sayi girebilir. bunun önüne geçemek için int kullnadık. tam sayi vermek için
	    						// virgüllü kısımdan kurtulmak için
	    
	    float sayi4 = -23.9f;
	    short by4 = (short)sayi4;
	    
	    System.out.println(by4);  //-23
	    
	   double sayi5 = 4.8;
	   double sayi6 = 1.4;
	   double sonuc1 = sayi5 / sayi6;
	   
	   System.out.println(sonuc1);//3.428571428571429
	   
	   int sonuc2 = (int) (sayi5 / sayi6);
	   System.out.println(sonuc2);//3
	   
	   int sayi7  = 5;
	   int sayi8  = 3;
	   
	   int sonuc3 = sayi7 / sayi8;
	   System.out.println(sonuc3);//1 sonuc int istendiğinden 1 çıkar
	   							  // sadece tam kısmı görürüz
	   
	   
	   
	   int sayi9 = 255;
	   byte by5  = (byte) sayi9;
	   System.out.println(by5);//-1  çıkar. sebebi 256 sayı olduğundan farkını yazar java. 
	   
	   
	   double sayi10 = 100.235; 
	   int sonuc4 = (int) sayi10; // -1  
	   
	   int sayi11 = 5;
	   double sayi12 = 6.2;
	   
	   System.out.println(sayi11 + sayi12 );
	   
	   
	   
	  
	   
	   
	
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	}

}
