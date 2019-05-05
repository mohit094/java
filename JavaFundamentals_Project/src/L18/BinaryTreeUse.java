package L18;

import java.util.Scanner;

import L17.QueueEmptyException;
import L17.QueueUsingLL;

public class BinaryTreeUse {
	public static BTNode<Integer> takeInput() {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		if(data == -1) {
			return null;
		}
		BTNode<Integer> root = new BTNode<Integer>(data);
		root.left = takeInput();
		root.right = takeInput();
		return root;
	}
	
	public static void print(BTNode<Integer> root){
		if(root == null){
			return;
		}
		System.out.print(root.data + " ");
		print(root.left);
		print(root.right);
	}
	
	public static BTNode<Integer> takeInputLevelWise() throws QueueEmptyException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data : ");
		int data = s.nextInt();
		if(data == -1) {
			return null;
		}
		BTNode<Integer> root = new BTNode<Integer>(data);
		QueueUsingLL<BTNode<Integer>> pendingNodes = new QueueUsingLL<BTNode<Integer>>();
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			BTNode<Integer> current = pendingNodes.dequeue();
			System.out.println("Enter left child of " + current.data + " : ");
			int leftData = s.nextInt();
			if(leftData != -1) {
				BTNode<Integer> left = new BTNode<Integer>(leftData);
				current.left = left;
				pendingNodes.enqueue(left);
			}
			System.out.println("Enter right child of " + current.data + " : ");
			int rightData = s.nextInt();
			if(rightData != -1) {
				BTNode<Integer> right = new BTNode<Integer>(rightData);
				current.right = right;
				pendingNodes.enqueue(right);
			}
		}
		return root;
		
	}
	
	public static void printLevelWise(BTNode<Integer> root) throws QueueEmptyException{
		QueueUsingLL<BTNode<Integer>> pendingNodes = new QueueUsingLL<BTNode<Integer>>();
		if(root == null){
			return;
		}
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()){
			BTNode<Integer> current = pendingNodes.dequeue();
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
		BTNode<Integer> root = takeInputLevelWise();
		printLevelWise(root);
	}
}
