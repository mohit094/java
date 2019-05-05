package ProgrammingFundamentals2;

import java.util.Scanner;

public class checkNumberSequene {
	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++){
			arr[i] = s.nextInt();
		}
		
		if(n <=2){
			System.out.println(true);
		}
		else{
			int flag = 0;
			for(int i = 2;i<n;i++){
				if(arr[i-1]>arr[i-2] && arr[i-1]>arr[i]){
					flag++;
				}
				if(arr[i-1]<arr[i-2] && arr[i-1]<arr[i]){
					flag++;
				}
			}
			
			if(flag>1){
				System.out.println(false);
			}
			else{
				System.out.println(true);
			}
			
		}
	}
}
