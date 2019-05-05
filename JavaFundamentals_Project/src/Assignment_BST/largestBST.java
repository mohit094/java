package Assignment_BST;

import Assignment_BinaryTrees.BinaryTreeNode;
import L17.QueueEmptyException;

class pair{
	int x = 0;
	boolean isBST = false;
	int maximum = Integer.MIN_VALUE;
	int minimum = Integer.MAX_VALUE;
}

public class largestBST {
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeUse obj = new BinaryTreeUse();
		BinaryTreeNode<Integer> root = obj.takeInputLevelWise();
		pair newPair = largestBSTSubtree(root);
		System.out.println("Result : " + newPair.x);
	}
	
	public static pair largestBSTSubtree(BinaryTreeNode<Integer> root) {
		// Write your code here
		if(root == null){
			pair temp = new pair();
			temp.isBST = true;
			return temp;
		}
		if(root.left == null && root.right == null){
			pair temp = new pair();
			temp.isBST = true;
			temp.x = 1;
			temp.minimum = root.data;
			temp.maximum = root.data;
			return temp;
		}
		
		pair leftTemp = largestBSTSubtree(root.left);
		pair rightTemp = largestBSTSubtree(root.right);
		
		if(leftTemp.isBST == true && rightTemp.isBST == true ){
			if(root.data > leftTemp.maximum && root.data <= rightTemp.minimum ){
				pair newPair = new pair();
				newPair.x = 1 + Math.max(leftTemp.x, rightTemp.x);
				newPair.isBST = true;
				newPair.maximum = rightTemp.maximum;
				newPair.minimum = leftTemp.minimum;
				return newPair;
			}
			else{
				pair newPair = new pair();
				newPair.x = Math.max(leftTemp.x, rightTemp.x);
				newPair.isBST = false;
				return newPair;
			}
			
		}
		else{
			pair newPair = new pair();
			newPair.x = Math.max(leftTemp.x, rightTemp.x);
			newPair.isBST = false;
			return newPair;
		}
	}
	
}
