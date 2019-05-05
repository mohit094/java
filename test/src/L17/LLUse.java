package L17;

import java.util.ArrayList;

import L15.Node;

class Pair {
	Node<Integer> head;
	Node<Integer> tail;
}

public class LLUse {
	
	// O(n)
	public static Node<Integer> reverse_3(Node<Integer> head) {
		if(head == null || head.next == null) {
			return head;
		}
		
		Node<Integer> temp = reverse_3(head.next);
		Node<Integer> tail = head.next;
		tail.next = head;
		head.next = null;
		return temp;
	}
	
	// O(n)
	public static Pair reverse_2(Node<Integer> head) {
		if(head == null || head.next == null) {
			Pair ans = new Pair();
			ans.head = head;
			ans.tail = head;
			return ans;
		}
		
		Pair temp = reverse_2(head.next);
		temp.tail.next = head;
		head.next = null;
		
		Pair ans = new Pair();
		ans.head = temp.head;
		ans.tail = head;
		return ans;
	}
	
	// O(n^2)
	public static Node<Integer> reverse_1(Node<Integer> head) {
		if(head == null || head.next == null) {
			return head;
		}
		
		Node<Integer> temp = reverse_1(head.next);
		Node<Integer> tail = temp;
		while(tail.next != null) {
			tail = tail.next;
		}
		tail.next = head;
		head.next = null;
		
		return temp;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(1, 100);
		
		System.out.println(a);
		System.out.println(a.size());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
