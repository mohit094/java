package Assignment_BST;

public class doublyLL<T> {
	T data;
	doublyLL<T> next;
	doublyLL<T> prev;
	doublyLL(T data){
		this.data = data;
		next = null;
		prev = null;
	}
}
