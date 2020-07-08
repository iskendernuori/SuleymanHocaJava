package replit;

import java.util.Scanner;

public class UglyNumber {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int num= sc.nextInt();
	 if(num==1) {
		 System.out.println("ugly number");	
	 }else if(num%7==0) {
		 System.out.println("ugly number  degildir");
	 }else if(num%2==0 || num%3==0|| num%5==0) {
		System.out.println("ugly number");	
		}else{
			System.out.println("ugly number  degildir");	
		}
	 sc.close();
	   }
	
	
	
    
  
}