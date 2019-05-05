package HackerRank;

import java.util.HashMap;

class Node {
    int data;
    Node next;
}
public class hasCycle {
	boolean hasCycle(Node head) {
		HashMap<Node,Integer> temp = new HashMap<Node,Integer>();
		Node temp1 = head;
		while(temp1!=null){
			if(temp.containsKey(temp1)){
				return false;
			}
			temp.put(temp1, 1);
			temp1 = temp1.next;
		}
		
		return true;
		
	}
}
