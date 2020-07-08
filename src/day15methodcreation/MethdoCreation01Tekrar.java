package day15methodcreation;

public class MethdoCreation01Tekrar {

	public static void main(String[] args) {
	toplama();
	cikarma(3,5);
	carpma(3,5);
	bolme();
	
		
		
	}
    public static void toplama() {
    	System.out.println(5+4);
    }
    
    public static int cikarma(int num1, int num2) {
    	return num1-num2;
    }
    public static int carpma (int num1, int num2) {
    	return num1*num2;
    }public static void bolme() {
    	System.out.println(5/4);
    }
}
