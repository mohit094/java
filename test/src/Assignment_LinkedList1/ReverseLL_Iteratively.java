package Assignment_LinkedList1;
import java.util.Scanner;

import L15.Node;
public class ReverseLL_Iteratively {
	public static void main(String[] args) {
		Node<Integer>head = takeInput();
		print(head);
		head = reverse_I(head);
		print(head);
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

	public static Node<Integer> reverse_I(Node<Integer> head) {
		if(head == null){
			return null;
		}
		Node<Integer> temp = head;
		while(temp.next!=null){
			Node<Integer> temp2 = temp.next;
			temp.next = temp.next.next;
			temp2.next = head;
			head = temp2;	
		}
		return head;
	}
}
