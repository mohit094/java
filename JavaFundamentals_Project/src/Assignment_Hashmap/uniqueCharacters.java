package Assignment_Hashmap;

import java.util.HashMap;

public class uniqueCharacters {
	
	public static void main(String[] args) {
		String str = uniqueChar("abdabc");
		System.out.println(str);
	}
	public static String uniqueChar(String str){
		// Write your code here
		HashMap<String,Boolean> m = new HashMap<String,Boolean>(); 
		String result = "";
		while(str.length() != 0){
			if(!m.containsKey(str.substring(0, 1))){
				m.put(str.substring(0, 1), true);
				result = result + str.substring(0, 1);
			}
			str = str.substring(1);
		}
		
		
		/*for(String i : m.keySet()){
			if(m.get(i) == true)
			result = result + i;
			System.out.println(result);
		}*/
		
		return result;
	}
}
