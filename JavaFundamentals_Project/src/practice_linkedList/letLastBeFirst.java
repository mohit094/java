package practice_linkedList;

public class letLastBeFirst {
	
	public static ListNode<Integer> lastToFront(ListNode<Integer> head) {
		// Write your code here
		if(head == null || head.next == null){
			return head;
		}
		
		ListNode<Integer> temp1 = head;
		ListNode<Integer> temp2 = temp1.next;
		
		while(temp2.next != null){
			temp1 = temp2;
			temp2 = temp2.next;
		}
		
		temp1.next = null;
		temp2.next = head;
		head = temp2;
		
		return head;
	}
}
