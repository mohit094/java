package Assignment_Hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class longestConsecutiveSubsequence {
	public static ArrayList<Integer> longestSubsequence(int[] arr){
		// Write your code here
		HashMap<Integer,Integer> m =  new HashMap<Integer,Integer>();
		int n = 0;
		int longestSubsequence = 0;
		for(int i : arr){
			int before = 0;
			int after = 0;
			if(m.containsKey(i)){
				continue;
			}
			if(m.containsKey(i-1)){
				before = m.get(i-1);
			}
			m.put(i,before + 1);
			if(m.containsKey(i+1)){
				int value = i + 1;
				int count = before + 2;
				while(m.containsKey(value)){
					m.put(value, count);
					value++;
					count++;
				}
				/*if(m.get(value-1)>longestSubsequence){
					n = value - 1;
					longestSubsequence = m.get(value-1);
				}
				else if(m.get(value-1) == longestSubsequence && n > value -1){
					n = value - 1;
					longestSubsequence = m.get(value-1);
				}*/
			}
			/*else{
				if(m.get(i)>longestSubsequence){
					n = i;
					longestSubsequence = m.get(i);
				}
				else if(m.get(i) == longestSubsequence && n > i ){
					n = i;
					longestSubsequence = m.get(i);
				}
			}*/
		}
		
		for(int i : m.keySet()){
			int x = m.get(i);
			if(x>longestSubsequence){
				longestSubsequence = x;
				n = i;
			}
		}
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		
		int sequencefirstValue = n - longestSubsequence + 1;
		
		for(int i = 1; i<=longestSubsequence; i++){
			arr1.add(sequencefirstValue);
			sequencefirstValue++;
		}
		
		return arr1;
	}
}
