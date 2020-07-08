package replit;

import java.util.Scanner;

public class SesliSessizHarf {

	
	
	
	
	
	public static void main(String[] args) {
//		Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu, değilse sessiz harf olduğunu ekrana yazdırsın.
// Girdiği değer harf değilse yada 1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
//		Sesli harfler: a,e,i,o,u
		
//		Scanner in = new Scanner(System.in);
//
//	      
//        String input = in.next().toLowerCase();
//
//        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
//        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
//        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i")
//                || input.equals("o") || input.equals("u");
//
//        if (input.length() > 1)
//        {
//            System.out.println("Yanlış karakter girdiniz!");
//        }
//        else if (!(uppercase || lowercase))
//        {
//            System.out.println("Yanlış karakter girdiniz!");
//        }
//        else if (vowels)
//        {
//            System.out.println(input +" harfi sesli harfdir.");
//        }
//        else
//        {
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("bir harf girin :");
		
		
		String harf = in.nextLine();
		if(harf.length()>1) {
			System.out.println("Yanlıs karakter girdiniz!");
		}else {
		
		char  x = in.nextLine().toLowerCase().charAt(0);
		
				//in.next().toLowerCase().charAt(0);
	
				

		
		
		if(x>='a' && x<='z') {
			if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u')
			System.out.println(x + " harfi sesli harftir.");
	       }else 
	    	   if(!(x=='a' || x=='e' || x=='i' || x=='o' || x=='u')){
	    	   
	        	
	        	System.out.println(x + " harfi sessiz harftir.");	
	               	
	        	
	        }
		
       
		}
		
	
		}
		}
	

	

