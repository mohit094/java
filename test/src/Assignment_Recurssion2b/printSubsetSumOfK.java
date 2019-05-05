package Assignment_Recurssion2b;

import java.util.Arrays;

public class printSubsetSumOfK {
	public static void main(String[] args) {
		int [] input = {6,-1,1};
		int [] output = new int[0];
		printSubsetsSumTok(input,6,output);
	}
	public static void printSubsetsSumTok(int input[], int k, int output[]) {
		// Write your code here
		if(input.length == 0 && k == 0 ){
			for(int i=0; i<output.length; i++){
				System.out.print(output[i] + " ");
			}
			System.out.println();
			return;
		}
		if(input.length == 0 && k != 0){
//			System.out.println("I am here");
			return;
		}
//		System.out.println(input.length);
		
		int [] output1 = new int[output.length+1];
		int i;
		for(i = 0; i<output.length; i++){
			output1[i] = output[i];
		}
		output1[i] = input[0];
		
		printSubsetsSumTok(Arrays.copyOfRange(input, 1, input.length),k-input[0],output1);
		printSubsetsSumTok(Arrays.copyOfRange(input, 1, input.length),k,output);
		
	}
}
