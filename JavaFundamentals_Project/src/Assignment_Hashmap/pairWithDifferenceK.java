package Assignment_Hashmap;

import java.util.HashMap;

public class pairWithDifferenceK {
	public static void main(String[] args) {
		
	}
	public static void findPairsDifferenceK(int[] input, int k){
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		for(int i : input){
			int x = i + k;
			int z = i - k;
			if(m.containsKey(x) && x !=z){
				for(int t = 1; t<=m.get(x); t++)
				System.out.println(Math.min(x, i) + " " + Math.max(x, i));
			}
			if(m.containsKey(z)){
				for(int t = 1; t<=m.get(z); t++)
				System.out.println(Math.min(z, i) + " " + Math.max(z, i));
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
