package Assignment_BinaryTrees;

import java.util.Arrays;

import L17.QueueEmptyException;

public class constructTreeFromInorderAndPreOrder {
	public static void main(String[] args) throws QueueEmptyException {
		int[] arr1 = {1,2,3,4,15,5,6,7,8,10,9,12};
		int[] arr2 = {4,15,3,2,5,1,6,10,8,7,9,12};
		BinaryTreeNode<Integer> root = getTreeFromPreorderAndInorder(arr1, arr2);
		printLevelWise.printLevelWise2(root);
	}
	public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre, int[] in){
		
		// Write your code here
		if(in.length == 0){
			return null;
		}
		if(pre.length == 1){
			BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(pre[0]);
			return root;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(pre[0]);
		int i = 0;
		for(; i<in.length; i++){
			if(in[i] == pre[0]){
				break;
			}
		}
		//break preorder array
		int[] arr1 = Arrays.copyOfRange(pre,1,1+i);
		int[] arr2 = Arrays.copyOfRange(pre,1+i,pre.length);
		// break inorder array
		int[] arr3 = Arrays.copyOfRange(in,0,i);
		int[] arr4 = Arrays.copyOfRange(in,i+1,in.length);
		root.left = getTreeFromPreorderAndInorder(arr1,arr3);
		root.right = getTreeFromPreorderAndInorder(arr2,arr4);
		return root;
	}
}
