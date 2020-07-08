package uygulamalartekrar;

import java.util.Scanner;

public class VizeFinalOrtalama {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double vize;
		double finall;
		double ortalama;
		
		System.out.print("Vize Notunuzu Giriniz : ");
		vize = scan.nextDouble();
		System.out.println("Final Notunuzu Giriniz :");
		finall= scan.nextDouble();
		
		ortalama = vize*0.4 + finall*0.6;
		System.out.println("Ortalamanız : " + ortalama);
		
		if(ortalama >=90 && ortalama<=100) {
			System.out.println("Harf Notunuz : AA");
			
		}
		else if(ortalama>=80 && ortalama<90) {
		System.out.println("Harf Notunuz : BB");
    	}
		else if(ortalama >=70 && ortalama <80) {
    		System.out.println("Harf Notunuz : CC ");
    	}
		else if(ortalama>=50 && ortalama <70) {
			System.out.println("Harf Notunuz : DD");
		}
		else if(ortalama<50)
			System.out.println("KALDİNİZ");
		else if(ortalama<0 || ortalama>100) {
    		
			System.out.println("Lutfen Dogru Deger Giriniz :");	
	    	
		}
    	
		scan.close();
    	}
		
		
    	}	
