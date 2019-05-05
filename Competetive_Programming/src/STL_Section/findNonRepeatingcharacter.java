package STL_Section;

import java.util.HashMap;
import java.util.HashSet;

public class findNonRepeatingcharacter {
	public static void main(String[] args) {
		char a = firstNonRepeatingChar("gdhIgHada");
		System.out.println(a);
	}
	public static char firstNonRepeatingChar(String str){
		HashMap<Character,Integer> temp = new HashMap<Character,Integer>();
		for(int i = 0;i<str.length();i++){
			if(temp.containsKey(str.charAt(i))){
				int a = temp.get((Character)str.charAt(i));
				temp.put((Character)str.charAt(i), a+1);
			}
			else{
				temp.put((Character)str.charAt(i), 1);
			}
		}
		
		for(int i = 0;i<str.length();i++){
			if(temp.containsKey(str.charAt(i)) && temp.get((Character)str.charAt(i)).equals(1)){
				return str.charAt(i);
			}	
		}
		
		return str.charAt(0);
	}
}
