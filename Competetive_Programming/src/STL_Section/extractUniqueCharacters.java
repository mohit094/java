package STL_Section;

import java.util.HashSet;

public class extractUniqueCharacters {
	public static String uniqueChar(String str){
		HashSet<Character> temp = new HashSet<Character>();
		
		for(int i = 0; i<str.length(); i++){
			temp.add(str.charAt(i));
		}
		
		String output = "";
		
		for(int i = 0; i<str.length(); i++){
			if(temp.contains(str.charAt(i))){
				output = output + str.charAt(i);
				temp.remove(str.charAt(i));
			}
		}
		return output; 
	}
}
