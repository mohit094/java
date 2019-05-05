package Assignment_BinaryTrees;
class pair{
	int height = 0;
	boolean result = true;
}
public class isBalanced {
	public static void main(String[] args) {
		
	}
	public static pair checkBalanced(BinaryTreeNode<Integer> root){		
		// Write your code here
		if(root == null){
			pair newObj = new pair();
			return newObj;
		}
		pair leftResult = checkBalanced(root.left);
		pair rightResult = checkBalanced(root.right);
		pair rootPair = new pair();
		
		if(leftResult.result && rightResult.result){
			if(leftResult.height - rightResult.height <= 1 && rightResult.height - leftResult.height <= 1){
				rootPair.height = Math.max(leftResult.height, rightResult.height) + 1;
				return rootPair;
			}
		}
		//else condition
		rootPair.result = false;
		return rootPair;
	}
}
