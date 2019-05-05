package arrays2D;

public class printLikeAWave {
	public static void wavePrint(int input[][]){
		int switchValue = 0;
		// Write your code here
		for(int j = 0; j<input[0].length; j++){
			if(switchValue%2==0){
				for(int i = 0;i<input.length;i++){
					System.out.print(input[i][j] + " ");
				}
			}
			else{
				for(int i = input.length-1;i>=0;i--){
					System.out.print(input[i][j] + " ");
				}
			}
			switchValue++;
		}
	}
}
