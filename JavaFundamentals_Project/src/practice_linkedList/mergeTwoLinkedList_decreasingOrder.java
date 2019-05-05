package practice_linkedList;

public class mergeTwoLinkedList_decreasingOrder {
	public static void main(String[] args) {
		
	}
	public static ListNode<Integer> merge(ListNode<Integer> head1, ListNode<Integer> head2) {
		// Write your code here
		if(head1 == null && head2 == null){
			return null;
		}
		if(head1 == null){
			if(head2.next == null){
				return head2;
			}
			ListNode<Integer> temp = head2.next;
			head2.next = temp.next;
			temp.next = head2;
			while(head2.next!=null){
				ListNode<Integer> temp2 = head2.next;
				head2.next = temp2.next;
				temp2.next = temp;
				temp = temp2;			
			}
			return temp;
		}
		if(head2 == null){
			if(head1.next == null){
				return head1;
			}
			ListNode<Integer> temp = head1.next;
			head1.next = temp.next;
			temp.next = head1;
			while(head1.next!=null){
				ListNode<Integer> temp2 = head1.next;
				head1.next = temp2.next;
				temp2.next = temp;
				temp = temp2;			
			}
			return temp;
		}
		ListNode<Integer> fNode = null;
		while(head1 != null && head2 != null){
			int val1 = head1.data;
			int val2 = head2.data;
			if(fNode == null){
				if(val1 > val2){
					fNode = head1;
					head1 = head1.next;
					fNode.next = head2;
					head2 = head2.next;
					fNode.next.next = null;
				}
				else{
					fNode = head2;
					head2 = head2.next;
					fNode.next = head1;
					head1 = head1.next;
					fNode.next.next = null;
				}
				continue;
			}
			if(val1 > val2){
				ListNode<Integer> temp = head1;
				head1 = head1.next;
				temp.next = fNode;
				fNode = temp;
				ListNode<Integer> temp2 = temp.next;
				while(temp2!=null){
					if(temp2.data<=val2){
						ListNode<Integer> temp3 = head2;
						head2 = head2.next;
					    temp3.next = temp.next;
					    temp.next = temp3;
					    break;
					}
					temp = temp2;
					temp2 = temp2.next;
				}
			}
			else{
				ListNode<Integer> temp = head2;
				head2 = head2.next;
				temp.next = fNode;
				fNode = temp;
				ListNode<Integer> temp2 = temp.next;
				while(temp2!=null){
					if(temp2.data<=val1){
						ListNode<Integer> temp3 = head1;
						head1 = head1.next;
					    temp3.next = temp.next;
					    temp.next = temp3;
					    break;
					}
					temp = temp2;
					temp2 = temp2.next;
				}
			}
			
		}
		if(head1 == null ){
			while(head2!=null){
				ListNode<Integer> temp = head2;
				head2 = head2.next;
				temp.next = fNode;
				fNode = temp;
			}
		}
		else{
			while(head1!=null){
				ListNode<Integer> temp = head1;
				head1 = head1.next;
				temp.next = fNode;
				fNode = temp;
			}
		}
		
		return fNode;
	}

}
