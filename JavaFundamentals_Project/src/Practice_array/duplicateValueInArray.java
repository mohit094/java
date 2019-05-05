package Practice_array;

public class duplicateValueInArray {
	public static int duplicate(int[] arr){
		int sum = 0;
		for(int i : arr){
			sum+=i;
		}
		int n = arr.length;
		int t = n-1;
		int expectedSum = (t*(t+1))/2;
		int duplicate = n - expectedSum + sum - 1;
		
		return duplicate;
	}
}
