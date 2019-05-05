import java.util.Scanner;

public class array_2D {
	
	public static int [][] takeInput(){
		System.out.println("enter no. of rows");
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		System.out.println("enter no. of column");
		int c = s.nextInt();
		int input[][]= new int[r][c];
		for(int i = 0; i<r; i++){
			for(int j = 0; j < c; j++){
				System.out.println("enter values for " + i + " row " );
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}
	public static void main(String[] args) {
		int array_2D[][] = takeInput();
		printArrayPattern(array_2D);
		
		
	}
	public static void printArrayPattern(int a[][]) {
		int r = a.length;
		int c = a[0].length;
		
		
		for(int i=0; i<c; i++){
			for(int j=0; j<r; j++){
				if(i%2==0){
					System.out.print(a[j][i] + " ");
				}
				else{
					System.out.print(a[r-1-j][i] + " ");
				}
			}
		}
	}
	public static void printArrayPatter(int a[][]) {
		int r = a.length;
		int c = a[0].length;
		
		
		for(int i=0; i<c; i++){
			for(int j=0; j<r; j++){
				if(i%2==0){
					System.out.print(a[j][i] + " ");
				}
				else{
					System.out.print(a[r-1-j][i] + " ");
				}
			}
		}
	}
	
}
