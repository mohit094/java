package Assignment_BST;

import java.util.Scanner;

import Assignment_BinaryTrees.BinaryTreeNode;
import L17.QueueEmptyException;
import L17.QueueUsingLL;

public class BinaryTreeUse {
	public static BinaryTreeNode<Integer> takeInput() {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		if(data == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
		root.left = takeInput();
		root.right = takeInput();
		return root;
	}
	
	public static void print(BinaryTreeNode<Integer> root){
		if(root == null){
			return;
		}
		System.out.print(root.data + " ");
		print(root.left);
		print(root.right);
	}
	
	public static BinaryTreeNode<Integer> takeInputLevelWise() throws QueueEmptyException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data : ");
		int data = s.nextInt();
		if(data == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<BinaryTreeNode<Integer>>();
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> current = pendingNodes.dequeue();
			System.out.println("Enter left child of " + current.data + " : ");
			int leftData = s.nextInt();
			if(leftData != -1) {
				BinaryTreeNode<Integer> left = new BinaryTreeNode<Integer>(leftData);
				current.left = left;
				pendingNodes.enqueue(left);
			}
			System.out.println("Enter right child of " + current.data + " : ");
			int rightData = s.nextInt();
			if(rightData != -1) {
				BinaryTreeNode<Integer> right = new BinaryTreeNode<Integer>(rightData);
				current.right = right;
				pendingNodes.enqueue(right);
			}
		}
		return root;
		
	}
	
	public static void printLevelWise(BinaryTreeNode<Integer> root) throws QueueEmptyException{
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<BinaryTreeNode<Integer>>();
		if(root == null){
			return;
		}
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()){
			BinaryTreeNode<Integer> current = pendingNodes.dequeue();
			if(current.left != null){
				pendingNodes.enqueue(current.left);
			}
			if(current.right != null){
				pendingNodes.enqueue(current.right);
			}
			System.out.println(current.data + " ");			
		}
	}
	
		
	// 1 2 3 -1 10 4 -1 -1 -1 -1 -1
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		printLevelWise(root);
	}
}
