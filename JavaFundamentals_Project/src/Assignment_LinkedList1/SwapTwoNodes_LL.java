package Assignment_LinkedList1;
import java.util.Scanner;

import L15.Node;
public class SwapTwoNodes_LL {
	public static void main(String[] args) {
		Node<Integer> head =  takeInput();
		print(head);
		Node<Integer> newHead = swap_nodes(head, 1,2);
		print(newHead);
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
	}
	public static  Node<Integer> swap_nodes(Node<Integer> head,int i,int j){
		int count = 0;
		if(i>j){
			int temp = j;
			j = i;
			i = temp;
		}
		if(i == j){
			return head;
		}
		Node<Integer> temp = head;
		Node<Integer> temp1 = null;
		Node<Integer> h1 = null;
		Node<Integer> temp2 = null;
		Node<Integer> h2 = null;
		while(temp != null){
			if(count == i-1){
				temp1 = temp.next;
				h1 = temp;
			}
			if(i == 0){
				temp1 = head;
				h1 = head;
			}
			if(count == j-1){
				temp2 = temp.next;
				h2 = temp;
				break;
			}
			count++;
			temp = temp.next;
		}
		if(i == 0){
			if(i + 1 == j){
				head = temp2;
				temp1.next = temp2.next;
				temp2.next = temp1;
				return head;
			}
			else{
				head = temp1.next;
				temp1.next = temp2.next;
				h2.next = temp1;
				temp2.next = head;
				head = temp2;
				return head;
			}
		}
		else{
			if(i + 1 == j){
				h1.next = temp2;
				temp1.next = temp2.next;
				temp2.next = temp1;
				return head;
			}
			else{
				h1.next = temp1.next;
				temp1.next = temp2.next;
				h2.next = temp1;
				temp2.next = h1;
				h1.next = temp2;
				return head;
			}
		}
		
	}
}
