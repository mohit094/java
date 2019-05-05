package arrays2D;

public class resetMatrix {
	public static void makeRowsCols0(int [][]input) {
		// Write your code here
		for(int i = 0; i<input.length; i++){
			for(int j = 0; j<input[0].length; j++){
				if(input[i][j] == 0){
					input[i][j] = -1;
				}
			}
		}
		
		for(int i = 0; i<input.length; i++){
			for(int j = 0; j<input[0].length; j++){
				if(input[i][j] == -1){
					input[i][j] = 0;
					for(int m = 0; m<input.length;m++){
						input[m][j] = 0;
					}
					
					for(int k = 0; k<input[0].length;k++){
						input[i][k] = 0;
					}
					
				}
			}
		}
	}
}
