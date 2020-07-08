package day21maltidimensionalarray;

public class ArrayicindeVarOlanElemanınSayisi {

	public static void main(String[] args) {
		// array içindeki 3 elemından kaçtane var bulun
		
		int arr[]= {3,1,3,4,4,5};
		
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==3) {
				count++;
			}
		}
		System.out.println(count);

	}

}
