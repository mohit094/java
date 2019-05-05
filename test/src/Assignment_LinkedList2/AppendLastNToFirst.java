package Assignment_LinkedList2;

class pair2{
	LinkedListNode<Integer> tail;
	int length = 0;
}
public class AppendLastNToFirst {
	
	public static void main(String[] args) {
		
	}
	public static pair2 linkedListLength(LinkedListNode<Integer> head){
		pair2 newPair = new pair2();
		newPair.tail = head;
		int count = 0;
		while(newPair.tail.next!=null){
			newPair.tail = newPair.tail.next;
			count++;
		}
		count++;
		newPair.length = count;
		return newPair;
	}
	public static LinkedListNode<Integer> append(LinkedListNode<Integer> root, int n) {
		pair2 tail_length = linkedListLength(root);
		int length = tail_length.length;
		LinkedListNode<Integer> tail = tail_length.tail;
		LinkedListNode<Integer> temp = root;
		for(int i = 0; i<length-1-n; i++){
			temp = temp.next;
		}
		tail.next = root;
		root = temp.next;
		temp.next = null;
		return root;
	}

}
