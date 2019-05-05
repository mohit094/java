package L20;

public class BTNode<T> {
	T data;
	BTNode<T> left;
	BTNode<T> right;
	
	BTNode(T data) {
		this.data = data;
		left = null;
		right = null;
	}
}
