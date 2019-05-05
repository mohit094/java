package Practice;

import java.util.HashMap;

public class test {
	public static void pairSum(int[] arr, int num){
		HashMap<Integer,Integer> temp = new HashMap<Integer,Integer>();
		for(int i : arr){
			if(temp.containsKey(i)){
				int value = temp.get(i);
				temp.put(i, value++);
			}
			else{
				temp.put(i,1);
			}
		}
		
		for(int i : arr){
			
		}
	}
}
