package Assignment_String;

import java.util.HashMap;
//using hashmaps
public class highestOccurringCharacter {
	public static char highestOccuringCharacter(String inputString) {
		// Write your code here
		HashMap<Character,Integer> m = new HashMap<Character,Integer>();
		for(int i = 0; i<inputString.length(); i++){
			if(m.containsKey(inputString.charAt(i))){
				int j = m.get(inputString.charAt(i));
				m.put(inputString.charAt(i), j+1);
			}
			else{
				m.put(inputString.charAt(i), 1);
			}
		}
		
		char value = inputString.charAt(0);
		int max = m.get(value);
		
		for(int i = 1; i<inputString.length(); i++){
			int temp = m.get(inputString.charAt(i));
			if(temp>max){
				max = temp;
				value = inputString.charAt(i);
			}
		}
		
		return value;
	}
}
