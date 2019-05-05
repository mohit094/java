package practice_linkedList;

public class divideLinkedListInTwo {
	
	public static void make2List(ListNode<Integer> head) {
		// Write your code here
		ListNode<Integer> A = null;
		ListNode<Integer> B = null;
		
		int t = 1;
		while(head!=null){
			ListNode<Integer> temp = head;
			head = head.next;
			if(t%2 == 0){
				temp.next = A;
				A = temp;
			}
			else{
				temp.next = B;
				B = temp;
			}
			t++;
		}
		
		while(A!=null){
			System.out.print(A.data + " ");
		}
		
		System.out.println();
		
		while(B!=null){
			System.out.print(B.data + " ");
		}
	}
}
