package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Bir Charecter Giriniz");
		
		char ch = scan.next().charAt(0);
		
		String result = ((ch<=122 && ch>=97) || (ch>=65 && ch<=90)) ? ((ch<=122 && ch>=97) ? "Kucuk Harf" : "Buyuk Harf"): "Harf Degil";
		System.out.println(result);
		

		scan.close();
	}

}
