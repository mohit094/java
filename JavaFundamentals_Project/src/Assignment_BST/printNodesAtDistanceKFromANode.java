package Assignment_BST;

import Assignment_BinaryTrees.BinaryTreeNode;

class pair3{
	int k;
	boolean isPresent = false;
}
public class printNodesAtDistanceKFromANode {
	public static void main(String[] args) {
		
	}
	public static pair3 nodesAtDistanceK2(BinaryTreeNode<Integer> root, int node, pair3 n) {
		// Write your code here
		if(root == null){
			n.isPresent = false;
			
			return n;
		}
		if(n.isPresent == true){
			if(n.k == 0){
				System.out.println(root.data);
				n.isPresent = false;
				return n;
			}
			else{
				int temp = n.k -1;
				n.k = temp;
				n = nodesAtDistanceK2(root.left,node,n);
				n.k = temp;
				n.isPresent = true;
				n = nodesAtDistanceK2(root.right,node,n);
				return n;
			}
		}
		if(root.data == node){
			int temp = n.k;
			n.k = temp-1;
			n.isPresent = true;
			n = nodesAtDistanceK2(root.left,node,n);
			n.k = temp-1;
			n.isPresent = true;
			n = nodesAtDistanceK2(root.right,node,n);
			n.k = temp-1;
			n.isPresent = true;
			return n;
		}
		int temp = n.k;
		pair3 leftPair = nodesAtDistanceK2(root.left,node,n);
		if(leftPair.isPresent == true){
			if(leftPair.k == 0){
				System.out.println(root.data);
				leftPair.isPresent = true;
				leftPair.k = -1;
				return leftPair;
			}
			else{
				temp = leftPair.k-1;
				leftPair.k = temp;
				pair3 t = nodesAtDistanceK2(root.right,node,leftPair);
				leftPair.k = temp;
				leftPair.isPresent = true;
				return leftPair;
			}
		}
		else{
			n.k = temp;
			pair3 rightPair = nodesAtDistanceK2(root.right,node,n);
			if(rightPair.isPresent == true){
				if(rightPair.k == 0){
					System.out.println(root.data);
					rightPair.isPresent = true;
					rightPair.k = -1;
					return rightPair;
				}
				else{
					temp = rightPair.k-1;
					rightPair.k = temp;
					pair3 t = nodesAtDistanceK2(root.left,node,rightPair);
					rightPair.k = temp;
					rightPair.isPresent = true;
					return rightPair;
				}
			}
			else{
				n.k = temp;
				return n;
			}
		}
	}
}
