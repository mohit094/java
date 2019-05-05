package L15;

import java.util.Scanner;

public class InsertAti {
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		print(head);
		head = insertAtIPosition(head,0,5);
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
	
	public static Node<Integer> insertAtIPosition(Node<Integer> head, int i, int n){
		Node<Integer> temp = head;
		int k = 0;
		if(i == 0){
			Node<Integer> newNode = new Node<Integer>(n);
			newNode.next = head;
			head = newNode;
		}
		if(head != null){
			for(; k < i-1; k++ ){
				if(temp.next == null ){
					break;
				}
				temp = temp.next;
				System.out.println("I am here " + k);
				
			}
		}
				
		if(k == i-1){
			Node<Integer> newNode = new Node<Integer>(n);
			newNode.next = temp.next;
			temp.next = newNode;
			System.out.println("I am here actually");
		}
		return head;
	}
	
	public static void print(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
	}
}
