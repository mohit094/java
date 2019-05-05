package Assignment_String;

import java.util.ArrayList;

public class removeDuplicates {
	public static void main(String[] args) {
		removeDuplicate("aaabbbccc");
	}
	public static void removeDuplicate(String input) {
		ArrayList <String> arr = new ArrayList<String>();
		for(int i = 0; i<input.length()-1;i++){
			if(i == 0){
				arr.add(String.valueOf(input.charAt(i)));
				continue;
			}
			if(String.valueOf(input.charAt(i))== arr.get(arr.size()-1)){
				System.out.println("I am here");
				arr.add(String.valueOf(input.charAt(i)));
			}
		}
		input = "";
		for (int k = 0;k < arr.size(); k++){
			input = input + arr.get(k);
		}
		System.out.println(input);
	}
}
