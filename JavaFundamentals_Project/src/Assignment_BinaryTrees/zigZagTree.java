package Assignment_BinaryTrees;

import java.util.ArrayList;

public class zigZagTree {
	public static void main(String[] args) {
		
	}
	public static void printZigZag(BinaryTreeNode<Integer> root) {
		// Write your code here		
		ArrayList<BinaryTreeNode<Integer>> arr = new ArrayList<BinaryTreeNode<Integer>>();
		arr.add(root);
		int flag = 0;
		while(arr.size()!=0){
			ArrayList<BinaryTreeNode<Integer>> arr1 = new ArrayList<BinaryTreeNode<Integer>>();
			for(int i = 0 ; i < arr.size(); i++){
				if(arr.get(i).left != null){
					arr1.add(arr.get(i).left);
				}
				if(arr.get(i).right != null){
					arr1.add(arr.get(i).right);
				}
			}
			if(flag == 0){
				for(int i = 0; i < arr.size(); i++){
					System.out.print(arr.get(i).data + " ");
				}
				flag = 1;
				System.out.println();
			    arr = arr1;
			    continue;
			}
			if(flag == 1){
				for(int i = arr.size()-1; i >= 0; i--){
					System.out.print(arr.get(i).data + " ");
				}
				flag = 0;
				System.out.println();
			    arr = arr1;
			}
		}

	}
}
