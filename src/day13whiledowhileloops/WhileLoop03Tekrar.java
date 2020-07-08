package day13whiledowhileloops;

public class WhileLoop03Tekrar {

	public static void main(String[] args) {
		// 3 ün carpim tablosunu ekrana yazdirian program yazdiriniz
				// 3*1=3, 3*2=6.... 3*10=30
		
		System.out.println("For Loop ile Carpım Tablosu");
	
		int num = 1; 
		
		for(int i=1;i<11; i++) {
			System.out.println("3X" + i + "= "+ (i*num));
			
		System.out.println();	
		}
		System.out.println("While Loop İle Carpım Tablosu");
		
		while(num<11) {
			System.out.println("3X" + num + "= "+ (3*num));
			num++;
		}
		
		

	}

}
