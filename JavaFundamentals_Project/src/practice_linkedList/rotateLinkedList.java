package practice_linkedList;

public class rotateLinkedList {
	public static ListNode<Integer> changeList(ListNode<Integer> head, int n) {
		// Write your code here
		int t = 0;
		ListNode<Integer> temp = head;
		while(temp!=null){
			t++;
			temp = temp.next;
		}
		if(n%t == 0){
			return head;
		}
		int a = 1;
		temp = head;
		ListNode<Integer> temp1 = temp.next;
		ListNode<Integer> temp2 = head;
		while(temp1!=null){
			if(a == t-n){
				temp.next = null;
				head = temp1;
			}
			temp = temp1;
			temp1 = temp1.next;
			a++;
			if(temp.next == null){
				temp.next = temp2;
			}
		}		
		return head;
	}
}
