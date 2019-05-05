package Assignment_LinkedList1;
import java.util.Scanner;

import L15.Node;
public class Insert_ll_recursively {
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		print(head);
		Node<Integer> newHead = insertR(head,3,10);
		print(newHead);
	}
	public static void print(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println();
	}
	public static Node<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null;
		Node<Integer> tail = null;	
		while(data != -1){
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null){
				newNode.next = null;
				head = newNode;
				tail = newNode;
			}
			else{
				newNode.next = null;
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	public static  <T> Node<T> insertR(Node<T> head, int pos, T data) {
		if(head == null){
			return head;
		}
		if(head.next == null && pos == 2){
			Node<T> newNode = new Node<T>(data);
			head.next = newNode;
			newNode.next = null;
			return head;
		}
		if(pos == 1){
			Node<T> newNode = new Node<T>(data);
			newNode.next = head;
			head = newNode;
			return head;
		}
		Node<T> subHead = insertR(head.next, pos-1, data);
		head.next = subHead;
		return head;
	}
}
