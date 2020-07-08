package day12scopewhileloop;

public class WhileLoop01 {

	public static void main(String[] args) {
    	// while ===> iken demektir.
		// While I go to school ==> Ben okula giderken. While başa gelirse, turkce de sonuna iken konulur.
		// While I go to Uskudar, it rained.

		
		int num = 0;
		
		// num 4 ten kucuk iken
		while (num<4) {
			System.out.println("Ali");
			num++; // bu satiri unutursaniz while loop sonsuz donguye girer. UNUTMA SAKİN HEE.
		}
		// While loop kullanarak 1 den 10 kadar dahil. tam sayilari ekrana yazdiriniz
		
		
		int num2=1;
		while (num2<=10) {
			System.out.print(num2 + " ");
			num2++;
		}
		System.out.println();
		// while loop kullanarak 1 den 20 ye kadar cift tam sayilari ekrana yazdiriniz
		
		int  num3 = 1;
		while (num3<21){
			if(num3%2 ==0) {
				System.out.print(num3 + " ");	
			}
			num3++; // eger bu kısmı if icine koyarsak sadece cift sayilari arttirir. ama while dongusunde bütün sayilari arttirmasini istiroor.
		}
		System.out.println();
		
		// while loop kullanarak 5 den buyuk 120 ye kadar 3 ile bolunebilen tamsayilari yazdiriniz:
		
		int num4 =5;
		while(num4<121) {
			if(num4 % 3==0 ) {
				System.out.print(num4 + " ");
			}
			num4++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
