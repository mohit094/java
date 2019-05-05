package Assignment_String;

import java.util.ArrayList;
import java.util.HashMap;

public class compressAString {
	
	public static String compress(String inputString) {
		// Write your code here
		String finalValue = "";
		/*int temp = 1;
		for(int i = 1; i<inputString.length(); i++){
			if(inputString.charAt(i) == inputString.charAt(i-1)){
				temp++;
			}
			else{
				if(temp>1){
					finalValue = finalValue + inputString.charAt(0) + temp;
				}
				else{
					finalValue = finalValue + inputString.charAt(0);
				}
				inputString = inputString.substring(i);
				i = 0;
				temp = 1;
			}
			
		}
		
		if(temp>1){
				finalValue = finalValue + inputString.charAt(0) + temp;
			}
			else{
				finalValue = finalValue + inputString.charAt(0);
		}*/
		
		ArrayList<Character> m = new ArrayList<Character>();
		ArrayList<Integer> n = new ArrayList<Integer>();
		m.add(inputString.charAt(0));
		n.add(1);
		for(int i = 1; i<inputString.length(); i++){
			if(inputString.charAt(i)==m.get(m.size()-1)){
				int temp = n.get(n.size()-1);
				n.set(n.size()-1, temp+1);
			}
			else{
				m.add(inputString.charAt(i));
				n.add(1);
			}
		}
		
		for(int i = 0; i < m.size(); i++){
			if(n.get(i) == 1){
				finalValue = finalValue + m.get(i);
			}
			else{
				finalValue = finalValue + m.get(i) + n.get(i);
			}
		}
		return finalValue;
		
	}
	public static String compress_NotCorrect(String inputString) {
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
		
		String finalValue = "";
		
		for(int i = 0; i<inputString.length(); i++){
			int temp = m.get(inputString.charAt(i));
			finalValue = finalValue + inputString.charAt(i) + temp;
			i = i + temp - 1;
		}
		
		return finalValue;
	}
}
