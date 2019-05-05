package Assignment_Recurssion2b;

public class ReturnPermutationOfString {
	public static void main(String[] args) {
		String[] arr1 = permutationOfString("abc");
		for(int j = 0; j<arr1.length; j++){
			System.out.println(arr1[j]);
		}
		
	}
	public static String[] permutationOfString(String input){
		// Write your code here
		if(input.length() == 1){
			String[] arr = {input};
			return arr;
		}
		
		String[] finalArray = new String [factorial(input.length())];
		int m = 0;
		for(int i = 0; i < input.length(); i++){
			String[] arr1 =  permutationOfString(input.substring(0, i) + input.substring(i+1));
			for(int j = 0; j<arr1.length; j++){
				finalArray[m] = input.charAt(i) + arr1[j];
				m++;
			}
		}
		
		return finalArray;
	}
	
	public static int factorial(int n){
		if(n == 1 || n==0){
			return n;
		}
		int fact = n*factorial(n-1);
		return fact;
	}
}
