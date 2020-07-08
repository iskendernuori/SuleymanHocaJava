package day21maltidimensionalarray;

import java.util.Arrays;

public class ArrayiTerstenYazdirmak {

	public static void main(String[] args) {
	int arr[]= {2,11,0,23,7};
	
	Arrays.sort(arr);
	for (int i = arr.length-1; i >=0; i--) {
		System.out.print(arr[i] + " ");
		
	}

	}

}
