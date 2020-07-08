package replit;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
//		Bir palindrom, madam veya racecar veya 10801 sayısı gibi ileriye doğru geriye doğru okuyan bir kelime, 
		
//	    sayı, kelime öbeği veya diğer karakter dizisidir. 
//		Girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu yazın.
//
//		Test Data:
//		madam
//
//		Beklenen Çıktı:
//		True
//
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Stringi gir:");
//		 String word = scan.nextLine();
//	    word = word.toLowerCase().replace(" ", "");
//		
//	    String pnd="";
//	  
//	    
//	    for(int i=word.length()-1; i>=0; i--) {
//	    	char ch=word.charAt(i); 
//	    	String word2= Character.toString(ch);
//	    		pnd = pnd+ch;
//	    	}
//	    
//	    boolean check = word.equals(pnd);
//	    System.out.println(check);
//	    		
	    	}
	public static boolean isAnagram(String word1, String word2) {
		   if(word1==null || word2==null)
		        return false;
		 
		    if(word1.length()!=word2.length())
		        return false;
		 
		    int[] arr = new int[26];
		    for(int i=0; i<word1.length(); i++){
		        arr[word1.charAt(i)-'a']++;
		        arr[word2.charAt(i)-'a']--;
		    }
		 
		    for(int i: arr){
		        if(i!=0)
		            return false;
		    }
		 
		    return true;
		}

		    
		  
		}	    		
	    	
	    
	    
		
		
	
		
		
	

