package HackerRank;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ransomNote {
	static Map<String, Integer> magazineMap = new HashMap<String, Integer>();
    static Map<String, Integer> noteMap = new HashMap<String, Integer>() ;
    
    public static void Solution(String magazine, String note) {
    	
        String[] s1 = magazine.split(" ");
        String[] s2 = note.split(" ");
        for(String i : s1){
        	if(magazineMap.containsKey(i)){
        		int value = magazineMap.get(i);
        		magazineMap.put(i, value+1);
        	}
        	else{
        		magazineMap.put(i,1);
        	}
        }
        
        for(String i : s2){
        	if(null != noteMap && noteMap.containsKey(i)){
        		int value = noteMap.get(i);
        		noteMap.put(i, value+1);
        	}
        	else{
        		noteMap.put(i,1);
        	}
        }
    }
    
    public static boolean solve() {
        for(String temp : noteMap.keySet()){
        	if(magazineMap.containsKey(temp)){
        		int magazineMapCount = magazineMap.get(temp);
        		int noteMapCount = noteMap.get(temp);
        		if(noteMapCount>magazineMapCount){
        			return false;
        		}
        	}
        	else{
        		return false;
        	}
        }
        
        return true;
    }
    
    public static void main(String[] args) {
		String s1 = "o l x imjaw bee khmla v o v o imjaw l khmla imjaw x";
		String s2 = "imjaw l khmla x imjaw o l l o khmla v bee o o imjaw imjaw o";
		
		Solution(s1,s2);
		System.out.println(solve());
	}
}
