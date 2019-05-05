package Assignment_LinkedList2;

import java.util.Scanner;

public class bubbleSort_LinkedList {
	public static void main(String[] args) {
		LinkedListNode<Integer> head = takeInput();
		print(head);
		head = bubbleSort(head);
		print(head);
	}
	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head )
	{
		LinkedListNode<Integer> temp1 = head;
		LinkedListNode<Integer> temp2 = head;
		LinkedListNode<Integer> temp3 = head.next;
		int length = linkedListLength(head);
		for(int i = length-1; i>=1; i--){
			//swap for head value if greater
			if(head.data > temp3.data){
				head = temp3;
				temp2.next = temp3.next;
				head.next = temp2;
				temp3 = temp2.next;
				temp1 = head;
			}
			else{
				temp2 = temp3;
				temp3 = temp3.next;
			}
			boolean flag = false;
			for(int j = 1; j<i; j++){
				if(temp2.data > temp3.data){
					// swap
					temp1.next = temp3;
					temp2.next = temp3.next;
					temp3.next = temp2;
					flag = true;
					//shift temp1, temp2, temp3
					temp1 = temp3;
					temp3 = temp2.next;
				}
				else{
					//shift
					temp1 = temp2;
					temp2 = temp3;
					temp3 = temp2.next;
				}
			}
			temp1 = head;
			temp2 = head;
			temp3 = head.next;
			if(flag == false){
				break;
			}
		}
		
		
		return head;
	}
	
	public static int linkedListLength(LinkedListNode<Integer> head){
		LinkedListNode<Integer> temp1 = head;
		int count = 0;
		while(temp1!=null){
			temp1 = temp1.next;
			count++;
		}
		return count;
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

}
