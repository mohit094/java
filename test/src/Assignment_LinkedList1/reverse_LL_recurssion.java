package Assignment_LinkedList1;

import java.util.Scanner;

import L15.Node;
class pair {
	Node<Integer> head;
	Node<Integer> tail;
}
public class reverse_LL_recurssion {
	
	public static void main(String[] args) {
		Node<Integer>head = takeInput();
		print(head);
		head = reverse_R2(head);
		print(head);
/*		pair ans = reverse_R3(head);
		print(ans.head);*/
	}
	public static Node<Integer> takeInput() {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null;
		while(data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null) {
				head = newNode;
			}
			else {
				Node<Integer> temp = head;
				while(temp.next != null) {
					temp = temp.next;
				}
				temp.next = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	public static void print(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println();
	}
	//O(n^2) with finding tail always
	public static Node<Integer> reverse_R(Node<Integer> head) {
		if(head == null || head.next == null){
			return head;
		}
		Node<Integer> temp = reverse_R(head.next);
		Node<Integer> tail = temp;
		while(tail.next!= null){
			tail = tail.next; 
		}
		tail.next = head;
		head.next = null;
		return temp;
	}
	// O(n) without finding the tail
	public static Node<Integer> reverse_R2(Node<Integer> head) {
		if(head == null || head.next == null){
			return head;
		}
		Node<Integer> temp = reverse_R(head.next);
		Node<Integer> tail = head.next;
		tail.next = head;
		head.next = null;
		head = temp;
		return temp;
	}
	//
	public static pair reverse_R3(Node<Integer> head){
		if(head == null || head.next == null){
			pair ans = new pair();
			ans.head = head;
			ans.tail = head;
			return ans;
		}
		pair ans = reverse_R3(head.next);
		head.next = null;
		ans.tail.next = head;
		ans.tail = head;
		return ans;
	}
	
}
