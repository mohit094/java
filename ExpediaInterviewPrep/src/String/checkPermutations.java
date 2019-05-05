package String;

import java.util.HashMap;

public class checkPermutations {
	public static boolean isPermutation(String input1, String input2) {
		HashMap<Character,Integer> m = new HashMap<Character,Integer>();
		if(input1.length() != input2.length()){
			return false;
		}
		for(int i = 0; i<input1.length(); i++){
			if(m.containsKey(input1.charAt(i))){
				int y = m.get(input1.charAt(i));
				m.put(input1.charAt(i), y+1);
			}
			else{
				m.put(input1.charAt(i), 1);
			}
		}
		
		for(int i = 0; i<input2.length(); i++){
			if(m.containsKey(input2.charAt(i))){
				int y = m.get(input2.charAt(i));
				m.put(input2.charAt(i), y-1);
			}
			else{
				return false;
			}
		}
		
		for(Character i : m.keySet()){
			if(m.get(i)!=0){
				return false;
			}
		}
		
		return true;
		
	}
}
