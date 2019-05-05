package practice_linkedList;

public class deleteAGivenNode {
	
	public static void main(String[] args) {
		ListNodeUse2 obj = new ListNodeUse2();
		ListNode<Integer> head = obj.takeInputBetter();
		ListNode<Integer> n = new ListNode<Integer>(6);
		head = deleteNode(head,n);
		obj.print(head);
	}
	
	public static ListNode<Integer> deleteNode(ListNode<Integer> head, ListNode<Integer> n) {
		// Write your code here
		if(head == null){
			return head;
		}
		
		int t = n.data;
		ListNode<Integer> temp1 = head;
		
		if(temp1.data == t){
			head = temp1.next;
			temp1.next = null;
			return head;
		}
		
		ListNode<Integer> temp2 = temp1.next;
		
		while(temp2!=null){
			if(temp2.data == t){
				temp1.next = temp2.next;
				temp2.next = null;
				break;
			}
			temp1 = temp2;
			temp2 = temp1.next;
		}
		System.out.println(temp1.next);
		return head;
	}
}
