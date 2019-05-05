package Assignment_StackQueue;

import java.util.Stack;

public class reverseStack {
	
	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(4);
		s2.add(3);
		s2.remove(0);
		System.out.println("Size of S2 " + s2.size() + " " + s1.size());
		for(int i = 0; i<s1.size(); i++){
			System.out.print(s1.get(i) + " ");
		}
		System.out.println();
		reverseStack(s1,s2);
		
	}
	public static void reverseStack(Stack<Integer> s1, Stack<Integer> s2) {
		for(int i = 1; i<=s1.size(); i++){
			int temp = s1.remove(s1.size()-1);
			while(s1.size() >= i){
				int temp2 = s1.remove(s1.size()-1);
				s2.add(temp2);
			}
			s1.add(temp);
			while(!s2.isEmpty()){
				int temp3 = s2.remove(s2.size()-1);
				s1.add(temp3);
			}
			
			System.out.print("I am here for " + i + " :-");
			for(int j = 0; j<s1.size(); j++){
				System.out.print(s1.get(j) + " ");
			}
		}
	}
}
