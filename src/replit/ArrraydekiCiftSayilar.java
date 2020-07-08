package replit;

public class ArrraydekiCiftSayilar {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		int ciftCount=0;
		int tekCount=0;
		for (int i = 1; i <= arr.length; i++) {
			if(i%2==0) {
				ciftCount++;
			}else if(i%2!=0) {
				tekCount++;
				
			}
		}
		System.out.println("Tek Sayilar: "+ tekCount);
		System.out.println("Cift Sayilar: " + ciftCount);
	}

}
