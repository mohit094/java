package Assignment_BST;

import java.util.ArrayList;

import Assignment_BinaryTrees.BinaryTreeNode;

public class ReplaceWithSumOfGreaterNodes {
	public static void main(String[] args) {
		
	}
	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		// Write your code here
		ArrayList<BinaryTreeNode<Integer>> arr = returnArrayListOfTree(root);
		int sum = 0;
		for(BinaryTreeNode<Integer> i : arr){
			sum = sum + i.data;
		}
		for(BinaryTreeNode<Integer> i : arr){
			int temp = i.data;
			i.data = sum;
			sum = sum - temp;
		}
	}
	
	public static ArrayList<BinaryTreeNode<Integer>> returnArrayListOfTree(BinaryTreeNode<Integer> root){
		if(root == null){
			ArrayList<BinaryTreeNode<Integer>> arr = new ArrayList<BinaryTreeNode<Integer>>();
			return arr;
		}
		ArrayList<BinaryTreeNode<Integer>> leftArr = returnArrayListOfTree(root.left);
		ArrayList<BinaryTreeNode<Integer>> rightArr = returnArrayListOfTree(root.right);
		leftArr.add(root);
		for(BinaryTreeNode<Integer> i : rightArr){
			leftArr.add(i);
		}
		
		return leftArr;
	}
}
