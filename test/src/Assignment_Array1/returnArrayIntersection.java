package Assignment_Array1;

import java.util.ArrayList;

public class returnArrayIntersection {
	public static void main(String[] args){
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {3,4,5,6};
		intersection(arr1,arr2);
		
	}
	public static int[] intersection(int[] arr1, int[] arr2){
		ArrayList<Integer>  a = new ArrayList<Integer>(); 
		for (int m = 0; m < arr1.length; m++) {
			for (int l = 0; l < arr2.length; l++) {
				if (arr1[m] == arr2[l]) {
					arr2[l] = Integer.MIN_VALUE;
					a.add(arr1[m]);
					break;
				}
			}
		}
		int [] finalArray = new int[a.size()];
		for(int i = 0; i < finalArray.length; i++){
			finalArray[i] = (int)a.get(i);
		}
		for(int i = 0; i < finalArray.length; i++){
			System.out.println(finalArray[i]);
		}
		return finalArray;
		
	}
}
