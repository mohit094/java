package ProgrammingFundamentals2;

import java.util.Scanner;

public class checkNumberSequence {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = s.nextInt();
		}
		if(n == 1 || n == 2){
			System.out.println(true);
			return;
		}
		boolean flag = false;
		for(int k = 3; k<n; k++){
			if(arr[k-2]>=arr[k-1] && arr[k-1]<=arr[k]){
				
			}
		}
	}
	
}
