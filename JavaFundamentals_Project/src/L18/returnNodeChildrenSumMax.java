package L18;

public class returnNodeChildrenSumMax {
	public static void main(String[] args) throws QueueEmptyException {
		TreeUse obj = new TreeUse();//object of tree use class to use its function
		TreeNode<Integer> root = obj.takeInputLevelWise();
		TreeNode<Integer> maxNode = maxNodeChildrenSum(root);
		System.out.println("This is the answer :- " + maxNode.data);
	}
	public static TreeNode<Integer> maxNodeChildrenSum (TreeNode<Integer> root){
		if(root == null){
			return root;
		}
		//getting the sum of the root node and their children. Assume it to be the max Node.
		TreeNode<Integer> maxNode = root;
		int max = maxNode.data;
		for(int i = 0; i<maxNode.children.size(); i++){
			max = max + maxNode.children.get(i).data;
		}
		// recursively calling the children of root to get their maximum node
		for(int i = 0; i<root.children.size(); i++){
			TreeNode<Integer> maxChildNode = maxNodeChildrenSum(root.children.get(i));
			int maxChild = maxChildNode.data;
			// comparing max node with the max node of children
			for(int j = 0; j<maxChildNode.children.size(); j++){
				maxChild = maxChild + maxChildNode.children.get(j).data;
			}
			if(maxChild>max){
				max = maxChild;
				maxNode = maxChildNode;
			}
		}
		return maxNode;
	}
}
