package L19;

public class BTNode<T> {
	public T data;
	public BTNode<T> left;
	public BTNode<T> right;
	
	BTNode(T data) {
		this.data = data;
		left = null;
		right = null;
	}
}
