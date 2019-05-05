package practice_linkedList;

public class reArrangeLinkedList {
	public static void main(String[] args) {
		
	}
	public static ListNode<Integer> changelist(ListNode<Integer> head) {
		// Write your code here
		if(head == null || head.next == null || head.next.next == null){
			return head;
		}
		ListNode<Integer> temp1 = head;
		ListNode<Integer> temp2 = head.next;
		
		while(temp2.next != null){
			temp1 = temp2;
			temp2 = temp2.next;
		}
		temp1.next = null;
		temp2.next = head.next;
		head.next = temp2;
		ListNode<Integer> remainingNode = changelist(temp2.next);
		temp2.next = remainingNode;
		
		return head;
		
	}
}
