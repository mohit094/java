package L21;

import java.util.ArrayList;
import java.util.HashMap;

public class HashmapUse {
	
	public static ArrayList<Integer> removeDuplicates(int input[]) {
		HashMap<Integer, Boolean> m = new HashMap<Integer, Boolean>();
		
		
		// Create hashmap
		for(int i : input) {
			m.put(i, true);
		}
		
		ArrayList<Integer> output = new ArrayList<Integer>();
		for(int i : input) {
			if(m.containsKey(i)) {
				output.add(i);
				m.remove(i);
			}
		}
		
		return output;
	}

	

	public static void main(String[] args) {

		int input[] = {1, 2, 3, 4};
		for(int i : input) {
			System.out.println(i);
		}


		/*HashMap<String, Integer> m = new HashMap<String, Integer>();
		m.put("abc", 10);
		m.put("xyz", 5);
		m.put("abc", 15);

		int x = m.get("abc");
		m.put("abc", x+1);


		HashMap<Integer, Integer> n = new HashMap<Integer, Integer>();
		n.put(m.get("abc"), 80);*/

		//		m.put("abc", n.get(key))


		//		HashMap<Integer, ArrayList<Integer>> 



		/*System.out.println(m.get("abc"));
		System.out.println(m.size());
		System.out.println(m.isEmpty());
		System.out.println(m.containsKey("xyz"));*/









	}
}
