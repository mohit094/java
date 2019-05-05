package L19;

import L17.QueueEmptyException;

public class mirror_BT {
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeUse obj = new BinaryTreeUse();
		BTNode<Integer> root = BinaryTreeUse.takeInputLevelWise();
		BinaryTreeUse.printLevelWise(root);
		BTNode<Integer> node = mirror(root);
		BinaryTreeUse.printLevelWise(node);
	}
	//input//1 2 3 -1 10 4 -1 -1 -1 -1 -1
	public static BTNode<Integer> mirror(BTNode<Integer> root){
		if(root == null){
			return root;
		}
		root.left = mirror(root.left);
		root.right = mirror(root.right);
		
		BTNode<Integer> temp = root.left;
		root.left = root.right;
		root.right = temp;
		
		return root;
	}
	
}
