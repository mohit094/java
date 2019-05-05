package Assignment_StackQueue;

import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
	public static void reverseQueue3(Queue<Integer> q) {
	    if(q.size() == 0 || q.size() == 1){
	    	return;
	    }
	    int temp = q.remove();
	    reverseQueue3(q);
	    q.add(temp);
	    
	}
	public static void reverseQueue(Queue<Integer> q) {
	    q = reverseQueue2(q);
	}
	public static Queue<Integer> reverseQueue2(Queue<Integer> q) {
	    if(q.size() == 0 || q.size() == 1){
	        return q;
	    }
	    int a = q.remove();
	    q = reverseQueue2(q);
	    q.add(a);
	    
	    return q;
	}
}
