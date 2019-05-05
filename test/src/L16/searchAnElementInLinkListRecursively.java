package L16;
import java.util.Scanner;

import L15.Node;
public class searchAnElementInLinkListRecursively {
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		int index = searchAnElement(head,2);
		System.out.println(index);
	}
	public static void print(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
	}
	public static Node<Integer> takeInput() {
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
	
	public static int searchAnElement(Node<Integer> head, int elem){
		if(head == null){
			return -1;
		}
		if(head.data == elem){
			return 0;
		}
		head = head.next;
		int x = searchAnElement(head,elem);
		if(x!=-1){
			return x+1;
		}
		else{
			return x;
		}
	}
}
