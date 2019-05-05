package L21;

import L15.Node;


class isBSt {
	int max;
	int min;
	boolean result;
}


public class BST {

	public static Node<Integer> convertLL(BTNode<Integer> root) {
		if(root == null) {
			return null;
		}

		Node<Integer> leftHead = convertLL(root.left);
		Node<Integer> rightHead = convertLL(root.right);

		Node<Integer> rootHead = new Node<Integer>(root.data);

		Node<Integer> temp = leftHead;
		if(temp != null) {
			while(temp.next != null) {
				temp = temp.next;
			}

			temp.next = rootHead;
			rootHead.next = rightHead;
			return leftHead;
		}
		else {
			rootHead.next = rightHead;
			return rootHead;
		}

	}

	// O(n*h)
	public static boolean checkBST(BTNode<Integer> root) {
		if(root == null) {
			return true;
		}
		
		boolean leftAns = checkBST(root.left);
		boolean rightAns = checkBST(root.right);
		
		if(leftAns == false || rightAns == false) {
			return false;
		}
		
		int leftMax = max(root.left);
		int rightMin = min(root.right);
		
		if(root.data > leftMax && root.data < rightMin) {
			return true;
		}
		else {
			return false;
		}
		
		
		
		/* Not correct
		 * boolean a = true, b = true;
		if(root.left != null) {
			if(root.data < root.left.data) {
				a = false;
			}
		}
		if(root.right != null) {
			if(root.data > root.right.data) {
				b = false;
			}
		}
		return a && b;*/
	}

	
	// O(n)
	public static boolean checkBST_2(BTNode<Integer> root, 
			int min, int max) {
		if(root == null) {
			return true;
		}
		if(root.data < min || root.data > max) {
			return false;
		}
		
		boolean left = checkBST_2(root.left, min, root.data);
		boolean right = checkBST_2(root.right, root.data, max);
		return left && right;
	}
	
	
	private static int min(BTNode<Integer> root) {
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		
		return Math.min(root.data, 
				Math.min(min(root.left), min(root.right)));
	}

	private static int max(BTNode<Integer> root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		
		return Math.max(root.data, 
				Math.max(max(root.left), max(root.right)));
	}

}
