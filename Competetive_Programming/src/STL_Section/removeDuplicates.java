package STL_Section;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class removeDuplicates {
	public static int[] removeDuplicate(int arr[]){
		HashMap<Integer,Integer> temp = new HashMap<Integer,Integer>();
		for(int i : arr){
			temp.put(i,1);
		}
		int[] output = new int[temp.size()];
		int n = 0;
		for(int i : arr){
			if(temp.containsKey(i)){
				output[n] = i;
				temp.remove(i);
				n++;
			}
		}
		return output;
	}
}
