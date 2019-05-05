package Practice_HashMaps;

import java.util.HashMap;

public class MaxFrequencyNumber {
	public static void main(String[] args) {
		int arr[] = {2,4,7,83,4,7,4,7,843,4,7,7};
		int t = maxFrequencyNumber(arr);
		System.out.println(t);
	}
	public static int maxFrequencyNumber(int[] arr){
		// Write your code here
		HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
		for(int i : arr){
			if(m.containsKey(i)){
				int t = m.get(i);
				m.put(i, t+1);
			}
			else{
				m.put(i, 1);
			}
		}
		int finalValue = -1;
		int max = 0;
		for(int i : arr){
			if(max<m.get(i)){
				finalValue = i;
				max = m.get(i);
			}
		}
		
		return finalValue;
	}
}
