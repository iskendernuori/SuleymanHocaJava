package day13whiledowhileloops;

public class WhileLoop02Tekrar {

	public static void main(String[] args) {
		// ilk 5 sayma sayisinin çarpımını ekrna yazdiran programi yazdiriniz.

	int product = 1;
	int  num = 5;
	
	while(num>0) {
		product = num*product;
		num--;
	}
		System.out.print("Product =" + product);
		
		System.out.println();
		
		
		
		
	}

}
