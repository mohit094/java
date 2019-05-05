package Assignment_BinaryTrees;

import java.util.ArrayList;

import L15.Node;

public class levelWiseLinkedList {
	public static void main(String[] args) {
		
	}
	public static ArrayList<Node<BinaryTreeNode<Integer>>> LLForEachLevel(BinaryTreeNode<Integer> root) {
		
		// Write your code here
		//create array list that will contain head node of all the tree node level wise
		ArrayList<Node<BinaryTreeNode<Integer>>> finalList = new ArrayList<Node<BinaryTreeNode<Integer>>>();
		// this arr will contain all the nodes at a level
		ArrayList<BinaryTreeNode<Integer>> arr = new ArrayList<BinaryTreeNode<Integer>>(); 
		arr.add(root);
		while(arr.size() != 0){
			// created a new arr list that will contain nodes of next level
			ArrayList<BinaryTreeNode<Integer>> arr1 = new ArrayList<BinaryTreeNode<Integer>>();
			// this will be the head of all the tree nodes at a particular level
			//this is the linked list that will contain tree nodes
			Node<BinaryTreeNode<Integer>> head = null;
			//this will contain the the tail of all the tree nodes a
			Node<BinaryTreeNode<Integer>> tail = null;
			
			for(int i =0; i<arr.size(); i++){
				Node<BinaryTreeNode<Integer>> temp = new Node<BinaryTreeNode<Integer>>(arr.get(i));
				//creating linked list of all the tree nodes at a particular level
				if(head == null){
					head = temp;
					tail = temp;
				}
				else{
					tail.next = temp;
					tail = temp;
				}
				//adding values in arr1
				if(arr.get(i).left != null){
					arr1.add(arr.get(i).left);
				}
				if(arr.get(i).right != null){
					arr1.add(arr.get(i).right);
				}
			}
			finalList.add(head);
			//now move the arr to arr1 and perform operation on them
			arr = arr1;
		}
		
		return finalList;
	}
}
