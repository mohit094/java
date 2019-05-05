package Assignment_Recurssion2b;

import java.util.Arrays;

public class returnSubsets {
	public static void main(String[] args) {
		int [] input = {1,2,3};
		int [][] finalMatrix = subsets(input);
		System.out.println("Value at 2,1 :- " + finalMatrix[1][0]);
	}
	public static int[][] subsets(int input[]) {
		// Write your code here
		if(input.length == 1){
			int[][] finalArray = new int[1][1];
			finalArray[0][0] = input[0];
			return finalArray;
		}
		int[][] matrix = subsets(Arrays.copyOfRange(input, 1, input.length));
		int[][] newMatrix = new int[(matrix.length)*2 + 1][];
		int i = 0;
		for(i = 0; i<matrix.length; i++){
			newMatrix[i] = matrix[i];
		}
		newMatrix[i] = new int[1];
		newMatrix[i][0] = input[0];
		i++;
		for(int j = 0;i<newMatrix.length;i++,j++){
			newMatrix[i] = new int[matrix[j].length+1];
			int r = 0;
			newMatrix[i][0] = input[0];
			for(r = 0;r<matrix[j].length;r++){
				newMatrix[i][r+1] = matrix[j][r];
			}
			
		}
	
		return newMatrix;

	}
}
