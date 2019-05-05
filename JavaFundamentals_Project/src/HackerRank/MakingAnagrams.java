package HackerRank;

import java.util.HashMap;

public class MakingAnagrams {
	public static int numberNeeded(String first, String second) {
	     HashMap<Character,Integer> temp = new HashMap<Character,Integer>();
	     for(int i = 0; i<first.length(); i++){
	    	 char value = first.charAt(i);
	    	 if(temp.containsKey(value)){
	    		 int temp1 = temp.get(value);
	    		 temp.put(value, temp1+1);
	    	 }
	    	 else{
	    		 temp.put(value,1);
	    	 }
	     }
	     
	     for(int i = 0; i<second.length(); i++){
	    	 char value = second.charAt(i);
	    	 if(temp.containsKey(value)){
	    		 int temp1 = temp.get(value);
	    		 temp.put(value, temp1-1);    		 
	    	 }
	    	 else{
	    		 temp.put(value,-1); 
	    	 }
	     }
	     
	     int count = 0;
	     
	     for(Character i : temp.keySet()){
	    	if(temp.get(i)>0){
	    		count = count + temp.get(i);
	    	}
	    	else{
	    		count = count - temp.get(i);
	    	}
	     }
	     
	     return count;
    }
	
	public static void main(String[] args) {
		String first = "fcrxzwscanmligyxyvym";
		String second = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
		
		System.out.println(numberNeeded(first,second));
	}
}
