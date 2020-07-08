package replit;

import java.util.Scanner;

public class KucukSayiyiYazdirma {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 
		 double n1 = sc.nextDouble();
		 double n2 = sc.nextDouble();
		 double n3 = sc.nextDouble();
		 sayi(n1,n2,n3);
		 

		
		
	}
	public static void sayi(double n1, double n2, double n3) {
				if(n1<n2 && n1<n3) {
			System.out.println(n1);
		}else if(n2<n1 && n2<n3) {
			System.out.println(n2);
		}else {
			System.out.println(n3);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
