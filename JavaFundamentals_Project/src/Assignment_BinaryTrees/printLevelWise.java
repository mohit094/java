package Assignment_BinaryTrees;

import java.util.ArrayList;

public class printLevelWise {
	public static void main(String[] args) {
		
	}
	public static void printLevelWise2(BinaryTreeNode<Integer> root){
		
		// Write your code here
		ArrayList<BinaryTreeNode<Integer>> arr = new ArrayList<BinaryTreeNode<Integer>>();
		arr.add(root);
		while(arr.size()!=0){
			ArrayList<BinaryTreeNode<Integer>> arr1 = new ArrayList<BinaryTreeNode<Integer>>();
			for(int i = 0 ; i < arr.size(); i++){
				if(arr.get(i).left != null){
					arr1.add(arr.get(i).left);
				}
				if(arr.get(i).right != null){
					arr1.add(arr.get(i).right);
				}
				System.out.print(arr.get(i).data + " ");
			}
			System.out.println();
			arr = arr1;
		}

	}
}
