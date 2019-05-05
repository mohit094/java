package Assignment_Hashmap;

import java.util.HashMap;

public class maximumFrequencyNumber {
	public static int maxFrequencyNumber(int[] arr){
		// Write your code here
		HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
		for(int i : arr){
			if(m.containsKey(i)){
				int y = m.get(i);
				m.put(i, y+1);
			}
			else{
				m.put(i, 1);
			}
		}
		int n = 0;
		int max = Integer.MIN_VALUE;
		for(int i : m.keySet()){
			if(m.get(i)>max){
				n = i;
				max = m.get(i);
			}
		}
		
		return n;
	}
}
