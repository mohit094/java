import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StacksAndQueue {
	
	public static void main(String[] args) {
		String exp = "{ a + [ b+ (c + d)] + (e + f) }}";
		System.out.println(checkBalanced(exp));
	}
	public static boolean checkBalanced(String exp) {
		// Write your code here
		Stack<String> n = new Stack<String>();
		
		HashMap<String,Integer> m = new HashMap<String,Integer>();
		m.put("{", 1);
		m.put("(", 1);
		m.put("[", 1);
		
		HashMap<String,String> g = new HashMap<String,String>();
		g.put("}", "{");
		g.put(")", "(");
		g.put("]", "[");
		
		for(int i= 0; i<exp.length(); i++){
			if(m.containsKey(Character.toString(exp.charAt(i)))){
				n.push(Character.toString(exp.charAt(i)));
			}
			if(g.containsKey(Character.toString(exp.charAt(i))) && !n.isEmpty()){
				String temp1 = g.get(Character.toString(exp.charAt(i)));
				String temp2 = n.pop();
				if(!temp1.equals(temp2)){
					return false;
				}
			}
			else if(g.containsKey(Character.toString(exp.charAt(i))) && n.isEmpty()){
				return false;
			}
			
		}
		if(n.isEmpty()){
			return true;
		}

		return false;
		
	}
}
