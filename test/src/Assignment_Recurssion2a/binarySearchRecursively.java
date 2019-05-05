package Assignment_Recurssion2a;

import java.util.Arrays;

public class binarySearchRecursively {
	public static void main(String[] args) {
		int [] input = {};
		int a = binarySearch(input,5);
		System.out.println(a);
	}
	public static int binarySearch(int[] input, int element) {
		int value;
		if(input.length <= 0){
			return -1;
		}
		if(input.length == 1 ){
			if(input[0] == element){
				return 0;
			}
			else{
				return -1;
			}
		}
		
		int mid = (0 + input.length -1)/2;
		System.out.println("there" + mid);
		
		if(input[mid] == element){
			return mid;
		}
		if(input[mid]>element){
			input = Arrays.copyOfRange(input, 0, mid);
			System.out.println("here" + input.length);
			value = binarySearch(input,element);
		}
		else{
			input = Arrays.copyOfRange(input, mid + 1, input.length);
			System.out.println("I am here");
			value = binarySearch(input,element);
			if(value != -1){
				value = mid + value + 1;
			}
		}		
		return value;
	}
}
