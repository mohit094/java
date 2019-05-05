package L19;

import L17.QueueEmptyException;

public class printAllNodesBW_xAndy_BST {
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeUse obj = new BinaryTreeUse();
		BTNode<Integer> root = BinaryTreeUse.takeInputLevelWise();
		BinaryTreeUse.printLevelWise(root);
		printNodes(root,5,10);
	}
	public static void printNodes(BTNode<Integer> root, int x, int y){
		if(root == null){
			return;
		}
		if(root.data>x && root.data<y){
			System.out.println("Answer is :- " + root.data);
			printNodes(root.left,x,y);
			printNodes(root.right,x,y);			
		}
		else if(root.data<=x){
			printNodes(root.right,x,y);
		}
		else if(root.data>=y){
			printNodes(root.left,x,y);
		}
	}
}
