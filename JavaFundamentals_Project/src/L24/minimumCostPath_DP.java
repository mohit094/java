package L24;

import java.util.Scanner;

public class minimumCostPath_DP {
	public static void main(String[] args) {
		int input[][] = new int[3][3];
		System.out.println("Enter Matrix : ");
		Scanner s = new Scanner(System.in);
		for(int i = 0; i<input.length; i++){
			for(int j = 0; j<input[0].length; j++){
				input[i][j] = s.nextInt();
			}
		}
		
		System.out.println(minimumCostPath(input,0,0));
		minimumCostPath_Iterative(input);
	}
	
	public static int minimumCostPath(int[][] input,int i, int j){
		if(i >= input.length || j >= input[i].length){
			return Integer.MAX_VALUE;
		}
		
		if(i == input.length-1 && j == input[i].length-1) {
			return input[i][j];
		}
		
		int x = minimumCostPath(input,i+1,j+1);
		
		int y = minimumCostPath(input, i+1, j);
		
		int z = minimumCostPath(input, i, j+1);
		
		int ans = Math.min(x, Math.min(y, z)) + input[i][j];
		
		return ans;
	}
	
	public static void minimumCostPath_Iterative(int[][] input){
		int[][]tempArray = new int[input.length][input[0].length];
		
		for(int i = 0; i<input.length; i++){
			for(int j = 0; j<input[0].length; j++){
				tempArray[i][j] = -1;
			}
		}
		tempArray[0][0] = input[0][0];
		
		for(int j = 1; j<input[0].length; j++){
			tempArray[0][j] = input[0][j-1] + input[0][j]; 
		}
		
		for(int i = 1; i<input.length; i++){
			tempArray[i][0] = input[i-1][0] + input[i][0];
		}
		
		for(int i = 1; i<input.length; i++){
			for(int j = 1; j<input[0].length; j++){
				int x = tempArray[i-1][j-1];
				int y = tempArray[i][j-1];
				int z = tempArray[i-1][j];
				
				int ans = Math.min(x, Math.min(y, z)) + input[i][j];
				
				tempArray[i][j] = ans;
			}
		}
		
		System.out.println(tempArray[input.length-1][input[0].length-1]);
	}
}
