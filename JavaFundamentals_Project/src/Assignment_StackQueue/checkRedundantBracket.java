package Assignment_StackQueue;

import java.util.Stack;

public class checkRedundantBracket {
	public static void main(String[] args) {
		System.out.println(checkRedundantBrackets("((a+b))"));
	}
	public static boolean checkRedundantBrackets(String input) {
		// Write your code here
		Stack<Character> s1 = new Stack<Character>();
		char[] opening = {'(','{','['};
		char[] closing = {')','}',']'};
		boolean redundant = false;
		for(int i = 0;i<input.length(); i++){
			boolean bracket = false;
			for(char j : closing){
				if(j == input.charAt(i)){
					bracket = true;
				}
			}
			if(bracket == true){
				for(char j : opening){
					if(j == s1.get(s1.size()-1)){
						redundant = true;
						break;
					}
				}
				if(redundant == true){
					break;
				}
				else{
					while(!s1.isEmpty()){
						char temp = s1.remove(s1.size()-1);
						boolean flag = false;
						for(char j : opening){
							if(j == temp){
								flag = true;
								break;
							}
						}
						if(flag){
							break;
						}
					}
				}
			}
			else{
				s1.add(input.charAt(i));
			}
			
		}
		return redundant;
	}
}
