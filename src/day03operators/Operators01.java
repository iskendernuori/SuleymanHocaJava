package day03operators;

public class Operators01 {

	public static void main(String[] args) {
		
		int i1 = 12;
		int i2 = 13;
		int i3 = 14;
	    int i4 = 15;
	    
	    System.out.println(i1 + i2*i3); // matematik işlem önceliği önemli
	    System.out.println(i1*i2 + i3*i4);// çarpmalar önce yapılır
	    System.out.println((i1+i2)/i4);// önce parantez içi yapılır
	    System.out.println(i4 * (i2 + i1 / 3));//255 
	    
	    
	}

}
