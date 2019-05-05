package L21;

import java.util.HashMap;

public class pairOfElementsInArray_hashMaps {
	public static void main(String[] args) {
		int[] input1 = {3,3,3,-3,-3};
		intersection(input1,6);
	}
	public static void intersection(int input1[], int k){
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		for(int i : input1){
			int x = k - i;
			if(m.containsKey(x)){
				for(int t = 1; t<=m.get(x); t++)
				System.out.println(i + " " + x);
			}
			if(m.containsKey(i)){
				int y = m.get(i);
				m.put(i, y+1);
				continue;
			}
			m.put(i, 1);
		}
	}
}
