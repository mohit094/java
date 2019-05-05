package L8;
import java.util.Scanner;
import java.lang.Math;

public class SumOfArrayElementsRecursively {
	public static void main (String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		
		int answer = sumOfArray2(arr,0);
		System.out.println(answer);
		
		
	}
	
	public static int sumOfArray(int input[]){
		//base case
		if(input.length == 1){
			return input[0];
		}
		
		//Recursive Call
		int smallInput[] = new int[input.length-1];
		for(int i = 1;i<input.length;i++){
			smallInput[i-1]= input[i];
		}
		
		int smallAns = sumOfArray(smallInput);
		//small Calculation
		return smallAns + input[0];
	}
	
	public static int sumOfArray2(int input[], int startIndex){
		if(input.length == 0){
			return 0;
		}
		if(startIndex ==input.length -1){
			return input[startIndex];
		}
		int answer = sumOfArray2(input, startIndex+1);
		
		return answer + input[startIndex];
	}
	
	
}
