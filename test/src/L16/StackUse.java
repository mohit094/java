package L16;

public class StackUse {
	public static void main(String[] args) {
		StackUsingArray s = new StackUsingArray();
		
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		s.push(7);
		
		s.push(10);
		
		System.out.println(s.size());
		
		System.out.println(s.top());
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		
//		StackUsingLL<Integer> s1 = new StackUsingLL<Integer>();
		
		
	}
}
