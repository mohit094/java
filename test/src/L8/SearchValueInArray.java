package L8;

import java.util.Scanner;

public class SearchValueInArray {
	public static void main (String[] args){
		Scanner s = new Scanner(System.in);
		int x[] = {1,2,3,4,3,5,6};
		int n = 3;
		
/*		boolean finalAnswer = searchValue(x,0,n);
		System.out.println(finalAnswer);*/
/*		int finalAnswer2 = searchValue2FirstIndex(x,0,n);
		System.out.println(finalAnswer2);*/
		int finalAnswer3 = searchValue2LastIndex(x,0,n);
		System.out.println(finalAnswer3);
	}
	
	public static boolean searchValue(int arr[],int startIndex,int n){
		boolean finalAnswer = false;
		if(startIndex == arr.length){
			return finalAnswer;
		}
		if(arr[startIndex]==n){
			finalAnswer = true;
			return finalAnswer;
		}
		boolean recursiveCall = searchValue(arr,startIndex+1,n );
		if(recursiveCall == true){
			finalAnswer = recursiveCall;
		}
		return finalAnswer;
		
	}
	
	public static int searchValue2FirstIndex(int arr[],int startIndex,int n){
		if(startIndex == arr.length){
			return 0;
		}
		if(arr[startIndex] == n){
			return startIndex;
		}
		
		int position = searchValue2FirstIndex(arr,startIndex+1,n);
		return position;
	}
	public static int searchValue2LastIndex(int arr[],int startIndex,int n){
		if(startIndex == arr.length){
			return 0;
		}
		
		int position = searchValue2LastIndex(arr,startIndex+1,n);
		
		if(position == 0 && arr[startIndex] == n){
			position = startIndex;
		}
		return position;
	}
}
