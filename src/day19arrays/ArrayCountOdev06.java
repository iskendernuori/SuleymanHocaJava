package day19arrays;

public class ArrayCountOdev06 {

	public static void main(String[] args) {
//		Bir array’de herhangi iki elemanın aynı olup olmadığını kontrol  eden bir program yazınız.
//		Aynı eleman varsa “Aynı eleman var” yoksa  “Aynı eleman yok” yazdırınız.
		
		
//int arr[] = {10,15,10,12,10,33,45};
//		
//		int count = 0;// flag bayrak denir
//		
//		for(int i = 0; i<arr.length; i++) {
//			
//			if(arr[i]==10) {
//				count++;
//			
//			}
//			
//		}
//		if (count>0 ) {
//			System.out.println(count + "tane " + " " + "10 var");
//		}else {
//			System.out.println("10 yok");
//		}
//		
int arr6[]= {11,12,13,14,15,11,18};
		
		int count=0;
		
		for(int i=0;i<arr6.length;i++) {
			for (int a=0; a<arr6.length-1; a++){
				if(i<a || i>a ? arr6[i]==arr6[a]:false) {
					count++;
			}
		}
		}if(count>0) {
			System.out.println("Aynı eleman var");
		}else {
			System.out.println("Aynı eleman yok");
 }

		
	}

}
