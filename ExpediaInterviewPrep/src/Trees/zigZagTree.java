package Trees;

import java.util.ArrayList;

public class zigZagTree {
	public static void printZigZag(BinaryTreeNode<Integer> root) {
		ArrayList<BinaryTreeNode<Integer>> arr1 = new ArrayList<BinaryTreeNode<Integer>>();
		arr1.add(root);
		int flag = 0;
		while(arr1.size() != 0){
			ArrayList<BinaryTreeNode<Integer>> arr2 = new ArrayList<BinaryTreeNode<Integer>>();
			if(flag == 0){
				for(int i = arr1.size()-1; i>=0; i--){
					if(arr2.get(i).left != null){
						arr2.add(arr1.get(i).left);
					}
					if(arr2.get(i).right != null){
						arr2.add(arr1.get(i).right);
					}
					System.out.print(arr1.get(i).data + " ");
				}
				flag = 1;
				arr1 = arr2;
				continue;
			}
			else if(flag ==1){
				for(int i = arr1.size()-1; i>=0; i--){
					if(arr2.get(i).right != null){
						arr2.add(arr1.get(i).right);
					}
					if(arr2.get(i).left != null){
						arr2.add(arr1.get(i).left);
					}
					System.out.print(arr1.get(i).data + " ");
				}
				flag = 0;
				arr1 = arr2;
				continue;
			}
		}
	}
}
