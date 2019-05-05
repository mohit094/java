package Trees;

public class createAndInsertDuplicateNode {
	
	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		if(root == null){
			return;
		}
		
		insertDuplicateNode(root.left);
		insertDuplicateNode(root.right);
		BinaryTreeNode<Integer> newLeftNode = new BinaryTreeNode<Integer>(root.data);
		
		newLeftNode.left = root.left;
		root.left = newLeftNode;
		
	}
}
