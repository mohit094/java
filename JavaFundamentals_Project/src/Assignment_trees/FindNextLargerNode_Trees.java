package Assignment_trees;


import L19.QueueEmptyException;
import L19.QueueUsingLL;

public class FindNextLargerNode_Trees {
	public static void main(String[] args) throws Assignment_trees.QueueEmptyException, QueueEmptyException {
		TreeUse obj = new TreeUse();//object of tree use class to use its function
		TreeNode<Integer> root = obj.takeInputLevelWise();
		TreeNode<Integer> node = findNextLargerNode(root,3);
		System.out.println("Result" + node.data);
	}
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n) throws QueueEmptyException{
		// Write your code here
		if(root == null){
			return root;
		}
		//
		TreeNode<Integer> maxNode = null;
		if(root.data > n){
			maxNode = root;
		}
	
		for(int i = 0; i<root.children.size(); i++){
			TreeNode<Integer> current = findNextLargerNode(root.children.get(i),n);
			if(current!=null){
				if(maxNode == null || current.data<maxNode.data){
					maxNode = current;
				}
			}
		}
		
		return maxNode;
	}
}
