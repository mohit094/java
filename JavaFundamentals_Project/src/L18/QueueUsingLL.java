package L18;
import L15.Node;
public class QueueUsingLL<T> {
	private Node<T> head;
	private Node<T> tail;
	private int size = 0;
	
	public int getSize() {
		return size;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public T front() {
		if(isEmpty()) {
			System.out.println("Underflow !");
			return null;
		}
		return head.data;
	}
	public void enqueue(T element){
		Node<T> newNode = new Node<T>(element);
		if(isEmpty()){
			head = newNode;
			tail = newNode;
			size++;
			return;
		}
		newNode.next = null;
		tail.next = newNode;
		tail = newNode;
		size++;
	}
	int t = 0;
	public T dequeue() throws QueueEmptyException{
		if(isEmpty()){
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
//		System.out.println("Here " + t);
		T value = head.data;
		head = head.next;
		size--;
		t++;
		return value;
	}
}
