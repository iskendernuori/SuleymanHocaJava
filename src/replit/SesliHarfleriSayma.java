package replit;

import java.util.Scanner;

public class SesliHarfleriSayma {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
	    String str = sc.nextLine();
	    
	    
	   
	    
	  int count= 0;  
	
	   charakter (str,count);
	   
	   sc.close();
	  }
	 
	
	
	public static void charakter(String str, int count){
		
		for(int i=0; i<str.length() ; i++) {
			 char c= str.charAt(i);
			if(c=='a' || c=='e' || c== 'u'|| c=='o'|| c=='i' || c=='ı') {
			
			count++;
			
			}
		}
			
		System.out.println(count);
		
	}

}
