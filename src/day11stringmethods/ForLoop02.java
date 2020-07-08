package day11stringmethods;

public class ForLoop02 {

	public static void main(String[] args) {
		// 100 den kucuk 3 ün kati olan sayma sayilarini ekrana yan yana yazdiran for loop olusturnz
		
		
		for(int i = 3; i<100; i+=3) {
			System.out.print(i + " ");
			
		}
		
		// ilk 5 sayma sayisinin toplamini veren programi for loop ile yazini
		//1, 2, 3, 4, 5
		// int sum=0 0+1=1 ==> 1+2=3 ==> 3+3=6 ==> 6+4=10
		
System.out.println();

		int sum=0;
		for(int i=1; i<6; i++) {
			sum = sum +i; 	
					
		}
System.out.println("Toplam: "+ sum);// for loop un disina koymazsak her asamayi yazdirir.

System.out.println();
		// 10 dan buyuk ilk 3 sayma sayisinin toplamini ekrana yazdirmaya calisin.

		int  sum1 = 0;
		for(int i =11 ; i<14 ; i++) {
			sum1= sum1+i;
			
		}
System.out.println("Toplam: "+ sum1);
System.out.println();

// 20 den buyuk ilk 5 sayma sayisinin top

int sum2 = 0;
for(int i = 20; i<26 ;i++) {
	sum2= sum2 + i;
	
}
System.out.println("Toplam: " + sum2);

// 9 dan buyuk ilk 4 sayma sayinin toplamini ekrana yazdirin

System.out.println();

int sum3 = 0;
for(int i=9 ; i<14 ; i++) {
	sum3 = sum3 +i;
}
System.out.println("Toplam: " + sum3);

System.out.println();

//100 den kucuk 4 ün kati olan sayma sayilarini ekrana yan yana yazdiran for loop olusturnz

int sum4 = 0;
for(int i=4; i<100; i+=4) {
	sum4= sum4 +i;
}
System.out.println("Toplam: " + sum4);

// 20 den buyuk ilk 5 sayma sayisinin toplamini veren for loop ile yapınız


int  sum5 = 0;
for(int i=21; i<26; i++) {
	sum5= sum5 +i;
}
System.out.println("Toplam: " + sum5);
System.out.println();

//ilk 50 sayma sayisinin toplamini veren for loop olusturunuz

int  sum6 = 0;
for(int i= 1; i<51; i++) {
	sum6 = sum6 + i;
	
}
System.out.println("Toplam: " + sum6 );// 1275
System.out.println();

// 5 ile bolunebilen 100 den kucuk sayma sayilarinin toplamini veren for loop ile olusturunuz;

int sum7 = 0;
for(int i =5; i<100 ; i+=5) {
	sum7 = sum7 + i;
}
System.out.println("Toplam: " + sum7);//950 
System.out.println();























	}

}
