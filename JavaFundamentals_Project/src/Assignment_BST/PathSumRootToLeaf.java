package Assignment_BST;

import java.util.ArrayList;

import Assignment_BinaryTrees.BinaryTreeNode;
import Assignment_LinkedList1.Node;

class pair2{
	Node<Integer> head = null;
	Node<Integer> tail = null;
}
//Given a binary tree and a number k, print out all root to leaf paths where the sum of all 
//nodes value is same as the given number k.
//Input format :
//5 6 7 2 3 -1 1 -1 -1 -1 9 -1 -1 -1 -1
//13
//Sample Output 1 :
//5 6 2
//5 7 1
public class PathSumRootToLeaf {
	public static void main(String[] args) {
		
	}
	
	//logic:-
	//here I created a pair class containing a linked list
	//I traverse every node of the tree by adding there value in linked list and updating head and tail of the linked list
	//Also I subtract the value of the tree node from k and pass it to its child using recurssion
	//when reach the leaf node i check if the value of (k - leaf Node) = 0 then print the linked list and return
	public static void rootToLeafPathsSumToK2(BinaryTreeNode<Integer> root, int k, pair2 n) {
		// Write your code here
		if(root == null){
			return;
		}
		Node<Integer> newNode = new Node<Integer>(root.data);
		if(n.head == null){
			n.head = newNode;
			n.tail = newNode;
		}
		else{
			n.tail.next = newNode;
			n.tail = newNode;
		}
		if(root.left == null && root.left == null && k-root.data == 0){
			
			Node<Integer> temp = n.head;
			while(temp!=null){
				System.out.print(temp.data + " ") ;
				temp = temp.next;
			}
			System.out.println();
			return;
		}
		
		k = k - root.data;
		Node<Integer> temp = n.tail;
		rootToLeafPathsSumToK2(root.left,k,n);
		//to remove all the nodes from left subtree in the linked list
		temp.next = null;
		n.tail = temp;
		rootToLeafPathsSumToK2(root.right,k,n);
		
		return;
		
	}
}
