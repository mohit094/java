package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class lexicograph {
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        ArrayList<String> n = new ArrayList<String>();
        
        for(int i = 0; i<=s.length()-k; i++){
        	n.add(s.substring(i, i+k));
        }
        
        for(String i : n){
        	if(largest == "" && smallest == ""){
        		largest = i;
                smallest = i;
                continue;
        	}
        	else if(i.compareTo(largest)>0){
        		largest = i;
        	}
        	else if(i.compareTo(smallest)<0){
        		smallest = i;
        	}
        }
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
