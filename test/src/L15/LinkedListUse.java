package L15;

import java.util.Scanner;

public class LinkedListUse {
	
	// O(n^2)
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
	
	public static Node<Integer> takeInputBetter() {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null, tail = null;
		while(data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);			
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
	
	public static void print(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		temp = head;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
	}
	public static void print(Node<Integer> head,int i) {
		Node<Integer> temp = head;
		int k = 0;
		if(head != null){
			for (; k < i; k++){
				temp = temp.next;
				if(temp == null){
					break;
				}
			}
			if(k==i){
				System.out.println(temp.data);
			}
		}
	}
	
	
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		print(head,2);
	}
	
	
	
	
}
