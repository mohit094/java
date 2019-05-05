package Trees;

class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;
	
	public BinaryTreeNode(T data) {
		this.data = data;
	}
}
class temp2{
	int maxHeight = 0;
	Boolean isBalancedTree = false;
}
public class isBalanced {
	public static boolean checkBalanced(BinaryTreeNode<Integer> root){
		temp2 value = checkBalanced2(root);
		return value.isBalancedTree;
	}
	
	public static temp2 checkBalanced2(BinaryTreeNode<Integer> root){
		if(root == null){
			temp2 value = new temp2();
			value.isBalancedTree = true;
			return value;
		}
		
		temp2 leftResult = checkBalanced2(root.left);
		temp2 rightResult = checkBalanced2(root.right);
		temp2 finalResult = new temp2();
		
		if(leftResult.isBalancedTree && rightResult.isBalancedTree && leftResult.maxHeight - rightResult.maxHeight <= 1 &&
				rightResult.maxHeight - leftResult.maxHeight <=1	){
			finalResult.isBalancedTree = true;
			finalResult.maxHeight = Math.max(leftResult.maxHeight, rightResult.maxHeight) + 1;
		}
		
		return finalResult;
		
	}
}
