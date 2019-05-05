package Assignment_LinkedList2;

import java.util.Scanner;

public class evenAfterOddLinkedList {
	public static void main(String[] args) {
		LinkedListNode<Integer> head = takeInput();
		print(head);
		head = sortEvenOdd(head);
		print(head);
	}
	
	public static LinkedListNode<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		int data = s.nextInt();
		while(data!=-1){
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
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
	
	public static void print(LinkedListNode<Integer> head){
		LinkedListNode<Integer> temp = head;
		while(temp != null){
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println();
	}

	public static LinkedListNode<Integer> sortEvenOdd(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> tail = null;
		LinkedListNode<Integer> temp1 = head;
		if(head == null && head.next == null){
			return head;
		}
		LinkedListNode<Integer> temp2 = head.next;
		if(head.data%2 != 0){
			tail = head;
		}
		//temp1 is the node uptill which we have processed
		//temp2 is the node which we need to process
		while(temp2 != null){
			if(temp2.data%2 != 0){
				//case to handle when tail is empty
				if(tail == null){
					temp1.next = temp2.next;
					tail = temp2;
					tail.next = head;
					head = tail;
					temp2 = temp1.next;
				}
				//case to handle when tail and temp1 is same
				else if(tail == temp1){
					tail = temp2;
					temp1 = temp2;
					temp2 = temp1.next;
				}
				//normal case of replacing numbers
				else{
					temp1.next = temp2.next;
					temp2.next = tail.next;
					tail.next = temp2;
					tail =  temp2;
					temp2 = temp1.next;
				}
			}
			else{
				temp1 = temp2;
				temp2 = temp1.next;
			}
		}
		
		return head;
	}
}
