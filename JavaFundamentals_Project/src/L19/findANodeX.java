package L19;

import L17.QueueEmptyException;

public class findANodeX {
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeUse obj = new BinaryTreeUse();
		BTNode<Integer> root = obj.takeInputLevelWise();
		obj.printLevelWise(root);
		BTNode<Integer> node = findANode(root,20);
		if(node != null){
			System.out.println("Result:- " + node.data);
		}
		else{
			System.out.println("null");
		}
		
	}
	// input data // 1 2 3 -1 10 4 -1 -1 -1 -1 -1
	public static BTNode<Integer> findANode(BTNode<Integer> root, int x){
		if(root == null){
			return null;
		}
		if(root.data == x){
			return root;
		}
		BTNode<Integer> leftNode = findANode(root.left,x);
		BTNode<Integer> rightNode = findANode(root.right,x);
		
		if(leftNode != null){
			return leftNode;
		}
		else if(rightNode != null){
			return rightNode;
		}
		else{
			return null;
		}
	};
}
