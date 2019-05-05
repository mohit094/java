package L15;

import java.util.Scanner;

public class deleteAtIndexI {
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		print(head);
//		head = insertAtIPosition(head,0,5);
		head = deleteAtPositionI(head,3);
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
	
	public static Node<Integer> deleteAtPositionI (Node<Integer>head, int i) {
		Node<Integer> temp = head;
		int k = 0;
		if(i == 0 && head!=null){
			head = temp.next;
			temp.next = null;
			return head;
		}
		if(head!=null){
			for(;k<i-1;k++){
				if(temp.next == null){
					break;
				}
				temp = temp.next;
			}
		}
		if(temp.next!= null){
			if(k == i-1){
				Node<Integer> temp2 = temp.next;
				temp.next = temp2.next;
				temp2.next = null;
			}
		}
		return head;
	}
	
	
}
