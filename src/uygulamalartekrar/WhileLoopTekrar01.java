package uygulamalartekrar;

public class WhileLoopTekrar01 {

	public static void main(String[] args) {
		
		
		// 1 den 10 a kadar olan sayıları tek tek Whileloop ile yazdırın.
		
		
		int num1= 1;
		
		while(num1<=10) {
			System.out.print(num1 + " ");
			num1++;
		}
		System.out.println();
		// 1 den 100 e kadar olan 5 in katlarını yazdınızız.
		int num2=5;
		
		while(num2<100) {
		System.out.print(num2 + "|");
		num2+=5;
		
		}
		System.out.println();
		
		// 7 den buyuk ve 100 e kadar 7 ye bolunebilen sayıları yazdıralım.
		
		
		int num3= 14;
		
		while(num3<100) {
			if(num3%7==0) {
				System.out.println("7 nin katlari :" + num3);
				
			}
			num3+=7;
			
		}

	}

}
