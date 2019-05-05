package Assignment_LinkedList1;

import java.util.Scanner;

public class printReverseOfLL {
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		print(head);
		printReverse(head);
		System.out.println();
	}
	public static Node<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		Node<Integer> head = null;
		Node<Integer> tail = null;
		int data = s.nextInt();
		while(data!=-1){
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null){
				head = newNode;
				tail = newNode;
			}
			else{
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static void print(Node<Integer> head){
		Node<Integer> temp = head;
		while(temp != null){
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void printReverse(Node<Integer> head){
		if(head == null){
			return;
		}
		if(head.next == null){
			System.out.print(head.data + "->");
			return;
		}
		printReverse(head.next);
		System.out.print(head.data + "->");
		return;
	}
	

}
