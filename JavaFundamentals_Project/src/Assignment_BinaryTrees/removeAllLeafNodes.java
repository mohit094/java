package Assignment_BinaryTrees;

import L17.QueueEmptyException;

public class removeAllLeafNodes {
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeUse newObj = new BinaryTreeUse();
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInputLevelWise();
		root = removeAllLeaves(root);
		BinaryTreeUse.printLevelWise(root);
	}
	public static BinaryTreeNode<Integer> removeAllLeaves(BinaryTreeNode<Integer> root){
		
		// Write your code here
        if(root == null){
            return root;
        }
        if(root.left == null && root.right == null){
            root = null;
            return root;
        }
        root.left = removeAllLeaves(root.left);
        root.right = removeAllLeaves(root.right);
        
        return root;
	}

}
