package arrays2D;

public class printSpiral {
	public static void spiralPrint(int matrix[][]){
		// Write your code here
		int row = matrix.length;
		int column = matrix[0].length;
		int numInArray = row*column;
		int numTraverse = 0;
		int rowCount = 0;
		int columnCount = 0;
		while(numTraverse<numInArray){
			for(int j = columnCount; j<column && numTraverse<numInArray; j++){
				System.out.print(matrix[rowCount][j] + " ");
				numTraverse++;
			}
			rowCount++;
			for(int i = rowCount; i<row && numTraverse<numInArray; i++){
				System.out.print(matrix[i][column-1] + " ");
				numTraverse++;
			}
			column--;
			for(int j = column-1; j>=columnCount && numTraverse<numInArray;j--){
				System.out.print(matrix[row-1][j] + " ");
				numTraverse++;
			}
			row--;
			for(int i = row-1; i>=rowCount && numTraverse<numInArray;i--){
				System.out.print(matrix[i][columnCount] + " ");
				numTraverse++;
			}
			columnCount++;
		}
		
	}
}
