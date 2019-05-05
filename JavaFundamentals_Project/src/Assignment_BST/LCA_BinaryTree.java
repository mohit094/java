package Assignment_BST;

import Assignment_BinaryTrees.BinaryTreeNode;
import L15.Node;
import L17.QueueEmptyException;

import java.util.Queue;
import java.util.LinkedList;

public class LCA_BinaryTree {
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeUse obj = new BinaryTreeUse();
		BinaryTreeNode<Integer> root = obj.takeInputLevelWise();
		nodesSumToS(root,15);
	}
	@SuppressWarnings("null")
	public static void nodesSumToS(BinaryTreeNode<Integer> root, int sum) {
		// Write your code here
		//created a queue and ad each node in it
		Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
		//create a doubly linked list and add all the tree nodes in it in ascending order
		doublyLL<BinaryTreeNode<Integer>> head = null;
		doublyLL<BinaryTreeNode<Integer>> tempNode = null;
		pendingNodes.add(root);
		
		while(!pendingNodes.isEmpty()){
			
			BinaryTreeNode<Integer> tempTreeNode = pendingNodes.remove();
			System.out.println("I am here:- " + tempTreeNode.data);
			if(tempTreeNode.left!=null){
				pendingNodes.add(tempTreeNode.left);
			}
			if(tempTreeNode.right!=null){
				pendingNodes.add(tempTreeNode.right);
			}
			doublyLL<BinaryTreeNode<Integer>> newNode = new doublyLL<BinaryTreeNode<Integer>>(tempTreeNode);
			//always move temp to start of doubly linked list
			tempNode = head;
			if(head == null){
				 System.out.println("Here in if for :- " + newNode.data.data);
				head = newNode;
				tempNode = head;
			}
			else{
				System.out.println("Here in else for :- " + newNode.data.data);
				int flag = 0;
				//check value of newNode in the doublly linked list and insert it at the correct position
				while(tempNode.next!=null){
					if(tempNode.data.data > newNode.data.data){
						if(tempNode.prev == null){
							System.out.println(" Updating Head");
							newNode.prev = tempNode.prev;
							newNode.next = tempNode;
							tempNode.prev = newNode;
							head = newNode;
						}
						else{
							System.out.println("Adding value in ll :- " + newNode.data.data);
							tempNode.prev.next = newNode;
							newNode.prev = tempNode.prev;
							newNode.next = tempNode;
							tempNode.prev = newNode;
						}
						flag = 1;
						break;
					}
					tempNode = tempNode.next;
				}
				//for corner case, if we are at the last node of the linked list
				if(flag == 0){
					if(tempNode.data.data > newNode.data.data){
						if(tempNode.prev == null){
							System.out.println(" Updating Head");
							newNode.prev = tempNode.prev;
							newNode.next = tempNode;
							tempNode.prev = newNode;
							head = newNode;
						}
						else{
							System.out.println("Adding value in ll :- " + newNode.data.data);
							tempNode.prev.next = newNode;
							newNode.prev = tempNode.prev;
							newNode.next = tempNode;
							tempNode.prev = newNode;
						}
						//it means temp node is at head
						
					}
					else{
						System.out.println("Adding value in ll :- " + newNode.data.data);
						tempNode.next = newNode;
						newNode.prev = tempNode;
						newNode.next = null;
					}
				}
			}
		}
		//move tempnode to the tail of the doublly ll
		while(tempNode.next!=null){
			tempNode = tempNode.next;
		}
		doublyLL<BinaryTreeNode<Integer>> print = head;
		while(print!=null){
			System.out.print(print.data.data + " ");
			print = print.next;
		}
		System.out.println();
		doublyLL<BinaryTreeNode<Integer>> front = head;
		doublyLL<BinaryTreeNode<Integer>> tail = tempNode;
		//now check the pair from end and start. If sum is equal return the values and move head forward and tail backward for next pair
		//if sum is less than value then move head forward and check again
		//if sum is more than value then move the tail backward and check agian
		while(front != tail && front.prev != tail){
			if((front.data.data + tail.data.data) == sum){
				System.out.print(front.data.data + " " + tail.data.data);
				System.out.println();
				front = front.next;
				tail = tail.prev;
			}
			else if((front.data.data + tail.data.data) > sum){
				tail = tail.prev;
			}
			else{
				front = front.next;
			}
		}
		
	}
	
}
