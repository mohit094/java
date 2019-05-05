package L16;
import L15.Node;
public class stackUsingLinkedList<T> {
	private Node <T> head = null;
	private int size = 0;
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty(){
		if(size == 0){
			return true;
		}
		else return false;
	}
	
	public T top(){
		if(head == null){
			return null;
		}
		else return head.data;
	}
	
	public void push(T element){
		Node<T> newNode = new Node<T>(element);
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	public T pop(){
		if(head == null){
			return null;
		}
		else{
			T value = head.data;
			head = head.next;
			size--;
			return value;			
		}
	}
}

