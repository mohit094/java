package practice_linkedList;

class ListNode2<t> {
	public t data;
	 public ListNode2<t> next;
	 public ListNode2<t> arbitrary;
	 public ListNode2(t data)
	 {
		 this.data=data;
	 }
}
public class pointToNextIncreasingNode {
	
	public static ListNode2<Integer> changeList(ListNode2<Integer> head) {
		// Write your code here
		ListNode2<Integer> temp = head.next;
		ListNode2<Integer> newHead = head;
		newHead.arbitrary = null;
		while(temp!= null){
			ListNode2<Integer> temp2 = newHead;
			ListNode2<Integer> temp3 = temp2.arbitrary;
			if(temp.data<newHead.data){
				temp.arbitrary = newHead;
				newHead = temp;
				temp = temp.next;
				continue;
			}
			boolean flag = false;
			while(temp3!=null){
				if(temp.data<temp3.data){
					temp.arbitrary = temp3;
					temp2.arbitrary = temp;
					temp = temp.next;
					flag = true;
					break;
				}
				temp2 = temp3;
				temp3 = temp2.arbitrary;
			}
			if(flag!=true){
				temp2.arbitrary = temp;
				temp.arbitrary = null;
				temp = temp.next;
			}
		}
		
		return newHead;
	}
}
