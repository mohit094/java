package Assignment_Array1;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class decimalToBinary {
	public static void main(String[] args) {
		decimalToBinary(12);
	}
	public static void decimalToBinary(int num){
		ArrayList<Integer> a = new ArrayList<>();
		int i = 0;
		for(i = 0; num/2!=0; i++){
			int k = num%2;
			a.add(i, k);
			num=num/2;
		}
		a.add(i, num%2);
		int[] arr = new int[a.size()];
	    for (int k=arr.length-1; k >= 0; k--)
	    {
	        arr[k] = a.get(a.size()-1-k).intValue();
	    }
	    for (int l = 0; l < arr.length; l++) {
			System.out.print(arr[l]);
		}
		
	}
}
