package Assignment_LinkedList1;

import java.util.Scanner;

public class palindrome_LinkedList {
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		print(head);
		boolean flag = isPalindrome_2(head);
		System.out.println(flag);
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

	public static int LL_length(Node<Integer> head){
		Node<Integer> temp = head;
		int count = 0;
		while(temp!=null){
			temp = temp.next;
			count++;
		}
		return count;
	}
	public static Node<Integer> reverse(Node<Integer> head){
		if(head == null || head.next == null){
			return head;
		}
		Node<Integer> temp = reverse(head.next);
		head.next.next = head;
		head.next = null;
		head = temp;
		return head;
	}
	public static boolean isPalindrome_2(Node<Integer> head) {
	    int length = LL_length(head);
	    Node<Integer> mid = null;
	    Node<Integer> temp = head;
	    int k = (length-1)/2;
	    for(int i = 0; i< k; i++){
	    	temp = temp.next;
	    };
	    mid = temp;
	    mid.next = reverse(mid.next);
	    temp = head;
	    Node<Integer> temp2 = mid.next;
	    boolean flag = true;
	    if(length/2 == 0){
	    	for(int i = 0;i<=(length-1)/2; i++){
	    		if(temp.data != temp2.data){
	    			return false;
	    		}
	    		temp = temp.next;
	    		temp2 = temp2.next;
	    	}
	    }
	    else{
	    	for(int i = 0;i<(length-1)/2; i++){
	    		if(temp.data != temp2.data){
	    			return false;
	    		}
	    		temp = temp.next;
	    		temp2 = temp2.next;
	    	}
	    }
	    
	    return flag;
	}
}
