package Assignment_String;

import java.util.ArrayList;

public class removeDuplicates {
	public static void main(String[] args) {
		removeDuplicate("aaabbbccc");
	}
	public static void removeDuplicate(String input) {
		/*ArrayList <String> arr = new ArrayList<String>();
		for(int i = 0; i<input.length();i++){
			if(i == 0){
				arr.add(String.valueOf(input.charAt(i)));
				continue;
			}
			String t = String.valueOf(input.charAt(i));
			String u = arr.get(arr.size()-1);
			if(u != t){
				System.out.println("I am here: - " + arr.get(arr.size()-1));
				arr.add(String.valueOf(input.charAt(i)));
			}
		}*/
//		input = "";
		/*for (int k = 0;k < arr.size(); k++){
			input = input + arr.get(k);
		}*/
		String s = input + " ";
		int l=s.length(); // Finding the length of the word
        String ans=""; // Variable to store the final result
        char ch1,ch2;
 
        for(int i=0; i<l-1; i++)
        {
            ch1=s.charAt(i); // Extracting the first character
            ch2=s.charAt(i+1); // Extracting the next character
 
        	// Adding the first extracted character to the result if the current and the next characters are different
 
            if(ch1!=ch2)
            {
            ans = ans + ch1;
            }
        }
		System.out.println(ans);
	}
}
