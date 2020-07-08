package replit;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysArananKarakter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   int x = sc.nextInt();
		   
		   int arr[] ={1551,1223,1443,1267,1789,1023,2020};
		   Arrays.sort(arr);
		   
		  int sonuc= Arrays.binarySearch(arr, x);
		   if(sonuc>=0) {
			   System.out.println("True");
				  }else {
					   System.out.println("False");
				   }
		   }
		   
		   
		   
		  
//		   for (int i = 0; i < arr.length; i++) {
//			 if(i==2020) {
//				 System.out.println("True");
//			  }else {
//				   System.out.println("False");
//			   }
//		}
		   
		   
		 
			   
		  
		   
		   
		  
		   

	}


