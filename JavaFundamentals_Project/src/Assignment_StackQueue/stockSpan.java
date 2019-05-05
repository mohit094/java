package Assignment_StackQueue;

import java.util.Stack;

public class stockSpan {
	public static int[] stockSpan(int[] price) {
		// Write your code here
		int[] arr = new int[price.length];
		
		for(int i = 0; i<price.length; i++){
			Stack<Integer> s = new Stack<Integer>();
			for(int j = i-1; j>=0; j--){
				if(price[j]<price[i]){
					s.add(price[j]);
				}
				else{
					break;
				}
			}
			arr[i] = s.size()+1;
		}
		
		return arr;
	}
}
