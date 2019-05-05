import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class zigZagTree {
	public static void printZigZag(BinaryTreeNode<Integer> root) {
		Queue<BinaryTreeNode<Integer>> tempQueue = new LinkedList<>();
		Stack <BinaryTreeNode<Integer>> tempStack = new Stack<>();
		tempQueue.add(root);
		int level = 1;
		
		while(!tempQueue.isEmpty()){
			BinaryTreeNode<Integer> temp = tempQueue.remove();
			System.out.print(temp.data + " ");
			if(level%2 == 0){
				if(temp.right!=null){
					tempStack.add(temp.right);
				}
				if(temp.left!=null){
					tempStack.add(temp.left);
				}
			}
			else{
				if(temp.left!=null){
					tempStack.push(temp.left);
				}
				if(temp.right!=null){
					tempStack.push(temp.right);
				}
			}
			if(tempQueue.isEmpty()){
				while(!tempStack.isEmpty()){
					tempQueue.add(tempStack.pop());
				}
				level++;
				System.out.println();
			}
		}
		
	}
}
