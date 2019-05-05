package Assignment_LinkedList1;

import java.util.Scanner;

public class removeDuplicate_LinkedList {
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		print(head);
		head = removeDuplicate(head);
		print(head);
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

	public static Node<Integer> removeDuplicate(Node<Integer> head){
		Node<Integer> temp = head;
		if(head == null){
			return head;
		}
		while(temp.next != null){
			if(temp.data == temp.next.data){
				temp.next = temp.next.next;
			}
			else{
				temp = temp.next;
			}
		}
		return head;
	}

}
