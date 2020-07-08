package replit;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Array7TerstenYazdirmStringBuilder {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4};
		
		
	System.out.println(Arrays.toString(reverse(arr)));	
	

	}
	public static int[] reverse(int[] arr) {
		int arr1[] = new int[arr.length];
		for (int i =arr.length; i >=0 ; i--) {
		arr1[arr.length-1] = arr[i];
		}
		
		
			return arr;
		}
	
	
	

}
//Scanner input = new Scanner(System.in);
//String sentence = input.nextLine();
//
//String arr[] =sentence.split(" ");
//
//List<String> list1 = Arrays.asList(arr);
//
//


//for (int i = arr.length-1; i >=0; i--) {
//	
//}
//

//String reversed = 


//System.out.println(reversed);