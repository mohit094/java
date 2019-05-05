package L16;
import java.util.Scanner;

import L15.Node;
public class findMidIn_LL_Iteratively {
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		Node<Integer> mid = findMid(head);
		System.out.println(mid.data);
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
	
	public static Node<Integer> findMid(Node<Integer> head){
		if(head == null || head.next == null){
			return head;
		}
		Node<Integer> f = head;
		Node<Integer> s = head;
		while(f != null && f.next!=null && f.next.next!=null){
			f = f.next.next;
			s = s.next;
		}
		
		return s;
	}
}
