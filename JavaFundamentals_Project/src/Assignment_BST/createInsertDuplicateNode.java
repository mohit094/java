package Assignment_BST;

import Assignment_BinaryTrees.BinaryTreeNode;

public class createInsertDuplicateNode {
	public static void main(String[] args) {
		
	}
	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		// Write your code here
		if(root == null){
			return;
		}
		if(root.left == null && root.right == null){
			BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(root.data);
			root.left = newNode;
			return;
		}
		insertDuplicateNode(root.left);
		insertDuplicateNode(root.right);
		BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(root.data);
		newNode.left = root.left;
		root.left = newNode;
		return;
	}
}
