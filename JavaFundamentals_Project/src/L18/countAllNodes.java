package L18;

public class countAllNodes {
	public static void main(String[] args) throws QueueEmptyException {
		TreeUse obj = new TreeUse();//object of tree use class to use its function
		TreeNode<Integer> root = obj.takeInputLevelWise();
		int numOfNodes = countNodes(root);
		System.out.println("No. Of Nodes is :- " + numOfNodes);
	}
	public static int countNodes(TreeNode<Integer> root){
		if(root == null){
			return 0;
		}
		int count = 0;
		for(int i = 0; i<root.children.size(); i++){
			int ct = countNodes(root.children.get(i));
			count = count + ct;
		}
		count = count+1;
		return count;
	}
	
	
}
