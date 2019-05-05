package HashMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class longestCommonSubsequence {
	
	public static void main(String[] args) {
		int[] arr = {2,12,9,16,10,5,3,20,25,11,1,8,8};
		ArrayList<Integer> arr1 = longestSubsequence(arr);
		
		for(int i : arr1){
			System.out.print(i);
		}
	}
	public static ArrayList<Integer> longestSubsequence(int[] arr){
		HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
		
		for(int i : arr){
			m.put(i, 1);
		}
		Arrays.sort(arr);
		int k = 0;
		for(int i : m.keySet()){
			arr[k] = i;
			k++;
		}
		
		for(int i : arr){
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println();
		int maxLength = 1;
		int maxLengthStartIndex = 0;
		int maxLengthEndIndex = 0;
		
		int i = 1;
		
		int count = 1;
		int tempStartIndex = 0;
		int tempLengthEndIndex = 0;
		
		while(i<k){
			if (arr[i] == arr[i-1]+1){
				tempLengthEndIndex = i;
				count++;
			}
			else{
				if(count > maxLength){
					maxLength = count;
					maxLengthStartIndex = tempStartIndex;
					maxLengthEndIndex = tempLengthEndIndex;
				}
					count = 1;
					tempStartIndex = i;
					tempLengthEndIndex = i;
			}
			i++;
		}
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		
		for(int j = maxLengthStartIndex; j <= maxLengthEndIndex; j++){
			arr1.add(arr[j]);
		}
		
		return arr1;
	}
}
