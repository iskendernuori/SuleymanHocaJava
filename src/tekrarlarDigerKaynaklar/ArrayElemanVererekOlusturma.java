package tekrarlarDigerKaynaklar;

import java.util.Scanner;

public class ArrayElemanVererekOlusturma {

	public static void main(String[] args) {
		//						0		 1			2          3		4		   	5	     6
		Scanner scan= new Scanner(System.in);
		int gun;
		
		System.out.println("Bir gun giriniz :");
		gun =scan.nextInt();
		
		String [] gunler = {"Pazartesi","Salı", "Carsamba","Persembe","Cuma","Cumartesi", "Pazar"};
		
		if(gun>=0 && gun<7) {
			System.out.println(gunler[gun-1]);// neden -1 dedik. cunku index 0 dan başlıyor
		}else {
			System.out.println("Girdiğiniz gun doğru degil");
		}
		
		
		
//		System.out.println(gunler[3]);
//		
//		gunler[3]= "Nisan ";   // 3. indexi degiştirdik
//		System.out.println(gunler[3]);

		
		//for(int i=0; i<7;i++) {
		//	
		//	System.out.println(gunler[i]);
		//}
		
		
		scan.close();
		
	}

}
