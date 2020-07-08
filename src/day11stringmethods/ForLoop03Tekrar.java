package day11stringmethods;

public class ForLoop03Tekrar {

	public static void main(String[] args) {
		// Ilk 4 sayma sayisinin carpımını veren for loop olusturunuz.
		
		int product = 1;
		for(int i = 1; i<5; i+=1) {
			product = product* i;
		}
		System.out.println("Toplam: " + product);
System.out.println();
//ilk 6 cift sayma sayisinin carpımını veren for loop olusturunuz		

	int product1 = 1;
	for(int i = 2; i<13; i+=2) {
		product1 = product1 * i;
	
	}
System.out.println("Toplam: " + product1);
System.out.println();

// 11! sonucunu ekrana yazdirniz

int product2 = 1;
for(int i = 1; i<12; i+=1 ) {
	product2 = product2*i;
	
	
}
System.out.println("11! : " + product2);

























	}
	
	
	
	
	
}
