package Assignment_LinkedList1;
import L15.Node;

import java.util.Scanner;

import L15.InsertAti;
public class deleteNodeRecursively {
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
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
	
	public static Node<Integer> delete(Node<Integer> head, int position) {
		if(head == null){
			return head;
		}
		if(head.next == null && position == 1){
			return head;
		}
		if(position == 1){
			head.next = head.next.next;
			return head;
		}
		Node<Integer> SubHead = delete(head.next, position-1);
		head.next = SubHead;
		return head;
	}
	
}
