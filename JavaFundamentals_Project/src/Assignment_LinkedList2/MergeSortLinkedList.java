package Assignment_LinkedList2;

import java.util.Scanner;

import Assignment_LinkedList1.Node;

public class MergeSortLinkedList {
	public static void main(String[] args) {
		/*LinkedListNode<Integer> head1 = takeInput();
		print(head1);
		LinkedListNode<Integer> head2 = takeInput();
		print(head2);
		LinkedListNode<Integer> finalHead = merge2Sorted_LL(head1,head2);
		print(finalHead);*/
		LinkedListNode<Integer> head1 = takeInput();
		print(head1);
		LinkedListNode<Integer> finalHead = mergeSort(head1);
		print(finalHead);
	}
	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		// write your code here
		if(head == null || head.next == null){
			return head;
		}
		LinkedListNode<Integer> head1 = head;
		LinkedListNode<Integer> Mid = findMid(head);
		LinkedListNode<Integer> head2 = Mid.next;
		Mid.next = null;
		head1 = mergeSort(head1);
		head2 = mergeSort(head2);
		LinkedListNode<Integer> finalHead = merge2Sorted_LL(head1,head2);
		return finalHead;
	}
	public static LinkedListNode<Integer> merge2Sorted_LL(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
		// write your code here
		LinkedListNode<Integer> temp1 = head1;
		LinkedListNode<Integer> temp2 = head2;
		LinkedListNode<Integer> finalHead = null;
		if(head1.data>=head2.data){
			finalHead = head2;
			temp2 = temp2.next;
		}
		else{
			finalHead = head1;
			temp1 = temp1.next;
		}
		LinkedListNode<Integer> finalTail = finalHead;

		while(temp1 != null || temp2 != null){
			if(temp1 == null){
				finalTail.next = temp2;
				finalTail = temp2;
				temp2 = temp2.next;
				continue;
			}
			if(temp2 == null){
				finalTail.next = temp1;
				finalTail = temp1;
				temp1 = temp1.next;
				continue;
			}
			if(temp1.data>=temp2.data){
				finalTail.next = temp2;
				finalTail = temp2;
				temp2 = temp2.next;
			}
			else{
				finalTail.next = temp1;
				finalTail = temp1;
				temp1 = temp1.next;
			}
		}
		return finalHead;
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

	public static LinkedListNode<Integer> findMid(LinkedListNode<Integer> head){
		if(head == null || head.next == null){
			return head;
		}
		LinkedListNode<Integer> f = head;
		LinkedListNode<Integer> s = head;
		while(f != null && f.next!=null && f.next.next!=null){
			f = f.next.next;
			s = s.next;
		}
		
		return s;
	}

}
