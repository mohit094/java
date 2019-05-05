package Assignment_Recurssion2b;

import java.util.Arrays;

public class returnSubsetSumOfk {
	public static void main(String[] args) {
		int [] input = {6,-1,1};
		int [][] finalMatrix = subsetsSumK(input,6);
		for(int t = 0; t<finalMatrix.length; t++){
        	for(int j = 0; j < finalMatrix[t].length; j++){
        		System.out.print(finalMatrix[t][j] + " ");
        	}
        	System.out.println();
        }
	}
	public static int[][] subsetsSumK(int input[], int k) {
		// Write your code here
        if(input.length == 0 && k == 0){
        	int [][] finalArray = new int [1][0];
        	return finalArray;
        }
        if(input.length == 0 && k != 0){
        	int [][] finalArray = new int [0][0];
        	return finalArray;
        }
       
        int [][] arr1 = subsetsSumK(Arrays.copyOfRange(input, 1, input.length),k-input[0]);
        int [][] arr2 = subsetsSumK(Arrays.copyOfRange(input, 1, input.length),k);
        
        int finalArray[][] = new int[arr1.length + arr2.length][];
        int i;
        for(i = 0; i<arr1.length; i++){
        	finalArray[i] = new int[arr1[i].length + 1];
        	finalArray[i][0] = input[0];
        	for(int j = 0; j < arr1[i].length; j++){
        		finalArray[i][j+1] = arr1[i][j];
        	}
        }
        for(int t = 0; t<arr2.length; t++,i++){
        	finalArray[i] = new int[arr2[t].length];
        	for(int j = 0; j < arr2[t].length; j++){
        		finalArray[i][j] = arr2[t][j];
        	}
        }
        
        return finalArray;
	}
}
