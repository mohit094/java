package STL_Section;

import java.util.ArrayList;
import java.util.HashSet;

public class longestSubsequence {
	public static ArrayList<Integer> longestSubsequence(int[] arr){
		HashSet<Integer> temp = new HashSet<Integer>();
		for(int i : arr){
			temp.add(i);
		}
		ArrayList<Integer> output = new ArrayList<Integer>();
		int length = output.size();
		
		for(int i : arr){
			int count = 1;
			int k = i++;
			while(temp.contains(k)){
				count++;
				k++;
			}
			if(count>length){
				output.clear();
				for(int t = 1;t<=k;t++){
					output.add(i);
					i++;
				}
			}
			length = output.size();
		}
		
		return output;
		
	}
}
