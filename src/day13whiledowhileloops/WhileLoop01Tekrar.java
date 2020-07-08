package day13whiledowhileloops;

public class WhileLoop01Tekrar {

	public static void main(String[] args) {
		// while loop kullanarak ilk 5 sayma sayisinin toplamanı ekrana yazdiran 
				// progrrmai yazdiriniz:
		
		int sum  = 0;
		int num = 1;
		while(num<6) {
			sum = num + sum;
			num++;
		}
		System.out.println("Toplam =" + sum);

	}

}
