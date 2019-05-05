package L21;

import java.util.HashMap;

public class printIntersectionOf2Arrays {
	public static void main(String[] args) {
		int[] input1 = {1,1,5,3,2,2,4,6};
		int[] input2 = {1,2,3,4,6,1,1,1,5,5,6,7};
		intersection(input1,input2);
	}
	public static void intersection(int input1[], int input2[]){
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		
		for(int i : input1){
			if(m.containsKey(i)){
				int x = m.get(i);
				m.put(i, x+1);
				continue;
			}
			m.put(i, 1);
		}
		
		for(int i : input2){
			if(m.containsKey(i)){
				if(m.get(i)>0){
					System.out.print(i + " ");
					int x = m.get(i);
					m.put(i, x-1);
				}
			}
		}
	}
}
