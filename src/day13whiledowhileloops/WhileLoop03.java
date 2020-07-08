package day13whiledowhileloops;

public class WhileLoop03 {

	public static void main(String[] args) {
		// 3 ün carpim tablosunu ekrana yazdirian program yazdiriniz
		// 3*1=3, 3*2=6.... 3*10=30
System.out.println("while Loop ile cozumu");
	
	    int num = 1;
		while(num<11) {
			
			System.out.print("3X"+ num +"=" + (3*num)+ " ");
			num++;
		}
		System.out.println();
	System.out.println("For Loop ile cozumü");
	
		for(int i = 1; i<11; i++) {
			System.out.print("3X"+ i +"=" + (3*i)+ " ");
		}
		
		
	}

}
