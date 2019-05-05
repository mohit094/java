package Assignment_BinaryTrees;

import java.util.Arrays;

public class constructTreeFromInOrderAndPostorder {
	public static void main(String[] args) {
		int[] arr1 = {8,4,5,2,6,7,3,1};
		int[] arr2 = {4,8,2,5,1,6,3,7};
		BinaryTreeNode<Integer> root = getTreeFromPostorderAndInorder(arr1, arr2);
		printLevelWise.printLevelWise2(root);
	}
	public static BinaryTreeNode<Integer> getTreeFromPostorderAndInorder(int[] post,int[] in){
		
		// Write your code here
		if(in.length == 0){
			return null;
		}
		if(post.length == 1){
			BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(post[0]);
			return root;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(post[post.length-1]);
		int i = 0;
		for(; i<in.length; i++){
			if(in[i] == post[post.length-1]){
				break;
			}
		}
		//break postorder array
		System.out.println("I am here:- " + i);
		System.out.println();
		int[] arr1 = Arrays.copyOfRange(post,0,i);
		int[] arr2 = Arrays.copyOfRange(post,i,post.length-1);
		// break inorder array
		int[] arr3 = Arrays.copyOfRange(in,0,i);
		int[] arr4 = Arrays.copyOfRange(in,i+1,in.length);
		
		root.left = getTreeFromPostorderAndInorder(arr1,arr3);
		root.right = getTreeFromPostorderAndInorder(arr2,arr4);
		return root;
		
	}
}
