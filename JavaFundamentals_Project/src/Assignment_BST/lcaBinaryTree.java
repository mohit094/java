package Assignment_BST;

import java.util.LinkedList;
import java.util.Queue;

import Assignment_BinaryTrees.BinaryTreeNode;

public class lcaBinaryTree {
	public static void main(String[] args) {
		
	}
	public static int lcaBinaryTree(BinaryTreeNode <Integer> root , int a, int b){
		// Write your code here
		if(root == null){
			return -1;
		}
		int flag =1;
		if(root.data == a || root.data == b){
			
		}
	}
	
	public static boolean checkAB(BinaryTreeNode <Integer> root, int a, int b){
		Queue<BinaryTreeNode <Integer>> pendingItems = new LinkedList();
		pendingItems.add(root);
		int flag1 = 0;
		int flag2 = 0;
		while(!pendingItems.isEmpty()){
			BinaryTreeNode <Integer> tempNode = pendingItems.remove();
			if(tempNode.right!=null){
				pendingItems.add(tempNode.right);
			}
			if(tempNode.left!=null){
				pendingItems.add(tempNode.left);
			}
			if(tempNode.data == a){
				flag1 = 1;
			}
			if(tempNode.data == b){
				flag2 = 1;
			}
		}
		
		if(flag1 == 1 && flag2 == 1){
			return true;
		}
		else{
			return false;
		}
	}
}
