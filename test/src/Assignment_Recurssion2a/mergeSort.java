package Assignment_Recurssion2a;

import java.util.Arrays;

public class mergeSort {
	public static void main(String[] args) {
		int arr[] = {};
		mergeSort(arr);
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
	public static void mergeSort2(int[] input){
		return;
	}
	public static void mergeSort(int[] input){
		// Write your code here
		if(input.length <=1){
			return ;
		}
		int mid = (input.length -1)/2;
		int [] arr1 = Arrays.copyOfRange(input, 0, mid +1);
		int [] arr2 = Arrays.copyOfRange(input, mid + 1, input.length);
		System.out.println("Before Arr1: " + arr1[0]);
//		System.out.println("Before Arr1: " + arr1[1]);
		System.out.println("Before Arr2: " + arr2[0]);
		mergeSort(arr1);
		mergeSort(arr2);
		System.out.println("After Arr1: " + arr1[0]);
		System.out.println("After Arr2: " + arr2[0]);
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length){
			
			if(arr1[i]<=arr2[j]){
				input[k] = arr1[i];
				i++;
			}
			else{
				input[k] = arr2[j];
				j++;
			}
			k++;
		}
		if(i<arr1.length){
			while(i<arr1.length){
				input[k] = arr1[i];
				i++;
				k++;
			}
		}
		else{
			while(j<arr2.length){
				input[k] = arr2[j];
				j++;
				k++;
			}
		}
		
	}
}
