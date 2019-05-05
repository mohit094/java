package practice_linkedList;

public class reArrangeOddEven {
	public static void main(String[] args) {
		
	}
	public static ListNode<Integer> changelist(ListNode<Integer> head) {
		// Write your code here
		if(head == null || head.next == null || head.next.next == null){
			return head;
		}
		ListNode<Integer> temp1 = head;
		ListNode<Integer> temp2 = head.next;
		while(temp2!=null && temp2.next!=null){
			ListNode<Integer> temp3 = temp2.next;
			temp2.next = temp3.next;
			temp3.next = temp1.next;
			temp1.next = temp3;
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
		
		return head;
	}
}
