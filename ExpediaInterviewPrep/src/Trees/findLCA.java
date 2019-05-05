package Trees;

public class findLCA {
	public static int lcaBinaryTree(BinaryTreeNode <Integer> root , int a, int b){
		// Write your code here
		return findLCA(root,a,b).data;

	}
	
	public static BinaryTreeNode<Integer> findLCA(BinaryTreeNode<Integer> node, int n1, int n2){
		if(node == null){
			return node;
		}
		
		if(node.data == n1 || node.data == n2){
			return node;
		}
		
		BinaryTreeNode<Integer> left_LCA = findLCA(node.left,n1,n2);
		BinaryTreeNode<Integer> right_LCA = findLCA(node.right,n1,n2);
		
		if(left_LCA!= null && right_LCA!=null){
			return node;
		}
		
		return (left_LCA!=null)?left_LCA:right_LCA;
	}
}
