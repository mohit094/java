package L16;
import java.util.Scanner;

import L15.Node;
public class findMidPointOfLinkedList {
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		print(head);
		Node<Integer> mid = midPoint(head,head,1);
		if(mid != null){
			System.out.println(mid.data);	
		}
		else{
			System.out.println("No element in the list");
		}
		
		
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
	
	public static Node<Integer> midPoint(Node<Integer> head, Node<Integer> Mid, int count) {
		if(head == null){
			return head;
		}
		
		if(head.next==null && count == 1){
			return Mid;
		}
		
		if(head.next == null && count != 1){
			if(count%2 != 0){
				Mid = Mid.next;
				return Mid;
			}
			else{
				return Mid;
			}
		}
		
		if(count%2 != 0 && count!=1){
			Mid = Mid.next;
		}
		count = count + 1;
		head = head.next;
		Node<Integer> MidPoint = midPoint(head, Mid, count);
		
		return MidPoint;
		
	}
}
