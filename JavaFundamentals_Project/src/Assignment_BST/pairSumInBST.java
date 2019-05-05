package Assignment_BST;

import Assignment_BinaryTrees.BinaryTreeNode;
import Assignment_LinkedList1.Node;
import L17.QueueEmptyException;


public class pairSumInBST {
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeUse obj = new BinaryTreeUse();
		BinaryTreeNode<Integer> root = obj.takeInputLevelWise();
		Node<Integer> n = null;
		printNodesSumToS(root,13,n);
	}
	
	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s, Node<Integer> n) {
		// Write your code here
		if(root == null){
			return;
		}
		Node<Integer> temp1 = n;
		Node<Integer> temp2 = null;
		while(temp1!=null){
			temp2 = temp1;
			if(temp1.data == root.data){
				int x = Math.max(root.data, s-root.data);
				int y = Math.min(root.data, s-root.data);
				System.out.println("I am here root value: " + root.data);
				System.out.println(y + " " + x);
				temp2.next = temp1.next;
				printNodesSumToS(root.left,s,n);
				printNodesSumToS(root.right,s,n);
				return;
			}
			
			temp1 = temp1.next;
		}
		
		int t = s-root.data;
		Node<Integer> newNode = new Node<Integer>(t);
		if(n == null){
			n = newNode;
			temp1 = newNode;
		}
		else{
			temp2.next = newNode;
		}
		if(t>=root.data){
			printNodesSumToS(root.right,s,n);
			/*if(temp1 == newNode){
				n = newNode.next;
				printNodesSumToS(root.left,s,n);
			}
			else if(temp2.next == newNode){
				temp2.next = newNode.next;
				printNodesSumToS(root.left,s,n);
			}
			else{
				printNodesSumToS(root.left,s,n);
			}*/
			printNodesSumToS(root.left,s,n);
		}
		else if(t<root.data){
			printNodesSumToS(root.left,s,n);
			/*if(temp1 == newNode){
				n = newNode.next;
				printNodesSumToS(root.right,s,n);
			}
			else if(temp2.next == newNode){
				temp2.next = newNode.next;
				printNodesSumToS(root.right,s,n);
			}
			else{
				printNodesSumToS(root.right,s,n);
			}*/
			printNodesSumToS(root.right,s,n);
		}
		/*else{
			if(temp2 == null){
				printNodesSumToS(root.right,s,n);
				printNodesSumToS(root.left,s,n);
			}
			else{
				temp2.next = null;
				printNodesSumToS(root.right,s,n);
				printNodesSumToS(root.left,s,n);
			}
		}*/
	}
}
