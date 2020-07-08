package day11stringmethods;

public class ForLoop02Tekrar {

	public static void main(String[] args) {
		// ilk 100 sayma sayinin 6 ya bölünebilenrinin toplami kaçtır.


		int sum = 0;
		for(int i = 6; i<100; i+=6 ) {
			sum = sum + i;
		}
		System.out.println("Toplam: " + sum);
System.out.println();
// ilk 50 cift sayilarin toplami
		int sum1 = 0;
		for(int i = 2; i<100; i+=2) {
			sum1 = sum1 + i;		
		}
		System.out.println("Toplam: " + sum1);
System.out.println();


// 100 den kücük 3 ve 3 ün kati sayilarinin toplamıni yazdiriniz

int sum2 = 0;
for(int i = 3; i<100; i+=3) {
	sum2 = sum2 + i;
}
		System.out.println("Toplam: "+ sum2);
		
	
	}

}
