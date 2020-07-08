package replit;

import java.util.Scanner;

public class StringBuilderTerstenYazdirma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    String reversed = "";
	   StringBuilder strBld = new StringBuilder(sentence);
	    
	    strBld.reverse();
	   
	   reversed = strBld.toString();
	    
	    
	   
	   
	   
	    //Kodlarınızı burada sonlandırınız ve verilen yardımcı kodları değiştirmeyiniz.
	    System.out.println(reversed);
	}

}
