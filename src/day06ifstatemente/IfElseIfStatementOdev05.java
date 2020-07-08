package day06ifstatemente;

import java.util.Scanner;

public class IfElseIfStatementOdev05 {

	public static void main(String[] args) {
		 //Kullanıcıdan notunu alın ve aşağıdaki kurallara göre ekrana A, B, C veya D yazdırın.
		
Scanner scan = new Scanner(System.in);
        
        System.out.println("Bir character girin");
        char harf = scan.next().charAt(0); //Kullanicidan char almak icin next().charAt(0) kullanilir.
        
        if((harf<=122 && harf>=97) || (harf<=90 && harf>=65)) {
            System.out.println("Bu bir harftir");
        }else {
            System.out.println("Bu bir harf degildir");

            scan.close();
        }	
	}

}
