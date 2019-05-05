package practice_linkedList;

import java.util.Scanner;



public class ListNode<T> {
	T data;
	ListNode<T> next;
	ListNode(T data){
		this.data = data;
		
	}
}

class ListNodeUse2{
	public static ListNode<Integer> takeInputBetter() {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		ListNode<Integer> head = null, tail = null;
		while(data != -1) {
			ListNode<Integer> newNode = new ListNode<Integer>(data);			
			newNode.data = data;
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = tail.next;
//				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static void print(ListNode<Integer> head) {
		ListNode<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
	}
}
