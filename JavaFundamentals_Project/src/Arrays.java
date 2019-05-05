

import java.util.Scanner;

public class Arrays {

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = s.nextInt();
		int input[] = new int[n];
		for (int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		return input;
	}

	public static void printArray(int input[]) {
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
	}

	public static int test(int a, int input[]) {
		a = 100;
		input[2] = 100;
		return a;
	}
	
	public static int linearSearch(int input[], int element) {
		for(int i = 0; i < input.length; i++) {
			if(input[i] == element) {
				return i;
			}
		}
		return -1;
	}
	
	public static int largest(int input[]) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < input.length; i++) {
			if(input[i] > max) {
				max = input[i];
			}
		}
		return max;
	}
	
	public static int[] reverse(int input[]) {
		int newInput[] = new int[input.length];
		for(int i = 0, j = input.length - 1; i < input.length; 
				i++, j--) {
			newInput[i] = input[j];
		}
		input = newInput;
		return newInput;
	}
	
	public static void reverse_2(int input[]) {
		for(int i = 0, j = input.length - 1; i < j; 
				i++, j--) {
			int temp = input[i];
			input[i] = input[j];
			input[j] = temp;
		}
	}

	public static void main(String[] args) {
		
		int input[] = takeInput();
		System.out.println(largest(input));
		
		input = reverse(input);
		
		
		/*int input2[] = { 1, 2, 3, 4, 5 };

		printArray(input2);
		int a = 5;

		a = test(a, input2);

		System.out.println("After updation : ");
		System.out.println(a);
		printArray(input2);*/

		/*
		 * System.out.println(input);
		 * 
		 * printArray(input);
		 */

		// int [] a = new int[5];
	}

}
