package Assignment_BinaryTrees;

import java.util.Scanner;

import L17.QueueEmptyException;
import L17.QueueUsingLL;


class DiameterPair {
	int height;
	int diameter; 
}

public class BinaryTreeUse {

	public static int height(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		return Math.max(leftHeight, rightHeight) + 1;
	}
	
	public static void mirror(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		mirror(root.left);
		mirror(root.right);
		
		BinaryTreeNode<Integer> temp = root.left;
		root.left = root.right;
		root.right = temp;
	}
	
	public static BinaryTreeNode<Integer> nextLarger(BinaryTreeNode<Integer> root, 
			int x) {
		
		if(root == null) {
			return null;
		}
		BinaryTreeNode<Integer> ans = root.data > x ? root : null;
		BinaryTreeNode<Integer> leftAns = nextLarger(root.left, x);
		if(leftAns != null) {
			if(ans == null || leftAns.data < ans.data) {
				ans = leftAns;
			}
		}
		BinaryTreeNode<Integer> rightAns = nextLarger(root.right, x);
		if(rightAns != null) {
			if(ans == null || rightAns.data < ans.data) {
				ans = rightAns;
			}
		}
		return ans;
	}
	
	public static int diameter(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int diameter1 = height(root.left) + height(root.right) + 1;
		int diameter2 = diameter(root.left);
		int diameter3 = diameter(root.right);
		return Math.max(diameter1, Math.max(diameter2, diameter3));
	}
	
	public static DiameterPair diameterBetter(BinaryTreeNode<Integer> root) {
		if(root == null) {
			DiameterPair ans = new DiameterPair();
			ans.height = 0;
			ans.diameter = 0;
			return ans;
		}
		
		DiameterPair leftAns = diameterBetter(root.left);
		DiameterPair rightAns = diameterBetter(root.right);
		
		int diameter1 = leftAns.diameter;
		int diameter2 = rightAns.diameter;
		int diameter3 = leftAns.height + rightAns.height + 1;
		
		DiameterPair ans = new DiameterPair();
		ans.diameter = Math.max(diameter1, 
				Math.max(diameter2, diameter3));
		ans.height = Math.max(leftAns.height, 
				rightAns.height) + 1;
		return ans;
		
	}
	
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
	
	
	
		
}
