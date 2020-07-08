package day11stringmethods;

public class ForLoop03 {

	public static void main(String[] args) {
		
// Ilk 4 sayma sayisinin carpımını veren for loop olusturunuz.
		
		int product = 1;
		for(int i= 1 ; i<5; i++) {
			product = product*i;
		}
		System.out.println("Toplam: " + product);
		
		// ilk 6 cift sayma sayisinin carpımını veren for loop olusturunuz		

				int product1 = 1;
				for(int i= 2; i<13; i+=2) {
					product1 = product1*i;
				}
			System.out.println("Toplam: " + product1);
		// matematik te 1 er 1er geri sayim yapıp çarpmaya faktoryel denir.
		// 6! sorusu. İNTERVİEW SORUSU
			
	   // 9! i hesaplayan program yazalim.
			
			int product3 = 1;
			for(int i= 9 ;i>0 ; i--){
				product3 = product3 *i;
			}
			System.out.println("9!: " + product3);
			
			
					
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
	
	
	
	
}
