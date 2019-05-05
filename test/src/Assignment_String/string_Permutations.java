package Assignment_String;

import java.util.Arrays;

public class string_Permutations {
	public static void main(String[] args) {
		String str1 = "abbc";
		String str2 = "aabc";
		boolean status = isPermutation(str1,str2);
		System.out.println(status);
	}
	public static boolean isPermutation(String input1, String input2) {
		// Write your code here
		boolean status = false;
		if(input1.length()==input2.length()){
			input1 = sortStringOnChar(input1);
			input2 = sortStringOnChar(input2);
			for(int i=0; i<input1.length(); i++){
				int count1 = 1;
				for(int j = i+1; j<input1.length(); j++){
					if(input1.charAt(i)==input1.charAt(j)){
						count1++;
					}
					else{
						break;
					}
				}
				int index = -1;
				for(int j=0; j<input2.length(); j++){
					if(input1.charAt(i)==input2.charAt(j)){
						int count2 = 1;
						for(int t = j+1; t<input2.length();t++){
							if(input2.charAt(j)==input2.charAt(t)){
								count2++;
							}
							else{
								break;
							}  
						}
						if(count1 == count2){
							index = j;					
						}
						break;
					}
				}
				if(index == -1) break;
				i = i + count1-1;
				if( i==input1.length()-1){
					status = true;
				}
			}
		}
		return status;
	}
	public static String sortStringOnChar(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        return sorted;
	}	
}
