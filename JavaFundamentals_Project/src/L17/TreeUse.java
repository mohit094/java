package L17;

import java.util.Scanner;

public class TreeUse {
	
	public static TreeNode<Integer> takeInputLevelWise() throws QueueEmptyException {
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root : ");
		int rootData = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		
		while(!pendingNodes.isEmpty()) {
			TreeNode<Integer> current = pendingNodes.dequeue();
			System.out.println("Enter number of children of " + 
					current.data + " : ");
			int n = s.nextInt();
			for(int i = 0; i < n; i++) {
				System.out.println("Enter " + i + "th child of " + 
						current.data + " : ");
				int data = s.nextInt();
				TreeNode<Integer> child = new TreeNode<Integer>(data);
				current.children.add(child);
				pendingNodes.enqueue(child);
			}
		}
		return root;
	}
	
	public static void printLevelWise(TreeNode<Integer> root) throws QueueEmptyException{
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()){
			TreeNode<Integer> current = pendingNodes.dequeue();
			for(int i = 0; i < current.children.size(); i++) {
				pendingNodes.enqueue(current.children.get(i));
			}
			System.out.print(current.data + " : ");
			for(int i = 0; i < current.children.size(); i++) {
				System.out.print(current.children.get(i).data + ", ");
			}
			
		}
	}
	
	
	public static TreeNode<Integer> takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root : ");
		int data = s.nextInt();
		
		TreeNode<Integer> root = new TreeNode<Integer>(data);
		System.out.println("Enter number of children : ");
		int n = s.nextInt();
		for(int i = 0; i < n; i++) {
			TreeNode<Integer> child = takeInput();
			root.children.add(child);
		}
		return root;
	}
	
	public static void print(TreeNode<Integer> root) {
		System.out.print(root.data + " : ");
		for(int i = 0; i < root.children.size(); i++) {
			System.out.print(root.children.get(i).data + ", ");
		}
		System.out.println();
		for(int i = 0; i < root.children.size(); i++) {
			print(root.children.get(i));
		}
	}
	
	public static void main(String[] args) throws QueueEmptyException {
		TreeNode<Integer> root = takeInputLevelWise();
		printLevelWise(root);
	}
	
	
	
	
	
	
	
	
	
	
}
