package Practice_array;

import java.util.HashMap;

public class consecutiveElements {
	public static boolean containsConsecutiveNumbers(int[] input){
		// Write your code here	
		HashMap<Integer,Boolean> temp = new HashMap<Integer,Boolean>();
		int smallest = Integer.MAX_VALUE;
		int sum = 0;
		for(int i : input){
			if(i<smallest){
				smallest = i;
			}
			if(temp.containsKey(i) && temp.get(i)==true){
				return false;
			}
			else{
				temp.put(i, true);
			}
			sum += i;
		}
		if(smallest<0){
			return false;
		}
		int n = input.length;
		int expectedSum = (smallest*n) + ((n-1)*(2 + (n-1-1)))/2;//sum of AP
		if(expectedSum == sum){
			return true;
		}
		else{
			return false;
		}
	}
}
