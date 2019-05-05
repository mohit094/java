package Assignment_LinkedList2;

public class kReverse {
	public static void main(String[] args) {
		
	}
	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
		if(head == null || head.next==null){
			return head;
		}
		LinkedListNode<Integer> head2 = null;
		LinkedListNode<Integer> temp = head;
		LinkedListNode<Integer> temp1 = null;
		head2 = temp;
		for(int i = 0; i < k && temp != null; i++){
			temp1 = temp;
			temp = temp.next;
		}
		head = temp;
		temp1.next = null;
		
		LinkedListNode<Integer> temp2 = head2;
		head2 = reverse(head2);
		
		LinkedListNode<Integer> kReverseHead = kReverse(temp,k);
		temp2.next = kReverseHead;
		
		return head2;
		
	}
	public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head) {
		if(head == null || head.next==null){
			return head;
		}
		LinkedListNode<Integer> reverseHead = reverse(head.next);
		head.next.next = head;
		head.next = null;
		
		return reverseHead;
	}
}
