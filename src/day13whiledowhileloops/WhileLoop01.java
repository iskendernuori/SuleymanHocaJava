package day13whiledowhileloops;



public class WhileLoop01 {

	public static void main(String[] args) {
		// while loop kullanarak ilk 5 sayma sayisinin toplamanı ekrana yazdiran 
		// progrrmai yazdiriniz:
		
  int sum = 0;
  int num = 1;
  while(num<6) {
	  sum = sum +num;
	 
	  num++;
  }
  System.out.print(sum );
  // en son toplami degeri görmek için System.out.println(sum) ifadesini loop dişina yazin
  // her adimi görmek istiroorsaniz loop içine yazin.
		
		
		
	}

}
