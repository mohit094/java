package Assignment_Recurssion2b;

public class printPermutationsOfString {
	public static void main(String[] args) {
		permutations("abc");
	}
	public static void permutations(String input){
		// Write your code here
		permutations(input,"");
	}
	public static void permutations(String input, String output){
		// Write your code here
		if(input.length() == 1){
			output = output + input;
			System.out.println(output);
			return;
		}
		
		for(int i = 0; i < input.length(); i++){
			permutations(input.substring(0, i) + input.substring(i+1),output + input.charAt(i));
		}
	}
}
